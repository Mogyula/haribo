/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package waiprprog;

/**
 *
 * @author Gyula
 */
import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.TreeAdaptor;

public class WaiprProg {

    public static void main(String[] args) {
      try{
        ANTLRFileStream fs = new ANTLRFileStream("C:\\Users\\Gyula\\Documents\\NetBeansProjects\\waiprProg\\src\\waiprprog\\idea_statusesonly");
        WaiprLexer lexer = new WaiprLexer(fs);
        TokenRewriteStream tokens = new TokenRewriteStream(lexer);
        WaiprParser parser = new WaiprParser(tokens);
        parser.setTreeAdaptor(adaptor);
        WaiprParser.prog_return ret = parser.prog();
        CommonTree tree = (CommonTree)ret.getTree();
        printTree(tree, 0);
        }catch(Exception e){
            System.err.println(e.toString());
        }   
    }
    
    public static void printTree(CommonTree t, int indent) {
	if ( t != null ) {
		StringBuffer sb = new StringBuffer(indent);
		
		if (t.getParent() == null){
			System.out.println(sb.toString() + t.getText().toString());           
		}
		for ( int i = 0; i < indent; i++ )
			sb = sb.append("   ");
		for ( int i = 0; i < t.getChildCount(); i++ ) {
			System.out.println(sb.toString() + t.getChild(i).toString() + " " + t.getChild(i).getType());
			printTree((CommonTree)t.getChild(i), indent+1);
		}
	}
}
    
    static final TreeAdaptor adaptor = new CommonTreeAdaptor() {
        @Override
	public Object create(Token payload) {
		return new CommonTree(payload);
	}
    };
            
}
