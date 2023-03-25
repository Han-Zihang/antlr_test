// Generated from JsonLang.txt by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JsonLangParser}.
 */
public interface JsonLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JsonLangParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(JsonLangParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonLangParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(JsonLangParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonLangParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(JsonLangParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonLangParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(JsonLangParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonLangParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(JsonLangParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonLangParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(JsonLangParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonLangParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(JsonLangParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonLangParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(JsonLangParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonLangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JsonLangParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonLangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JsonLangParser.ValueContext ctx);
}