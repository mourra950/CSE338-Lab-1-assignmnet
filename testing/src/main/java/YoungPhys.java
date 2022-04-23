import java.util.*;

public class YoungPhys {

    public static boolean checkeq(int lines, int[] inputnumbers) {
        int x = 0, y = 0, z = 0;
        if (lines < 0 || lines > 100)
            throw new IllegalArgumentException("n range is between 1 and 100 included");
        if (inputnumbers.length != lines * 3)
            throw new IllegalArgumentException("the number of inputs must be number of lines *3");
        for (int inputnumber : inputnumbers)
            if (inputnumber > 100 || inputnumber < -100)
                throw new IllegalArgumentException("the force range is between 100 and -100 inclusive");
        for (int i = 0; i < lines * 3; i += 3) {

            x += inputnumbers[i];
            y += inputnumbers[i + 1];
            z += inputnumbers[i + 2];

        }

        if (x == 0 && y == 0 && z == 0) {
            System.out.println("YES");
            return true;

        } else {
            System.out.println("NO");
            return false;

        }
    }
}
