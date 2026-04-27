import java.util.Scanner;

public class PalindromeNo {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your no.: ");
        int num = input.nextInt();
        boolean isPalindrom = isPalindrome(num);
        if(isPalindrom){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }

    }

    public static boolean isPalindrome(int num){
        int reverse = reverse(num);
        return num == reverse;
    }

    public static int reverse(int num){
        int newNum = 0;
        while(num>0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }
        return newNum;
    }
}
