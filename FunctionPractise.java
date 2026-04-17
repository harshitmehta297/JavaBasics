import java.util.Scanner;

public class FunctionPractise {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no.: ");
        int num = input.nextInt();
        int sum = oddNumSum(num);
        System.out.println("Sum is: " + sum);
    }

    public static int oddNumSum(int num){
        int sum = 0;
        int i = 1;
        while ( i <= num){
            sum = sum + i;
            i = i+2;

        }
        return sum;
    }
}
