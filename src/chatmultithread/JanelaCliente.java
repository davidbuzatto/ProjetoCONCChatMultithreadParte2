package chatmultithread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.text.ParseException;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import listener.MensagensListenerImpl;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.MensagensLexer;
import parser.MensagensParser;
import utils.Utils;
import visitor.MensagensVisitorImpl;

/**
 *
 * @author Prof. Dr. David Buzatto
 */
public class JanelaCliente extends javax.swing.JFrame {
    
    private String nome;
    
    private boolean conectado;
    
    private int porta;
    private InetAddress inetAddress;
    private Socket socket;
    
    private BufferedReader reader;
    private PrintWriter writer;
    
    /**
     * Creates new form JanelaCliente
     */
    public JanelaCliente( String nome, String host, int porta ) {
        
        initComponents();
        getRootPane().setDefaultButton( btnEnviar );
        
        try {
            this.inetAddress = InetAddress.getByName( host );
            this.porta = porta;
        } catch ( IOException exc ) {
            exc.printStackTrace();
        }
        
    }

    private void conectar() throws IOException {
        
        if ( !conectado ) {
            
            socket = new Socket( inetAddress, porta );
            reader = new BufferedReader( new InputStreamReader( socket.getInputStream() ) );
            writer = new PrintWriter( socket.getOutputStream() );
            conectado = true;
            
            // thread de dados
            new Thread( () -> {
                
                while ( conectado ) {
                    try {
                        
                        while ( reader.ready() ) {
                            
                            String dados = reader.readLine();
                            
                            try { 
                                analisarMensagem( dados, areaMensagens, TipoProcessamento.VISITOR );
                            } catch ( ParseException exc ) {
                                Utils.adicionarTextoNaoFormatado( dados + "\n", areaMensagens );
                                exc.printStackTrace();
                            }
                            
                            Utils.adicionarTextoNaoFormatado( "\n", areaMensagens );
                            
                        }
                        
                        Thread.sleep( 1000 );
                        
                    } catch ( InterruptedException | IOException exc ) {
                        exc.printStackTrace();
                    }
                }
                
            }).start();
        }
        
    }
    
    public static void analisarMensagem( String mensagem, JTextPane textPane, TipoProcessamento tipo ) throws ParseException {
        
        MensagensLexer lexer = new MensagensLexer(
                CharStreams.fromString( mensagem ) );
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        MensagensParser parser = new MensagensParser( tokens );
        ParseTree tree = parser.inicio();
        
        if ( tipo == TipoProcessamento.LISTENER ) {
            ParseTreeWalker.DEFAULT.walk( new MensagensListenerImpl( textPane ), tree );
        } else if ( tipo == TipoProcessamento.VISITOR ) {
            MensagensVisitorImpl visitor = new MensagensVisitorImpl( textPane );
            visitor.visit( tree );
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnConectar = new javax.swing.JButton();
        scrollAreaMensagens = new javax.swing.JScrollPane();
        areaMensagens = new javax.swing.JTextPane();
        lblMensagem = new javax.swing.JLabel();
        txtMensagem = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente");

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNome.setText("Nome:");

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btnConectar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        areaMensagens.setEditable(false);
        areaMensagens.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        scrollAreaMensagens.setViewportView(areaMensagens);

        lblMensagem.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblMensagem.setText("Mensagem:");

        txtMensagem.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btnEnviar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollAreaMensagens)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMensagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnviar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConectar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConectar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollAreaMensagens, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMensagem)
                    .addComponent(btnEnviar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        SwingUtilities.invokeLater( () -> {
            writer.write( String.format( "%s: %s\n", nome, txtMensagem.getText() ) );
            writer.flush();
            txtMensagem.setText( "" );
        });
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        
        this.nome = txtNome.getText();
        
        try {
            if ( !conectado ) {
                conectar();
                txtNome.setEnabled( false );
                btnConectar.setEnabled( false );
                setTitle( String.format( "%s: %s", getTitle(), nome ) );
            }
        } catch ( IOException exc ) {
            exc.printStackTrace();
        }
        
    }//GEN-LAST:event_btnConectarActionPerformed

    public static void main( String[] args ) {
        new JanelaCliente( "Teste", "localhost", 8080 ).setVisible( true );
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane areaMensagens;
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblNome;
    private javax.swing.JScrollPane scrollAreaMensagens;
    private javax.swing.JTextField txtMensagem;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
