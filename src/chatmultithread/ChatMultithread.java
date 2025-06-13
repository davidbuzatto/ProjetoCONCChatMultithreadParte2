package chatmultithread;

/**
 *
 * @author Prof. Dr. David Buzatto
 */
public class ChatMultithread {
    
    public static void main( String[] args ) throws Exception {
        
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
    
}
