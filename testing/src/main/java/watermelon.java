import java.util.*;

public class watermelon {
    public static Boolean CanEven(int number) {
        if (number < 1 || number > 100)
            throw new IllegalArgumentException("range between 1 and 100 included");
        return number % 2 == 0 && number > 2;
    }

}
