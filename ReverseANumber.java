import java.util.Scanner;

public class ReverseANumber {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No.: ");
        int num = input.nextInt();
        int reverse = reverseNo(num);
        System.out.println("Reverse of your no. is: " + reverse);

    }

    public static int reverseNo(int num){
        int newNum = 0;
        while (num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }
        return newNum;

    }
}
