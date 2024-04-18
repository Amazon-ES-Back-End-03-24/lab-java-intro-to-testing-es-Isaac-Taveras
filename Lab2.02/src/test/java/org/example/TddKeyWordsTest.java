package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TddKeyWordsTest {

    @Test
    @DisplayName("Test TddKeyWords Null")
    void TestKeyWord_Null(){
        TddKeyWords tddKeyWords = new TddKeyWords();

        assertFalse(tddKeyWords.containsJavakeyWord(null));
        System.out.println("TestKeyWord_Null OK!");
    }

    @Test
    @DisplayName("Test TddKeyWords False")
    void TestKeyWord_False(){
        TddKeyWords tddKeyWords = new TddKeyWords();

        assertFalse(tddKeyWords.containsJavakeyWord("I love breakdance"));
        System.out.println("TestKeyWord_False OK!");
    }

    @Test
    @DisplayName("Test TddKeyWords True")
    void TestKeyWord_True(){
        TddKeyWords tddKeyWords = new TddKeyWords();

        assertTrue(tddKeyWords.containsJavakeyWord("Don't break my heart"));
        System.out.println("TestKeyWord_True OK!");
    }
}
