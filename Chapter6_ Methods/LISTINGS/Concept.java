public class Concept {
    public static void main(String[] args){
        //++++++++++++++++Concepts++++++++++++++//
        //Method can be used to define reusable code organize and simplify coding.
        //A method is a collection of statements grouped together to perform an operation.
        System.out.println("Sum from 1 to 10 is " + sum(1, 10));
        System.out.println("Sum from 20 to 37 is " + sum(20 , 37));
        System.out.println("Sum from 35 to 49 is " + sum(35, 49));


    }
    public static int sum(int i1, int i2) {
        int result = 0;
        int i;
        for (i = i1; i <= i2; i++)
            result += i;
        return result;

    }

    // Defining a method
    // A method definition consist of its method name, parameters, return value type, and body.
    //The syntax for defining a method is
    //modifier returnValueType methodName(list of parameters){
    //    //Method body;
    //}

    //The method header specifies the modifiers, return value type, method name, and parameters of the method.
    //If a method returns a value, it is called a value returning method; otherwise it is called a void method.
    //The variable defined in the method header is known as formal parameters or simply parameters. A parameter is like a placeholder: when a method is invoked, you pass a value to the parameter. this value is referred to as an actual parameter or argument.
    //The parameter list refers to the method's type, order, and number of the parameters. The method name and the parameter list together constitute the method signature.
    // Parameter is optional; that is a method may contain no parameters. for example, the Math.random() method has no parameters.
    //In order for a value-returning method to return a result, a return statement using the keyword return is required.
    //The method terminates when a return statement is executed.





    //+++++++++++++++Important Notes++++++++++++++++//
    //Some programming refers to method as procedures and functions. In those languages. a value-returning method is called a function and a void method is called procedure.
    //In method header. you need to declare each parameter separately. for instance, max(int num1, int num2) is correct, but max(int num1, num2) is wrong.

}
