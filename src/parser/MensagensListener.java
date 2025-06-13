// Generated from gramatica/Mensagens.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MensagensParser}.
 */
public interface MensagensListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MensagensParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(MensagensParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link MensagensParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(MensagensParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mensagemNegrito}
	 * labeled alternative in {@link MensagensParser#mensagem}.
	 * @param ctx the parse tree
	 */
	void enterMensagemNegrito(MensagensParser.MensagemNegritoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mensagemNegrito}
	 * labeled alternative in {@link MensagensParser#mensagem}.
	 * @param ctx the parse tree
	 */
	void exitMensagemNegrito(MensagensParser.MensagemNegritoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mensagemItalico}
	 * labeled alternative in {@link MensagensParser#mensagem}.
	 * @param ctx the parse tree
	 */
	void enterMensagemItalico(MensagensParser.MensagemItalicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mensagemItalico}
	 * labeled alternative in {@link MensagensParser#mensagem}.
	 * @param ctx the parse tree
	 */
	void exitMensagemItalico(MensagensParser.MensagemItalicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mensagemCor}
	 * labeled alternative in {@link MensagensParser#mensagem}.
	 * @param ctx the parse tree
	 */
	void enterMensagemCor(MensagensParser.MensagemCorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mensagemCor}
	 * labeled alternative in {@link MensagensParser#mensagem}.
	 * @param ctx the parse tree
	 */
	void exitMensagemCor(MensagensParser.MensagemCorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partes}
	 * labeled alternative in {@link MensagensParser#mensagem}.
	 * @param ctx the parse tree
	 */
	void enterPartes(MensagensParser.PartesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partes}
	 * labeled alternative in {@link MensagensParser#mensagem}.
	 * @param ctx the parse tree
	 */
	void exitPartes(MensagensParser.PartesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MensagensParser#texto}.
	 * @param ctx the parse tree
	 */
	void enterTexto(MensagensParser.TextoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MensagensParser#texto}.
	 * @param ctx the parse tree
	 */
	void exitTexto(MensagensParser.TextoContext ctx);
}