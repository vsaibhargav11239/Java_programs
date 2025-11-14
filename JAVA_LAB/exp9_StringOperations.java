import java.util.Scanner;

class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.println("\n--- String Operations ---");
        System.out.println("1. Concatenation: " + str1 + str2);
        System.out.println("2. Uppercase: " + str1.toUpperCase());
        System.out.println("3. Lowercase: " + str1.toLowerCase());
        System.out.println("4. Length of first string: " + str1.length());
        System.out.println("5. Compare strings: " + str1.equals(str2));
        System.out.println("6. Substring of first string (0 to 3): " + str1.substring(0, Math.min(3, str1.length())));

        sc.close();
    }
}