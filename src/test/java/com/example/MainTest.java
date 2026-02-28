package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testFiboZero() {
        int result = Main.fibonacci(0);
        System.out.println("Lets run: fibonacci(0) -> expected 0, got " + result);
        assertEquals(0, result);
    }

    @Test
    void testFiboOne() {
        int result = Main.fibonacci(1);
        System.out.println("Lets run: fibonacci(1) -> expected 1, got " + result);
        assertEquals(1, result);
    }

    @Test
    void testFiboTen() {
        int result = Main.fibonacci(10);
        System.out.println("Lets run: fibonacci(10) -> expected 55, got " + result);
        assertEquals(55, result);
    }
} // End Main Test

