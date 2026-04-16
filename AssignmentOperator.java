import java.util.Scanner;

public class AssignmentOperator {
    static void main() {
       // int myInt = 9;
        //System.out.println(myInt);
        //int newInt = myInt;
        //System.out.println(newInt);
// Create a program to swap 2 no.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st no.: ");
        int firstNo = input.nextInt();
        System.out.print("Enter 2nd no.: ");
        int secondNo = input.nextInt();
        System.out.println("After swapping");
        int tempNo = firstNo;
        System.out.println("First No. is: " + (secondNo) ) ;
        System.out.println("Second No. is: " + (tempNo) ) ;
    }

}
