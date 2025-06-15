package visitor;

import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import parser.MensagensBaseVisitor;
import parser.MensagensParser;
import utils.Utils;

/**
 *
 * @author Prof. Dr. David Buzatto
 */
public class MensagensVisitorImpl extends MensagensBaseVisitor<Void> {

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
    public Void visitInicio( MensagensParser.InicioContext ctx ) {
        visit( ctx.mensagem() );
        return null;
    }

    @Override
    public Void visitMensagemNegrito( MensagensParser.MensagemNegritoContext ctx ) {
        negritoAtivado = true;
        visit( ctx.mensagem() );
        negritoAtivado = false;
        return null;
    }
    
    @Override
    public Void visitMensagemItalico( MensagensParser.MensagemItalicoContext ctx ) {
        italicoAtivado = true;
        visit( ctx.mensagem() );
        italicoAtivado = false;
        return null;
    }

    @Override
    public Void visitMensagemCor( MensagensParser.MensagemCorContext ctx ) {
        corAtual = Utils.processarCor( ctx.COR_ESQ().toString() );
        visit( ctx.mensagem() );
        corAtual = Color.BLACK;
        return null;
    }

    @Override
    public Void visitPartes( MensagensParser.PartesContext ctx ) {
        visitChildren( ctx );
        return null;
    }
    
    @Override
    public Void visitTexto( MensagensParser.TextoContext ctx ) {
        atualizarAttributeSet();
        Utils.adicionarTextoFormatado( ctx.getText(), textPane, attrSet );
        return null;
    }
    
    private void atualizarAttributeSet() {
        StyleConstants.setBold( attrSet, negritoAtivado );
        StyleConstants.setItalic( attrSet, italicoAtivado );
        StyleConstants.setForeground( attrSet, corAtual );
    }
    
}
