import java.util.Scanner;

public class FunctionPractise3 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no.: ");
        int num = input.nextInt();
        int sumDigit = calculateSum(num);
        System.out.println("Sum of entered digits is: " + sumDigit);
    }

    public static int calculateSum(int num){
        int temp =0;

        while( num > 0){
            temp = temp + (num % 10);
            num = num / 10;

        }
        return temp;
    }
}
