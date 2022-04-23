import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YoungPhysTest {

    @Test
    void checkeq() {
        int lines = 2;
        int[] input = {1, 2, 2, 1, 2, 2};
        assertFalse(YoungPhys.checkeq(lines, input));
    }

    @Test
    void checkeq1() {
        int lines = 2;
        int[] input = {1, 2, 2, -1, -2, -2};
        assertTrue(YoungPhys.checkeq(lines, input));
    }

    @Test
    void checkeq2() {
        int lines = 2;
        int[] input = {1, 2, 2, -1, -2};
        assertThrows(IllegalArgumentException.class, () -> {
            YoungPhys.checkeq(lines, input);
        });
    }
    @Test
    void checkeq3() {
        int lines = 1;
        int[] input = {1, 2, 2, -1, -2,-2};
        assertThrows(IllegalArgumentException.class, () -> {
            YoungPhys.checkeq(lines, input);
        });
    }
    @Test
    void checkeq4() {
        int lines = 2;
        int[] input = {100, 100, 100, 101, -2,-2};
        assertThrows(IllegalArgumentException.class, () -> {
            YoungPhys.checkeq(lines, input);
        });
    }
    @Test
    void checkeq5() {
        int lines = 2;
        int[] input = {-101, 2, 2, -1, -2,-2};
        assertThrows(IllegalArgumentException.class, () -> {
            YoungPhys.checkeq(lines, input);
        });
    }
    @Test
    void checkeq6() {
        int lines = 0;
        int[] input = {1, 2, 2, -1, -2,-2};
        assertThrows(IllegalArgumentException.class, () -> {
            YoungPhys.checkeq(lines, input);
        });
    }
    @Test
    void checkeq7() {
        int lines = 101;
        int[] input = {1, 2, 2, -1, -2,-2};
        assertThrows(IllegalArgumentException.class, () -> {
            YoungPhys.checkeq(lines, input);
        });
    }
}