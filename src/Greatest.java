import java.util.Scanner;
public class Greatest {
    public static void main(String[] args) {
        int x ;
        int y ;
        int z ;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        x = scanner.nextInt();

        System.out.println("Enter the value of y: ");
        y = scanner.nextInt();

        System.out.println("Enter the value of z");
        z = scanner.nextInt();



        if(x>=y && x>=z)
        {
            System.out.println(" x is larger");

        }
        else if (y>=x && y>=z){

            System.out.println("y is larger");
        }
        else
        {
            System.out.println("z is larger");
        }

    }
}
