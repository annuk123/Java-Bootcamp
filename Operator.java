import java.util.Scanner;
public class Operator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if(true){
            boolean third = ( number % 5 == 0 ) && ( number % 6 == 0);
            System.out.println(" Is " + number + " divisible by 5 and 6 ? " + third);
        }
        if(true){
            boolean third = ( number % 5 == 0 ) || ( number % 6 == 0);
            System.out.println(" Is " + number + " divisible by 5 or 6 ? " + third);
        }

        if(true){
            boolean third = ( number % 5 == 0 ) ^ ( number % 6 == 0);
            System.out.println(" Is " + number + " divisible by 5 and 6, but not both? " + third);
        }

    }
}
