public class Circle_Area_And_Perimeter {
    
    public static void circleAreaAndPerimeter() {
        // 11. Using a radius program calculates and outputs the perimeter and area of a circle
        double circleRadius = 7.5;
        double circlePerimeter = 2 * Math.PI * circleRadius;
        double circleArea = Math.PI * Math.pow(circleRadius, 2);
    
        System.out.println("Perimeter is = " + circlePerimeter);
        System.out.println("Area is = " + circleArea);
        System.out.println();
        }
}
