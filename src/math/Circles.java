package math;

public class Circles {
    
    public static double getCircleArea(double radius){
        return radius * radius * Math.PI;
    }

    public static double getCircleCircumference(double radius){
        return radius * 2 * Math.PI;
    }

    public static double getCircleRadiusFromCircumference(double circumference){
        return circumference / Math.PI / 2;
    }

    public static double getCircleRadiusFromArea(double area){
        return Math.sqrt(area / Math.PI);
    }
}
