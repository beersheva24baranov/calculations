package telran.introduction;

import static org.junit.jupiter.api.Assertions.*;
import static telran.introduction.Calculations.*;

import org.junit.jupiter.api.Test;

public class CalculationsTest {
    @Test
    void sumTest() {
        assertEquals(4, sum(2, 2));
        assertEquals(0, sum(-2, 2));
        assertEquals(-18, sum(-20, 2));
    }
    @Test
    void multiplyTest() {
        assertEquals(12, multiply(2, 6));
        assertEquals(-18, multiply(-3, 6));
        assertEquals(0, multiply(2, 0));
    }
    @Test
    void divideTest() {
        assertEquals(1, divide(6, 6));
        assertEquals(0, divide(6, 0));
        assertEquals(-1, divide(-6, 6));
    }
    @Test
    void subtracTest() {
        assertEquals(7, subtract(13, 6));
        assertEquals(-5, subtract(1, 6));
        assertEquals(13, subtract(13, 0));
    }
    @Test
    void sumOfDigitsTest() {
        assertEquals(9, sumOfDigits(135));
        assertEquals(24, sumOfDigits(8835));
    }
    @Test
void maxDigitTest() {
    assertEquals(5, maxDigit(13235));
    assertEquals(7, maxDigit(17235));
    assertEquals(8, maxDigit(88888));
     }
     @Test
void isDividedOnTest() {
    assertEquals(true, isDividedOn(10, 5));
    assertEquals(false, isDividedOn(10, 11));
    assertEquals(false, isDividedOn(10, 0));
     }
}

