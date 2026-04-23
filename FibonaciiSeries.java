import java.util.Scanner;

public class FibonaciiSeries {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. till you want finocaii series: ");
        int first = input.nextInt();
        System.out.println("Here is fibonacii series: ");
        fibonaci(first);


    }

    public static void fibonaci(int num){

        if (num < 0) return;
        System.out.print("0 ");

        if (num ==0) return;
        System.out.print("1 ");

        int first =0, second =1;
        while(first + second <= num ){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }

    }
}
