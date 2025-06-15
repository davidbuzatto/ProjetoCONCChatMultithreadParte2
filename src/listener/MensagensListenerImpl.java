package listener;

import java.awt.Color;
import java.util.ArrayDeque;
import java.util.Deque;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import parser.MensagensListener;
import parser.MensagensParser;
import utils.Utils;

/**
 * Exemplo de ouvinte.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class MensagensListenerImpl implements MensagensListener {

    private JTextPane textPane;
    private SimpleAttributeSet attrSet;
    
    private int contNegrito;
    private int contItalico;
    private Deque<Color> pilhaCor;
    
    public MensagensListenerImpl( JTextPane textPane ) {
        this.textPane = textPane;
        this.attrSet = new SimpleAttributeSet();
        this.pilhaCor = new ArrayDeque<>();
        this.pilhaCor.push( Color.BLACK );
    }
    
    @Override
    public void enterInicio( MensagensParser.InicioContext ctx ) {
    }

    @Override
    public void exitInicio( MensagensParser.InicioContext ctx ) {
    }

    @Override
    public void enterMensagemNegrito( MensagensParser.MensagemNegritoContext ctx ) {
        contNegrito++;
    }

    @Override
    public void exitMensagemNegrito( MensagensParser.MensagemNegritoContext ctx ) {
        contNegrito--;
    }

    @Override
    public void enterMensagemItalico( MensagensParser.MensagemItalicoContext ctx ) {
        contItalico++;
    }

    @Override
    public void exitMensagemItalico( MensagensParser.MensagemItalicoContext ctx ) {
        contItalico--;
    }

    @Override
    public void enterMensagemCor( MensagensParser.MensagemCorContext ctx ) {
        pilhaCor.push( Utils.processarCor( ctx.COR_ESQ().toString() ) );
    }

    @Override
    public void exitMensagemCor( MensagensParser.MensagemCorContext ctx ) {
        pilhaCor.pop();
    }

    @Override
    public void enterPartes( MensagensParser.PartesContext ctx ) {
    }

    @Override
    public void exitPartes( MensagensParser.PartesContext ctx ) {
    }

    @Override
    public void enterTexto( MensagensParser.TextoContext ctx ) {
    }

    @Override
    public void exitTexto( MensagensParser.TextoContext ctx ) {
        atualizarAttributeSet();
        Utils.adicionarTextoFormatado( ctx.getText(), textPane, attrSet );
    }

    @Override
    public void visitTerminal( TerminalNode tn ) {
    }

    @Override
    public void visitErrorNode( ErrorNode en ) {
    }

    @Override
    public void enterEveryRule( ParserRuleContext prc ) {        
    }

    @Override
    public void exitEveryRule( ParserRuleContext prc ) {
    }
    
    private void atualizarAttributeSet() {
        StyleConstants.setBold( attrSet, contNegrito != 0 );
        StyleConstants.setItalic( attrSet, contItalico != 0 );
        StyleConstants.setForeground( attrSet, pilhaCor.peek() );
    }
    
}
