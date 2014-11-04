package waiprprog.output;

import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import waiprprog.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        WaiprLexer lex = new WaiprLexer(new ANTLRFileStream("C:\\Users\\Gyula\\Documents\\antlr\\waipr\\testfiles\\idea_statusesonly", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        WaiprParser g = new WaiprParser(tokens, 49100, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}