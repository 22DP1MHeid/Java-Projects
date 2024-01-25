public class Main {

    public static void reverseString(String string) {
        System.out.println(string.length());
        for (int i = string.length(); i == 0; --i) {
            System.out.print(string.charAt(i));
        }
    }

    public static void helloPerson() {
        // 1. Prints "Hello along with the user's name (String)
    System.out.println("Hello");
    System.out.println("Markuss Heideamanis");
    System.out.println();
    }

    public static void sumOfTwo() {
    // 2. Prints the sum of two numbers (int)
    int sum = 74 + 36;
    System.out.println(sum);
    System.out.println();
    }

    public static void divisionOfTwo() {
        // 3. Prints the division of two numbers (int)
    int division = 50 / 3;
    System.out.println(division);
    System.out.println();
    }

    public static void mathOperations() {
        // 4. Prints multiple mathematical results (int)
    int a = -5 + 8 * 6;
    int b = (55 + 9) % 9;
    int c = 20 + -3 * 5 / 8;
    int d = 5 + 15 / 3 * 2 - 8 % 3;

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println();
    }

    public static void multipleOfTwo(int num1, int num2) {
        // 5. Takes two user inputed numbers and prints their multiplication (int)
    int multiplication = num1 * num2;
    System.out.println(multiplication);
    System.out.println();
    }

    public static void mathOperationsOfInputs(int num1, int num2) {
        // 6. Takes two user inputed numbers and prints multiple operation results
    int sum = num1 + num2;
    int subtraction = num1 - num2;
    int multiplication = num1 * num2;
    int division = num1 / num2;
    int remainder = num1 % num2;

    System.out.println(sum);
    System.out.println(subtraction);
    System.out.println(multiplication);
    System.out.println(division);
    System.out.println(remainder);
    System.out.println();
    }

    public static void multiplicationTable(int num1) {
        // 7. Takes an user inputed number and prints it multiplication table up to 10
    for (int i = 1; i < 11; i++) {
        System.out.println(num1 + " x " + i + " = " + num1 * i);
    }
    System.out.println();
    }

    public static void javaASCII() {
    // 8. Outputs "JAVA" made form ASCII symbols
    System.out.println("   J     a   v     v  a");
    System.out.println("   J    a a   v   v  a a");
    System.out.println("J  J   aaaaa   V V  aaaaa");
    System.out.println(" JJ   a     a   V  a     a");
    System.out.println();
    }

    public static void complexMath() {
        // 9. Calculates a complex math problem and outputs a double
    double problem = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
    System.out.println(problem);
    System.out.println();
    }

    public static void complexMath2() {
        // 10. Calculates a complex formula and outputs a double
    double problem = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
    System.out.println(problem);
    System.out.println();
    }

    public static void circleAreaAndPerimeter() {
    // 11. Using a radius program calculates and outputs the perimeter and area of a circle
    double circleRadius = 7.5;
    double circlePerimeter = 2 * Math.PI * circleRadius;
    double circleArea = Math.PI * Math.pow(circleRadius, 2);

    System.out.println("Perimeter is = " + circlePerimeter);
    System.out.println("Area is = " + circleArea);
    System.out.println();
    }

    public static void averageOfThree(int num1, int num2, int num3) {
        // 12. Takes three user inputed numbers and prints the average
    System.out.println((num1 + num2 + num3) / 3);
    System.out.println();
    }

    public static void rectangleAreaAndPerimeter() {
        // 13. Prints the area and perimeter of a rectangle
    double width = 5.5;
    double height = 8.5;
    double rectangleArea = width * height;
    double rectanglePerimeter = width * 2 + height * 2;

    System.out.println("Area is " + width + " * " + height + " = " + rectangleArea);
    System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + rectanglePerimeter);
    System.out.println();
    }

    public static void americanFlag() {
        // 14. Outputs the American flag with ASCII symbols
    System.out.println("* * * * * * ==================================");
    System.out.println(" * * * * *  ==================================");
    System.out.println("* * * * * * ==================================");
    System.out.println(" * * * * *  ==================================");
    System.out.println("* * * * * * ==================================");
    System.out.println(" * * * * *  ==================================");
    System.out.println("* * * * * * ==================================");
    System.out.println(" * * * * *  ==================================");
    System.out.println("* * * * * * ==================================");
    System.out.println("==============================================");
    System.out.println("==============================================");
    System.out.println("==============================================");
    System.out.println("==============================================");
    System.out.println("==============================================");
    System.out.println("==============================================");
    System.out.println();
    }

    public static void variableSwap() {
        // 15. Swaps two variables
    int a = 10;
    int b = 5;

    int temp = a;
    a = b;
    b = temp;

    System.out.println(a);
    System.out.println(b);
    System.out.println();
    }



    public static void main(String[] args) {

    reverseString("Marko");

    }
}    