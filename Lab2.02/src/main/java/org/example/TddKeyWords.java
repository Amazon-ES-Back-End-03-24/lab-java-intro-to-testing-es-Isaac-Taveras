package org.example;

import java.util.Arrays;
import java.util.List;

public class TddKeyWords {

    private String[] javaKeywordsArray = {"abstract", "continue", "for", "new", "switch", "assert", "default", "goto",
            "package", "synchronized", "boolean", "do", "if", "private", "this", "break", "double", "implements",
            "protected", "throw", "byte", "else", "import", "public","throws", "case", "enum", "instanceof", "return",
            "transient", "catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void",
            "class", "finally", "long", "strictfp", "volatile", "const", "float", "native", "super", "while"};

    private List<String> javaKeyWordsList = Arrays.asList(javaKeywordsArray);

    public boolean containsJavakeyWord(String input){
        if(input == null) return false;

        String[] words = input.split("\\W+");

        for(String keyWord: words) {
            if (javaKeyWordsList.contains(keyWord)) return true;
        }
        return false;
    }
}
