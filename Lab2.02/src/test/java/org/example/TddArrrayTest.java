package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TddArrrayTest {

    @Test
    @DisplayName("Test array impares con n = 0")
    void TestImputZero(){
        TddArray tddArray = new TddArray();

        String result = Arrays.toString(new int[]{1, 3, 5});
        String test = Arrays.toString(tddArray.imparesArray(5));

        assertEquals(result, test);
        System.out.println("TestImputZero OK!");
    }

    @Test
    @DisplayName("Test array impares con n = 5")
    void TestImputFive(){
        TddArray tddArray = new TddArray();

        String result = Arrays.toString(new int[]{1, 3, 5});
        String test = Arrays.toString(tddArray.imparesArray(5));

        assertEquals(result, test);
        System.out.println("TestImputZero OK!");
    }

    @Test
    @DisplayName("Test array impares con n = 10")
    void TestImput10(){
        TddArray tddArray = new TddArray();

        String result = Arrays.toString(new int[]{1, 3, 5, 7, 9});
        String test = Arrays.toString(tddArray.imparesArray(10));

        assertEquals(result, test);
        System.out.println("TestImputZero OK!");
    }
}
