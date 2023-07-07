import java.util.Scanner;
public class OddEven {


    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of x: ");
        x= scanner.nextInt();


        if( (x % 2) == 0){

            System.out.println("Number is even");
        }
       else {
            System.out.println("number is odd");


        }
    }










}
