package telran.introduction;

import static org.junit.jupiter.api.Assertions.*;
import static telran.introduction.Calculations.*;

import org.junit.jupiter.api.Test;

public class CalculationsTest {
    @Test
    void sumTest() {
        assertEquals(4, sum(2, 2));
    }
    @Test
    void multiplyTest() {
        assertEquals(12, multiply(2, 6));
    }
    @Test
    void divideTest() {
        assertEquals(1, divide(6, 6));
    }
    @Test
    void subtracTest() {
        assertEquals(7, subtract(13, 6));
    }
    @Test
    void sumOfDigitsTest() {
        assertEquals(9, sumOfDigits(135));
    }
    @Test
void maxDigitTest() {
    assertEquals(5, maxDigit(13235));
     }
     @Test
void isDividedOnTest() {
    assertEquals(true, isDividedOn(10, 5));
     }
}

