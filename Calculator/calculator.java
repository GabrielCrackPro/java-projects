package Calculator;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Add");
        System.out.println("2 - Substract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        System.out.println("\n");
        System.out.println("Enter number 1:");
        int n1 = sc.nextInt();
        System.out.println("Enter number 2");
        int n2 = sc.nextInt();
        System.out.println("\n");
        System.out.println("Select an option:");
        int option, result;
        option = sc.nextInt();
        switch (option) {
            case 1:
                result = n1 + n2;
                System.out.println("Result is" + " " + result);
                break;
            case 2:
                result = n1 - n2;
                System.out.println("Result is" + " " + result);
                break;
            case 3:
                result = n1 * n2;
                System.out.println("Result is" + " " + result);
            case 4:
                if (n1 == 0 || n2 == 0) {
                    System.out.println("Cannot divide by 0");
                    break;
                } else {
                    result = n1 / n2;
                    System.out.println("Result is" + " " + result);
                    break;
                }
        }
        sc.close();
    }
}