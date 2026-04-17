import java.util.Scanner;

public class FunctionPractise2 {
    static void main() {
        // Calculate factorial

        Scanner input = new Scanner(System.in);
        System.out.print("Enter no to find factorial: ");
        int num = input.nextInt();
        int factorial = findFactorial(num);
        System.out.println("Factorial is: " + factorial);
    }

    public static int findFactorial(int num){
        int factorial = 1;
        int i = 1;
        while(i<=num){
            factorial = factorial * i;
            i++;
        }
        return factorial;
    }
}
