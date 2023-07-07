import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args){
        char ch;



        Scanner input = new Scanner(System.in);
        System.out.println("Enter any letter");
        ch = input.next().charAt(0);

        //Scanner scanner=new Scanner(System.in);
      //  System.out.println("Enter any letter");
       //ch = scanner.nextInt();

        if (ch =='a' || ch =='e' || ch =='i'|| ch =='o' || ch =='u'){
            System.out.println("letter is vowel");

        }
        else{
            System.out.println("letter is consonant");
    }}
}
