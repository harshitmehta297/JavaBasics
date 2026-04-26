import java.util.Scanner;

public class ArmstrongNo {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your no.: ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if(isArmstrong){
            System.out.println("Your no. is armstrong");
        }
        else {
            System.out.println("Not armstrong");
        }

    }

    public static boolean isArmstrong(int num){
        int noOfdigits = noOfDigit(num);
        int numCopy = num;
        int finalNo = 0;
        while (num > 0){
            int lastDigit = num % 10;
            num = num /10;
            finalNo = finalNo + power(lastDigit, noOfdigits);
        }
        return finalNo == numCopy;
    }

    public static int power(int num1, int num2){
        int result = num1;
        int i =1;
        while(i<num2){
            result = result * num1;
            i++;
        }
        return result;
    }

    public static int noOfDigit(int num){
        int digits = 0;
        while(num > 0){
            digits++;
            num = num / 10;
        }
        return digits;
    }
}
