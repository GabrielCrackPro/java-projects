import java.util.Scanner;

public class baseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Base Converter ===");
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the base to be converted to: ");
        int base = sc.nextInt();
        convert(num, base);
        sc.close();
    }

    public static void convert(int num, int base) {
        String result = Integer.toString(num, base);
        System.out.println("Result is " + result);
    }
}