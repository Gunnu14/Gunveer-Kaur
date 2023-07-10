import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int a;
        int b;
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 for addition:");
        System.out.println("Press 2 for subtraction:");
        System.out.println("Press 3 for multiplication:");
        System.out.println("Press 4 for division:");


        num = sc.nextInt();

        System.out.print("Enter the value of a :");
        a = sc.nextInt();

        System.out.print("Enter the value of b :");
        b = sc.nextInt();

        if (num == 1){

            System.out.println("Addition is :" + (a + b));
        }
        else if (num == 2){
            System.out.println("Sub is :" + (a - b));

        }
        else if (num == 3){
            System.out.println("multiplication is :"+ (a * b));
        }
        else if (num == 4)
        {
            System.out.println("Division is "+ (a / b));
        }
      else
        {
            System.out.println("entered wrong number");

        }





    }
}
