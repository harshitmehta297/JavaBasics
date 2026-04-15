import java.util.Scanner;

public class UserInput {
    public static void main() {
        /* Scanner input = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = input.nextLine();
        System.out.println("Good Morning " + name );
        System.out.println("Hi " + name + " Tell your age also");
        int age = input.nextInt();
        System.out.println(name + " age is " + age); */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first no. : ");
        int firstNo = input.nextInt();
        System.out.print("Enter second no. : ");
        int secondNo = input.nextInt();
        int sum = firstNo + secondNo;
        System.out.println("Sum is: " + sum);
    }
}
