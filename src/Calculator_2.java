import java.util.Scanner;

public class Calculator_2 {
    public static void main(String[] args) {
        int a;
        int b;
        char ch;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your input");
       ch = sc.next().charAt(0);



        System.out.print("Enter the value of a :");
        a = sc.nextInt();

        System.out.print("Enter the value of b :");
        b = sc.nextInt();

        if (ch == '+'){

            System.out.println("Addition is :" + (a +b));
        }
        else if (ch == '-'){
            System.out.println("Sub is :" + (a -b));

        }
        else if (ch == '*'){
            System.out.println("multiplication is :"+ (a * b));
        }
        else if (ch  == '/')
        {
            System.out.println("Division is "+ (a / b));
        }
        else
        {
            System.out.println("entered wrong number");

        }





    }
}





