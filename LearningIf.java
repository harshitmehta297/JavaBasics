import java.util.Scanner;

public class LearningIf {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = input.nextInt();
        if(age >= 18){
            System.out.println("You can drive");
        }
        else{
            System.out.println("Can not drive");
        }
    }
}
