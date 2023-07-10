import java.util.Scanner;
public class Calculator_Switch_Ch {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        int a;
        int b;
        char ch;

        System.out.println("Press + for addition");
        System.out.println("Press - for subtaction");
        System.out.println("Press * for multiplication");
        System.out.println("Press / for division");


        System.out.println("Enter the character");
        ch = scanner.next().charAt(0);


        switch (ch){

            case '+':
                System.out.println("Enter the value of a");
                a = scanner.nextInt();

                System.out.println("Enter the value of b");
                b = scanner.nextInt();

                System.out.println("Addition is " + (a +b));
                break;


            case '-':
                System.out.println("Enter the value of a");
                a = scanner.nextInt();

                System.out.println("Enter the value of b");
                b = scanner.nextInt();

                System.out.println("subtaction is " + (a -b));
                break;

            case '*':
                System.out.println("Enter the value of a");
                a = scanner.nextInt();

                System.out.println("Enter the value of b");
                b = scanner.nextInt();

                System.out.println("multiplication is " + (a *b));
                break;

            case '/':
                System.out.println("Enter the value of a");
                a = scanner.nextInt();

                System.out.println("Enter the value of b");
                b = scanner.nextInt();

                System.out.println("divison is " + (a /b));
                break;

                default:
                    System.err.println("Wrong input");



        }



    }
}
