import java.util.Scanner;

public class PrimeNo {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. to check prime: ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if(isPrime){
            System.out.println("Prime no.");
        }
        else {
            System.out.println("Not Prime");
        }

    }

    public static boolean isPrime(int num){
        int i =2;
        while (i < num){
            if(num % i == 0){
                return false;
            }
            else {
                i++;
            }
        }
        return true;
    }
}
