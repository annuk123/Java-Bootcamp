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
        //After return statement in this method scope, we cannot write any statement because it throws an error in the compiler because after return of any scope method means nothing will be execute now.
        //You can execute any statement after this scope
        //A return statement is required for a value-return method. The method shown below in a is logically correct. But it has a compiler error because the java compiler thinks that this method might not return a value.
        //Methods enable code sharing and reuse.
        //Each time a method is invoked, the system creates an activation record (also called an activation frame) that stores parameters and variables for the method and places the activation record in an area of memory known as a call stack.
        //A call stack is also known as an execution stack, runtime stack, or machine stack, and it is often shortened to just the stack. when a method  calls another method, the caller's activation record is kept intact, and a new activation record is created for new method is called. when a method finishes its work and returns to its caller, its activation record is removed from the call stack.
        //A call stack stores the activation records in a last-in, first-out fashion: The activation record
        //for the method that is invoked last is removed first from the stack. For example, suppose
        //method m1 calls method m2, and m2 calls method m3. The runtime system pushes m1’s activation record into the stack, then m2’s, and then m3’s. After m3 is finished, its activation record is
        //removed from the stack. After m2 is finished, its activation record is removed from the stack.
        //After m1 is finished, its activation record is removed from the stack

    }

}
