package visitor;

import java.awt.Color;
import java.util.ArrayDeque;
import java.util.Deque;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import parser.MensagensBaseVisitor;
import parser.MensagensParser;
import utils.Utils;

/**
 * Exemplo de visitor.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class MensagensVisitorImpl extends MensagensBaseVisitor<Void> {
    
    private JTextPane textPane;
    private SimpleAttributeSet attrSet;
    
    private int contNegrito;
    private int contItalico;
    private Deque<Color> pilhaCor;
    
    public MensagensVisitorImpl( JTextPane textPane ) {
        this.textPane = textPane;
        this.attrSet = new SimpleAttributeSet();
        this.pilhaCor = new ArrayDeque<>();
        this.pilhaCor.push( Color.BLACK );
    }
    
    @Override
    public Void visitInicio( MensagensParser.InicioContext ctx ) {
        visit( ctx.mensagem() );
        return null;
    }

    @Override
    public Void visitMensagemNegrito( MensagensParser.MensagemNegritoContext ctx ) {
        contNegrito++;
        visit( ctx.mensagem() );
        contNegrito--;
        return null;
    }
    
    @Override
    public Void visitMensagemItalico( MensagensParser.MensagemItalicoContext ctx ) {
        contItalico++;
        visit( ctx.mensagem() );
        contItalico--;
        return null;
    }

    @Override
    public Void visitMensagemCor( MensagensParser.MensagemCorContext ctx ) {
        pilhaCor.push( Utils.processarCor( ctx.COR_ESQ().toString() ) );
        visit( ctx.mensagem() );
        pilhaCor.pop();
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
        StyleConstants.setBold( attrSet, contNegrito != 0 );
        StyleConstants.setItalic( attrSet, contItalico != 0 );
        StyleConstants.setForeground( attrSet, pilhaCor.peek() );
    }
    
}
