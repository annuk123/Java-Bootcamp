public class TestReturnGradeMethod {
    public static void main(String[] args){
        System.out.print("The Grade is " + getGrade(78.5));
        System.out.print("\nThe grade is " + getGrade(49.5));
    }
    public static char getGrade(double score){
        if (score >= 90.0)
            return 'A';
        else if (score >= 80.0) {
            return 'B';
        } else if (score >= 70.0) {
            return 'C';
        } else if (score >= 60.0) {
            return 'D';
        }
        else
            return 'F';

    }

    //+++++++++Notes++++++++++++++
    //A return statement is not needed for a void method, but it can be used for terminating the method and returning to the method's caller. The syntax is simply "return;" This is often done, but sometimes it is useful for circumventing the normal flow of control in a void method.
}
