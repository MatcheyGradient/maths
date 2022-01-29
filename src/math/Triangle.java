package math;

public class Triangle {

    public static String pythagoreanTriple(int input1, int input2){
        long result1 = ((long) input1 * input1) - ((long) input2 * input2);
        long result2 = 2L * input1 * input2;
        long hypotenuse = (long) Math.sqrt((result1 * result1) + result2 * result2);

        return Math.abs(result1) + ", " + result2 + ", " + hypotenuse;
    }

    public static long simpleFindTriangleArea(double height, double baseLength){
        return (long) ((height * baseLength) / 2);
    }

    public static boolean isTrianglePossible (double base, double a, double b){
        return (a + b) >= base;
    }

    public static double pythagoreanTheorem(double leg1, double leg2){
        double step1 = (leg1 * leg1) + (leg2 * leg2);
        return Math.sqrt(step1);
    }
}
