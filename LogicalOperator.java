import java.util.Scanner;

public class LogicalOperator {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = input.nextInt();
        System.out.print("Are you Male or Female ?");
        String gender = input.nextLine();
        if(age < 15 && gender == "Female"){
            System.out.println("Discount is 15%");
        } else if (age >= 60 && gender == "Female" ) {
            System.out.println("Discount is 50%");
        }
        else if(age > 15 && age < 60 && gender == "Female"){
            System.out.println("Discount is 25%");
        }
        else{
            System.out.println("No Discount");
        }

    }
}
