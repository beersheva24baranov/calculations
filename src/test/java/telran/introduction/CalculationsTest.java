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
}
