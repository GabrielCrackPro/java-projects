import java.util.Scanner;

public class baseConverter {
    public static void main(String[] args) {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_BLUE = "\u001B[34m";

        Scanner sc = new Scanner(System.in);
        System.out.println(ANSI_BLUE + "=== Base Converter ===" + ANSI_RESET);
        System.out.print(ANSI_BLUE + "[ ? ] Enter the decimal number: " + ANSI_RESET);
        int num = sc.nextInt();
        System.out.print(ANSI_BLUE + "[ ? ] Enter the base to be converted to: ");
        int base = sc.nextInt();
        convert(num, base);
        sc.close();
    }

    public static void convert(int num, int base) {
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_RESET = "\u001B[0m";

        String result = Integer.toString(num, base);
        System.out.println(ANSI_GREEN + "[ = ] " + "Number " + num + " in base " + base + " is " + result + ANSI_RESET);
    }
}