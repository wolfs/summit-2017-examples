package com.example;

import org.acme.test.TestLexer;
import org.acme.test.TestParser;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TestLexer lexer = new TestLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TestParser parser = new TestParser(tokens);
        try {
            parser.list();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}
