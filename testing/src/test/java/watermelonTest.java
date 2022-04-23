import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class watermelonTest {

    @Test
    void canEven() {
        int kilos=1;

        assertFalse(watermelon.CanEven(kilos));
    }
    @Test
    void canEven1() {
        int kilos=100;

        assertTrue(watermelon.CanEven(kilos));
    }
    @Test
    void canEven2() {
        int kilos=8;

        assertTrue(watermelon.CanEven(kilos));
    }
    @Test
    void canEven3() {
        int kilos=2;

        assertFalse(watermelon.CanEven(kilos));
    }
    @Test
    void canEven4() {
        int kilos=25;

        assertFalse(watermelon.CanEven(kilos));
    }
    @Test
    void canEven5() {
        int kilos=25;

        assertFalse(watermelon.CanEven(kilos));
    }

    @Test
    void canEven6() {
        int kilos=25;

        assertFalse(watermelon.CanEven(kilos));
    }

    @Test
    void canEven7() {
        int kilos=101;
        assertThrows(IllegalArgumentException.class, () -> {
            watermelon.CanEven(kilos);
        });
    }
    @Test
    void canEven8() {
        int kilos=0;
        assertThrows(IllegalArgumentException.class, () -> {
            watermelon.CanEven(kilos);
        });
    }
}