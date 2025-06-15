package visitor;

import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import parser.MensagensBaseVisitor;
import parser.MensagensParser;
import utils.Utils;

/**
 *
 * @author Prof. Dr. David Buzatto
 */
public class MensagensVisitorImpl extends MensagensBaseVisitor<String> {

    private JTextPane textPane;
    
    private boolean negritoAtivado;
    private boolean italicoAtivado;
    private Color corAtual;
    private SimpleAttributeSet attrSet;
    
    public MensagensVisitorImpl( JTextPane textPane ) {
        super();
        this.textPane = textPane;
        this.negritoAtivado = false;
        this.italicoAtivado = false;
        this.corAtual = Color.BLACK;
        this.attrSet = new SimpleAttributeSet();
    }
    
    @Override
    public String visitInicio( MensagensParser.InicioContext ctx ) {
        visit( ctx.getChild( 0 ) );
        return "";
    }

    @Override
    public String visitMensagemNegrito( MensagensParser.MensagemNegritoContext ctx ) {
        negritoAtivado = true;
        visit( ctx.getChild( 1 ) );
        negritoAtivado = false;
        return "";
    }
    
    @Override
    public String visitMensagemItalico( MensagensParser.MensagemItalicoContext ctx ) {
        italicoAtivado = true;
        visit( ctx.getChild( 1 ) );
        italicoAtivado = false;
        return "";
    }

    @Override
    public String visitMensagemCor( MensagensParser.MensagemCorContext ctx ) {
        corAtual = Utils.processarCor( ctx.COR_ESQ().toString() );
        visit( ctx.getChild( 1 ) );
        corAtual = Color.BLACK;
        return "";
    }

    @Override
    public String visitPartes( MensagensParser.PartesContext ctx ) {
        for ( int i = 0; i < ctx.getChildCount(); i++ ) {
            visit( ctx.getChild( i ) );
        }
        return "";
    }
    
    @Override
    public String visitTexto( MensagensParser.TextoContext ctx ) {
        atualizarAttributeSet();
        Utils.adicionarTextoFormatado( ctx.getText(), textPane, attrSet );
        return "";
    }
    
    private void atualizarAttributeSet() {
        StyleConstants.setBold( attrSet, negritoAtivado );
        StyleConstants.setItalic( attrSet, italicoAtivado );
        StyleConstants.setForeground( attrSet, corAtual );
    }
    
}
