import java.util.Scanner;

public class Function {

    static void main() {
          table();
    }

    // WAP to print multiplication table of a given no.
    public static void table(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No. to print table: " );
        int num = input.nextInt();
        int i = 1;
        while(i <= 10){
            int result = num * i;
            System.out.println(result);
            i++;

        }
    }
    }

