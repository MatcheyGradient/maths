import math.Circles;
import math.Numbers;
import math.Triangle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Numbers.fibonacci(2, 1, 20))); // lucas numbers
        System.out.println(Circles.getCircleCircumference(3));
        System.out.println(Circles.getCircleRadiusFromCircumference(18.84955592153876));
    }
}
