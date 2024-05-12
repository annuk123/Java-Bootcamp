import java.util.Scanner;

public class TestMax {
    public static void main(String[] args){
        //++++++++Calling a Method++++++++++++++//
        //Calling a method executes the code in the method.
        //To execute the method, you have to call or invoke it.
        //there are two ways to call a method, depending on whether the method returns a value or not.

        //If a method returns a value. a call to the to the method is usually treated as a value, for example, int large = max(4, 3)
        //calls max(4, 3) and assigns the method to the variable larger. a call that treated as value is
        //System.out.println(max(4, 3));

        //If a method returns void, a call to method must be a statement. for example, the method println returns void.
        //System.out.println("Welcome to java!");

        //A value returning method can also be invoked as a statement in java. In this case also be invoked as a statement in java. In this case, the caller simply ignores the value. this is not often done. but is permissible if the caller is not interested in return value.
        //When a program calls a method, program control is transferred to the called method. A called method returns control to the caller when its return statement is executed or when its method ending closing brace is reached.
        
//        int i = 5;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First No.: ");
        int i = input.nextInt();
//        int j = 3;
        System.out.print("Enter the Second No.: ");
        int j = input.nextInt();
        int k = getMax(i, j);
        System.out.println("The maximum of " + i + " and " + j + " is " + k);

    }

    public static int getMax(int num1, int num2) {
        return Math.max(num1, num2);
        //Instead of writing if statement or declaring Math.max value with another variable, if can write an inline statement.
        //after return statement in this method scope, we cannot write any statement because it throws error in compiler beacause after return of any scope method means nothing will be execute now.
        //You can execute any statement after this scope

    }
}
