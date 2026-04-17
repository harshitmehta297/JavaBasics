import java.util.Scanner;

public class Return {
    static void main() {
        greet();
        int first = readNumber();
        int second = readNumber();

        int sum = first + second;
        System.out.println("Sum is: " + sum);
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter no.: ");
        int number = input.nextInt();
        return number;
    }

    public static void greet(){
        System.out.println("Welcome");
    }
}
