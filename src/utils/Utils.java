package utils;

import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author Prof. Dr. David Buzatto
 */
public class Utils {
    
    public static void adicionarTextoFormatado( String texto, JTextPane textPane, SimpleAttributeSet attrSet ) {
        
        Document document = textPane.getDocument();
        
        try { 
            document.insertString( document.getLength(), texto, attrSet );
        } catch ( BadLocationException exc ) {
            exc.printStackTrace();
        }
        
    }
    
    public static void adicionarTextoNaoFormatado( String texto, JTextPane textPane ) {
        
        Document document = textPane.getDocument();
        
        try { 
            document.insertString( document.getLength(), texto, new SimpleAttributeSet() );
        } catch ( BadLocationException exc ) {
            exc.printStackTrace();
        }
        
    }
    
    public static Color processarCor( String texto ) {
        
        int ini = texto.indexOf( "#" );
        int fim = texto.indexOf( "]" );
        
        if ( ini >= 0 && fim >= 0 && ini <= fim ) {
            String hex = texto.substring( ini + 1, fim );
            return new Color( Integer.parseInt( hex, 16 ) );
        }

        return Color.BLUE;
        
    }
    
    public static void mostrarDadosAnalise(
            CommonTokenStream tokens,
            Parser parser,
            ParseTree tree,
            boolean mostrarTestRig ) {

        if ( tokens != null ) {
            for ( Token t : tokens.getTokens() ) {
                System.out.println( t );
            }
        }

        if ( parser != null && tree != null ) {

            System.out.println( tree.getText() );
            System.out.println( tree.toStringTree( parser ) );

            if ( mostrarTestRig ) {
                Trees.inspect( tree, parser );
            }

        }

    }
    
}
