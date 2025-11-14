import java.util.Scanner;

class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.print("Enter another number: ");
            int den = sc.nextInt();

            int result = num / den;
            System.out.println("Result = " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        } 
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e);
        } 
        finally {
            System.out.println("Program execution completed.");
            sc.close();
        }
    }
}