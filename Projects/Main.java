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

    System.out.println("Enter the first number: ");
    int num1 = Integer.parseInt(scanner.nextLine());

    System.out.println("Enter the second number: ");
    int num2 = Integer.parseInt(scanner.nextLine());

    int multiplication = num1 * num2;
    System.out.println(multiplication);


    // 6.

    }
}    