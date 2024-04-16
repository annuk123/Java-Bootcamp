public class TrigonometricMethod {
    public static void main(String[] args){
        //pow(a, b) method to compute a^b, exponent operations and random() method for generating a random no.
        //Some useful method in math class
        //1. trigonometric methods
        //2. exponent methods
        //3. service method
        //service methods include the rounding, min, max, absolute, and random methods

        // TRIGONOMETRIC METHODS
       double first =  Math.toDegrees(Math.PI / 2);
       System.out.println("Math.toDegrees(Math.PI / 2) " + first);
       double second = Math.toRadians(30);
       System.out.println("Math.toRadians(30) " + second);
       int third = Math.toIntExact(3456635);
       System.out.println("Math.toIntExact(3456635) " + third);
       double four = Math.sin(0);
       System.out.println("Math.sin(0) " + four);
       double five = Math.sin(Math.toRadians(270));
       System.out.println("Math.sin(Math.toRadians(270)) " + five);
       double six = Math.sin(Math.PI / 6);
       System.out.println("Math.sin(Math.PI / 6) " + six);
       double seven = Math.sin(Math.PI / 2);
       System.out.println("Math.sin(Math.PI / 2) " + seven);
       double eight = Math.cos(0);
       System.out.println("Math.cos(0) " + eight);
       double nine = Math.cos(Math.PI / 6);
       System.out.println("Math.cos(Math.PI / 6) " + nine);
       double ten = Math.cos(Math.PI / 2);
       System.out.println("Math.cos(Math.PI / 2) " + ten);
       double ele = Math.asin(0.5);
       System.out.println("Math.cos(Math.PI / 2) " + ele);
       double twe = Math.acos(0.5);
       System.out.println("Math.acos(0.5) " + twe);
       double thr = Math.atan(1.0);
       System.out.println("Math.atan(1.0) " + thr);

        // Exponent methods
        // there are five methods related to exponents in Math.class
        double expo = Math.exp(1);
        System.out.println("Math.exp(1) " + expo);
        double loga = Math.log(Math.E);
        System.out.println("Math.log(Math.E) " + loga);
        double loga10 = Math.log10(10);
        System.out.println("Math.log10(10) " + loga10);
        double power = Math.pow(2, 3);
        System.out.println("Math.pow(2, 3) " + power);
        double powers = Math.pow(4.5, 2.5);
        System.out.println("Math.pow(4.5, 2.5) " + powers);
        double squart = Math.sqrt(4);
        System.out.println("Math.sqrt(4) " + squart);
        double squar = Math.sqrt(10.5);
        System.out.println("Math.sqrt(10.5) " + squar);

        //The Rounding Methods
        // The Math class contain four round methods.
        // ceil(x), floor(x), rint(x), round(x)

        System.out.println("Math.ceil start from here");
        double Ceil = Math.ceil(2.1);
        System.out.println("Math.ceil(2.1) " + Ceil);
        double Ceil1 = Math.ceil(2.0);
        System.out.println("Math.ceil(2.0) " + Ceil1);
        double Ceil2 = Math.ceil(-2.1);
        System.out.println("Math.ceil(-2.1) " + Ceil2);
        double Ceil3 = Math.ceil(-2.0);
        System.out.println("Math.ceil(-2.0) " + Ceil3);

        System.out.println("Math.rint start from here");
        double Rint = Math.rint(2.1);
        System.out.println("Math.rint(2.1) " + Rint);
        double Rint1 = Math.rint(-2.0);
        System.out.println("Math.rint(-2.0) " + Rint1);
        double Rint2 = Math.rint(-2.1);
        System.out.println("Math.rint(-2.1) " + Rint2);
        double Rint3 = Math.rint(2.5);
        System.out.println("Math.rint(2.5) " + Rint3);
        double Rint4 = Math.rint(4.5);
        System.out.println("Math.rint(4.5) " + Rint4);
        double Rint5 = Math.rint(-2.5);


        System.out.println("Math.floor start from here");
        double Floor = Math.floor(2.1);
        System.out.println("Math.floor(2.1) " + Floor);
        double Floor1 = Math.floor(2.0);
        System.out.println("Math.floor(2.0) " + Floor1);
        double Floor2 = Math.floor(-2.1);
        System.out.println("Math.floor(-2.1) " + Floor2);
        double Floor3 = Math.floor(-2.0);


        System.out.println("Math.round start from here");
        double Round = Math.round(2.6f);
        System.out.println("Math.round(2.6f) " + Round);
        double Round1 = Math.round(2.0);
        System.out.println("Math.round(2.0) " + Round1);
        double Round2 = Math.round(-2.0f);
        System.out.println("Math.round(-2.0f) " + Round2);
        double Round3 = Math.round(-2.6);
        System.out.println("Math.round(-2.6) " + Round3);
        double Round4 = Math.round(-2.4);
        System.out.println("Math.round(-2.4) " + Round4);

        //THE MIN, MAX AND ABS METHODS
        //THE min and max methods return the minimum and maximum numbers of two numbers of two numbers (int, long, float, or double).
        // for example, max(4.4, 5.0) returns 5.0, and min(3, 2) returns 2.

        // The abs method returns the absolute value of the number (int, long, float, or double).
        //for example
         double maximum = Math.max(2,  3);
         System.out.println(maximum);
         double maximum2 = Math.max(2.5, 3);
         System.out.println(maximum2);
         double minimum = Math.min(2.5, 4.6);
         System.out.println(minimum);
         double absolute = Math.abs(-2);
         System.out.println(absolute);
         double absolute1 = Math.abs(-2.1);
         System.out.println(absolute1);

         // The random Method
        //  random method generates a random double value greater than or equal to 0.0 and less than 1.0 (0 <= Math.random() < 1.0).
        // (int)(Math.random() * 10) --> Return a random integer between 0 and 9.
        // 50 + (int)(Math.random() * 10) --> Return a random integer between 50 and 99.
        // in general, a + Math.random() * b --> Return a random number between a and a + b.
        

    }
}
