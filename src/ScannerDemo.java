import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        int x;
        int y;
        int sum;

        Scanner scanner = new Scanner(System.in);

        System.out.print( "Enter the value of x :" );
        x = scanner.nextInt();

        System.out.print( "Enter the value of y :" );
        y = scanner.nextInt();

        sum = x + y;

        System.out.println( " sum is :" + sum);

    }
}