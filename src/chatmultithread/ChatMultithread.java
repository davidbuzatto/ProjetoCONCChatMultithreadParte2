package chatmultithread;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.MensagensLexer;
import parser.MensagensParser;
import utils.Utils;
import visitor.MensagensVisitorImpl;

/**
 *
 * @author Prof. Dr. David Buzatto
 */
public class ChatMultithread {
    
    public static void main( String[] args ) throws Exception {
        testeParser();
        testeChat();
    }
    
    private static void testeChat() {
        
        int porta = 8080;
        String host = "localhost";
        
        JanelaServidor s = new JanelaServidor( porta );
        s.setVisible( true );
        
        JanelaCliente c1 = new JanelaCliente( "João", host, porta );
        c1.setVisible( true );
        c1.setLocation( s.getLocation().x - c1.getBounds().width, c1.getLocation().y );
        
        JanelaCliente c2 = new JanelaCliente( "Maria", host, porta );
        c2.setVisible( true );
        c2.setLocation( s.getLocation().x + s.getBounds().width, c2.getLocation().y );
        
    }
    
    private static void testeParser() {
        
        //String mensagem = "teste";
        //String mensagem = "[b][b]teste[/b][/b]";
        //String mensagem = "[i][i]teste[/i][/i]";
        //String mensagem = "[i][b]teste[/b][/i]";
        //String mensagem = "a[i]a[b]teste[/b]a[/i]a";
        String mensagem = "a[i]a [b]t e[c #0099CC]teste[/c]e[/b]a[/i]a";
        //String mensagem = "[c #001144]teste[/c]";
        
        MensagensLexer lexer = new MensagensLexer(
                CharStreams.fromString( mensagem ) );
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        MensagensParser parser = new MensagensParser( tokens );
        ParseTree tree = parser.inicio();
        
        JFrame frame = new JFrame();
        JTextPane textPane = new JTextPane();
        textPane.setFont( textPane.getFont().deriveFont( 40.0f ) );
        
        frame.add( new JScrollPane( textPane ), BorderLayout.CENTER );
        frame.setSize( 500, 500 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setLocationRelativeTo( null );
        
        MensagensVisitorImpl visitor = new MensagensVisitorImpl( textPane );
        visitor.visit( tree );
        frame.setVisible( true );
        
        Utils.mostrarDadosAnalise( null, parser, tree, true );
        
    }
    
}
