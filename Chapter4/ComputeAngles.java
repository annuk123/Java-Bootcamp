import java.util.Scanner;
public class ComputeAngles {
    public static void main(String[] args){
        //Given the three sides of a triangle, for example, you can compute the angle by usiing the following formula:
        // A = acos((a * a - b * b - c * c) / (-2 * b * c))
        // B = acos((b * b - a * a - c * c) / (-2 * a * c))
        // C = acos((c * c - b * b - a * a) / (-2 * a * b))
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter three points
        System.out.println("Enter three points: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        //Compute three sides
        double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2-y3));
        double b = Math.sqrt((x1 -x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        //Compute three angles
        double A = Math.toDegrees(Math.acos((a * a - b * b - c *  c) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c *  c) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a *  a) / (-2 * a * b)));

        //Display results
        System.out.println("The three angles are " + Math.round(A * 100) / 100.0 +  " " + Math.round(B * 100) / 100.0 + " " + Math.round(C * 100) / 100.0);

        //The Math class is used in the program, but not imported, because it is in the java.
        //lang package. All the classes in the java.lang package are implicitly imported in a Java
        //program.







    }
}
