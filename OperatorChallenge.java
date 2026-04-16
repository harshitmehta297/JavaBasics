import java.util.Scanner;

public class OperatorChallenge {
    static void main() {
        Scanner input = new Scanner(System.in);

        // WAP to calculate perimiter of rectangle
       /*
        System.out.print("Enter length of rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = input.nextDouble();
        System.out.println("Perimiter is : " + (length + length + breadth + breadth)); */

        // WAP to calculate area of triangle

        System.out.print("Enter hypotonus of triangle: ");
        double hype = input.nextDouble();
        System.out.print("Enter base of triangle: ");
        double base = input.nextDouble();
        double area = 0.5 * base * hype;
        System.out.println("Area of triangle is : " + area );


    }




}
