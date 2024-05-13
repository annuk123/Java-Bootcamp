public class Increment {
    public static void main(String[] args){
        //+++++++++++++++++++Passing Argument by Values+++++++++++++++++++++++++++
        //The arguments are passed by value to parameters when invoking a method.
        //The power of a method is its ability to work with parameters. You can use println to print
        //any string and max to find the maximum of any two int values. When calling a method, you
        //need to provide arguments, which must be given in the same order as their respective parameters in the method signature. This is known as parameter order association.
        //When you invoke a method with an argument, the value of the argument is passed to the parameter. This is referred to as pass-by-value.
        //If the argument is a variable rather than a literal value,  the value of the variable is passed to parameter. the variable is not affected, regardless of the changes made to parameter inside the method/
        int x = 1;
        System.out.println("Before the call, x is " + x);
        increment(x);
        System.out.println("After the call, x is " + x);

    }

    public static void increment(int n){
        n++;
        System.out.println("n inside the method is " + n);
    }
}
