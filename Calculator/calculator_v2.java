package Calculator;

import java.util.Scanner;

public class calculator_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, elige una opcion ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Salir");
        System.out.println("\n");
        System.out.println("Opcion: ");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Por favor, ingresa el primer numero");
                String num1 = sc.next();
                System.out.println("Por favor, ingresa el segundo numero");
                String num2 = sc.next();
                add(num1, num2);
                System.out.println("¿Quieres realizar otra operación? s/n");
                String answer = sc.next();
                if (answer.equals("s"))
                    main(args);
                else {
                    System.out.println("Saliendo...");
                    System.exit(0);
                }
                break;
            case 2:
                System.out.println("Por favor, ingresa el primer numero");
                num1 = sc.next();
                System.out.println("Por favor, ingresa el segundo numero");
                num2 = sc.next();
                subtract(num1, num2);
                System.out.println("¿Quieres realizar otra operación? s/n");
                answer = sc.next();
                if (answer.equals("s"))
                    main(args);
                else {
                    System.out.println("Saliendo...");
                    System.exit(0);
                }
                break;
            case 3:
                System.out.println("Por favor, ingresa el primer numero");
                num1 = sc.next();
                System.out.println("Por favor, ingresa el segundo numero");
                num2 = sc.next();
                multiply(num1, num2);
                System.out.println("¿Quieres realizar otra operación? s/n");
                answer = sc.next();
                if (answer.equals("s"))
                    main(args);
                else {
                    System.out.println("Saliendo...");
                    System.exit(0);
                }
                break;
            case 4:
                System.out.println("Por favor, ingresa el primer numero");
                num1 = sc.next();
                System.out.println("Por favor, ingresa el segundo numero");
                num2 = sc.next();
                divide(num1, num2);
                System.out.println("¿Quieres realizar otra operación? s/n");
                answer = sc.next();
                if (answer.equals("s"))
                    main(args);
                else {
                    System.out.println("Saliendo...");
                    System.exit(0);
                }
                break;
            case 5:
                System.out.println("Saliendo...");
                System.exit(0);
                break;
            default:
                System.out.println("Por favor, elige una opcion valida");
                System.out.println("\n");
                main(args);
                break;
        }
        sc.close();
    }

    public static void add(String n1, String n2) {
        try {
            int num1 = Integer.parseInt(n1);
            int num2 = Integer.parseInt(n2);
            int sum = num1 + num2;
            System.out.println("El resultado de la operación es" + " " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Los datos no son válidos, por favor intentalo de nuevo");
        }
    }

    public static void subtract(String n1, String n2) {
        try {
            int num1 = Integer.parseInt(n1);
            int num2 = Integer.parseInt(n2);
            int sub = num1 - num2;
            System.out.println("El resultado de la operación es" + " " + sub);
        } catch (NumberFormatException e) {
            System.out.println("Los datos no son válidos, por favor intentalo de nuevo");
        }
    }

    public static void multiply(String n1, String n2) {
        try {
            int num1 = Integer.parseInt(n1);
            int num2 = Integer.parseInt(n2);
            int mul = num1 * num2;
            System.out.println("El resultado de la operación es" + " " + mul);
        } catch (NumberFormatException e) {
            System.out.println("Los datos no son válidos, por favor intentalo de nuevo");
        }
    }

    public static void divide(String n1, String n2) {
        try {
            int num1 = Integer.parseInt(n1);
            int num2 = Integer.parseInt(n2);
            if (num2 == 0) {
                System.out.println("No se puede dividir por cero");
            } else {
                int div = num1 / num2;
                System.out.println("El resultado de la operación es" + " " + div);
            }
        } catch (NumberFormatException e) {
            System.out.println("Los datos no son válidos, por favor intentalo de nuevo");
        }
    }
}
