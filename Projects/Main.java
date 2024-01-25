import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    // 1. Prints "Hello along with the user's name (String)
    System.out.println("Hello");
    System.out.println("Markuss Heideamanis");
    System.out.println();
    

    // 2. Prints the sum of two numbers (int)
    int sum = 74 + 36;
    System.out.println(sum);
    System.out.println();
    
    
    // 3. Prints the division of two numbers (int)
    int division = 50 / 3;
    System.out.println(division);
    System.out.println();


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


    // 5. Takes two user inputed numbers and prints their multiplication (int)
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int num1 = Integer.parseInt(scanner.nextLine());

    System.out.print("Enter the second number: ");
    int num2 = Integer.parseInt(scanner.nextLine());

    int multiplication = num1 * num2;
    System.out.println(multiplication);
    System.out.println();


    // 6. Takes two user inputed numbers and prints multiple operation results
    System.out.print("Enter the first number: ");
    num1 = Integer.parseInt(scanner.nextLine());

    System.out.print("Enter the second number: ");
    num2 = Integer.parseInt(scanner.nextLine());

    sum = num1 + num2;
    int subtraction = num1 - num2;
    multiplication = num1 * num2;
    division = num1 / num2;
    int remainder = num1 % num2;

    System.out.println(sum);
    System.out.println(subtraction);
    System.out.println(multiplication);
    System.out.println(division);
    System.out.println(remainder);
    System.out.println();


    // 7. Takes an user inputed number and prints it multiplication table up to 10
    System.out.print("Enter a number: ");
    num1 = Integer.parseInt(scanner.nextLine());

    for (int i = 1; i < 11; i++) {
        System.out.println(num1 + " x " + i + " = " + num1 * i);
    }
    System.out.println();


    // 8. Outputs "JAVA" made form ASCII symbols
    System.out.println("   J     a   v     v  a");
    System.out.println("   J    a a   v   v  a a");
    System.out.println("J  J   aaaaa   V V  aaaaa");
    System.out.println(" JJ   a     a   V  a     a");
    System.out.println();


    // 9. Calculates a complex math problem and outputs a double
    double problem = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
    System.out.println(problem);
    System.out.println();


    // 10. Calculates a complex formula and outputs a double
    problem = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
    System.out.println(problem);
    System.out.println();


    // 11. Using a radius program calculates and outputs the perimeter and area of a circle
    double circleRadius = 7.5;
    double circlePerimeter = 2 * Math.PI * circleRadius;
    double circleArea = Math.PI * Math.pow(circleRadius, 2);

    System.out.println("Perimeter is = " + circlePerimeter);
    System.out.println("Area is = " + circleArea);
    System.out.println();


    // 12. Takes three user inputed numbers and prints the average
    System.out.print("Enter the first number: ");
    num1 = Integer.parseInt(scanner.nextLine());

    System.out.print("Enter the second number: ");
    num2 = Integer.parseInt(scanner.nextLine());

    System.out.print("Enter the third number: ");
    int num3 = Integer.parseInt(scanner.nextLine());

    System.out.println((num1 + num2 + num3) / 3);
    System.out.println();


    // 13. Prints the area and perimeter of a rectangle
    double width = 5.5;
    double height = 8.5;
    double rectangleArea = width * height;
    double rectanglePerimeter = width * 2 + height * 2;

    System.out.println("Area is " + width + " * " + height + " = " + rectangleArea);
    System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + rectanglePerimeter);
    System.out.println();
    

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


    // 15. Swaps two variables
    a = 10;
    b = 5;

    int temp = a;
    a = b;
    b = temp;

    System.out.println(a);
    System.out.println(b);
    System.out.println();


    // 16. 
    }
}    