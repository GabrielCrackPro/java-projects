package Calculator;

import java.util.Scanner;

public class calculator_v2 {
    public static void wait(int miliseconds) {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    } // Función para pausar el programa

    public static void main(String[] args) {
        // Colores
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_PURPLE = "\u001B[35m";

        Scanner sc = new Scanner(System.in);
        System.out.println(ANSI_BLUE + "[ ? ] " + ANSI_RESET + "Por favor, elige una opcion ");
        System.out.println("\n");
        System.out.println(ANSI_PURPLE + "[ 1 ] " + ANSI_RESET + "Suma");
        System.out.println(ANSI_PURPLE + "[ 2 ] " + ANSI_RESET + "Resta");
        System.out.println(ANSI_PURPLE + "[ 2 ] " + ANSI_RESET + "Resta");
        System.out.println(ANSI_PURPLE + "[ 3 ] " + ANSI_RESET + "Multiplicacion");
        System.out.println(ANSI_PURPLE + "[ 4 ] " + ANSI_RESET + "Division");
        System.out.println(ANSI_PURPLE + "[ 5 ] " + ANSI_RESET + "Salir");
        System.out.println("\n");
        System.out.println(ANSI_BLUE + "[ ? ] " + ANSI_RESET + "Opción: ");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println(
                        ANSI_GREEN + "[ i ] " + ANSI_RESET + "Has elegido " + ANSI_GREEN + "SUMA" + ANSI_RESET);
                System.out.println("\n");
                System.out.println(ANSI_BLUE + "[ ? ] " + ANSI_RESET + " Ingresa el primer número");
                String num1 = sc.next();
                System.out.println(ANSI_GREEN + "[ i ] " + ANSI_RESET + "Has introducido el número " + ANSI_GREEN + num1
                        + ANSI_RESET);
                System.out.println(ANSI_BLUE + "[ ? ] " + ANSI_RESET + " Ingresa el segundo número");
                String num2 = sc.next();
                System.out.println(ANSI_GREEN + "[ i ] " + ANSI_RESET + "Has introducido el número " + ANSI_GREEN + num2
                        + ANSI_RESET);
                add(num1, num2);
                System.out.println(ANSI_BLUE + "[ ? ] " + ANSI_RESET + "¿Quieres realizar otra operación? " + ANSI_BLUE
                        + "s/n" + ANSI_RESET);
                String answer = sc.next();
                if (answer.equals("s")) {
                    wait(1000);
                    main(args);
                } else {
                    System.out.println(ANSI_RED + "[ i ] Saliendo..." + ANSI_RESET);
                    wait(500);
                    System.exit(0);
                }
                break;
            case 2:
                System.out.println(
                        ANSI_GREEN + "[ i ] " + ANSI_RESET + "Has elegido " + ANSI_GREEN + " RESTA" + ANSI_RESET);
                System.out.println("\n");
                System.out.println(ANSI_BLUE + "[ ? ]" + ANSI_RESET + " Ingresa el primer número");
                num1 = sc.next();
                System.out.println(ANSI_GREEN + "[ i ] " + ANSI_RESET + "Has introducido el número " + ANSI_GREEN + num1
                        + ANSI_RESET);
                System.out.println(ANSI_BLUE + "[ ? ] " + ANSI_RESET + " Ingresa el segundo nùmero");
                num2 = sc.next();
                System.out.println(ANSI_GREEN + "[ i ] " + ANSI_RESET + "Has introducido el número " + ANSI_GREEN + num2
                        + ANSI_RESET);
                subtract(num1, num2);
                System.out.println(ANSI_BLUE + "[ ? ] " + ANSI_RESET + "¿Quieres realizar otra operación? " + ANSI_BLUE
                        + "s/n" + ANSI_RESET);
                answer = sc.next();
                if (answer.equals("s")) {
                    wait(1000);
                    main(args);
                } else {
                    System.out.println(ANSI_RED + "[ i ] Saliendo..." + ANSI_RESET);
                    wait(500);
                    System.exit(0);
                }
                break;
            case 3:
                System.out.println(ANSI_GREEN + "[ i ] " + ANSI_RESET + "Has elegido " + ANSI_GREEN + " MULTIPLICACION"
                        + ANSI_RESET);
                System.out.println("\n");
                System.out.println(ANSI_BLUE + "[ ? ] " + ANSI_RESET + " Ingresa el primer nùmero");
                num1 = sc.next();
                System.out.println(ANSI_GREEN + "[ i ] " + ANSI_RESET + "Has introducido el número " + ANSI_GREEN + num1
                        + ANSI_RESET);
                System.out.println(ANSI_BLUE + "[ ? ] " + ANSI_RESET + "Ingresa el segundo nùmero");
                num2 = sc.next();
                System.out.println(ANSI_GREEN + "[ i ] " + ANSI_RESET + "Has introducido el número " + ANSI_GREEN + num2
                        + ANSI_RESET);
                multiply(num1, num2);
                System.out.println(ANSI_BLUE + "[ ? ]" + ANSI_RESET + "¿Quieres realizar otra operación? " + ANSI_BLUE
                        + "s/n" + ANSI_RESET);
                answer = sc.next();
                if (answer.equals("s")) {
                    wait(1000);
                    main(args);
                } else {
                    System.out.println(ANSI_RED + "[ i ] Saliendo..." + ANSI_RESET);
                    wait(500);
                    System.exit(0);
                }
                break;
            case 4:
                System.out.println(
                        ANSI_GREEN + "[ i ] " + ANSI_RESET + "Has elegido " + ANSI_GREEN + "DIVISION" + ANSI_RESET);
                System.out.println("\n");
                System.out.println(ANSI_BLUE + "[ ? ] " + ANSI_RESET + "Por favor, ingresa el primer número");
                num1 = sc.next();
                System.out.println(ANSI_GREEN + "[ i ] " + ANSI_RESET + "Has introducido el número " + ANSI_GREEN + num1
                        + ANSI_RESET);
                System.out.println(ANSI_BLUE + "[ ? ] " + ANSI_RESET + "Por favor, ingresa el segundo nùmero");
                num2 = sc.next();
                System.out.println(ANSI_GREEN + "[ i ] " + ANSI_RESET + "Has introducido el número " + ANSI_GREEN + num2
                        + ANSI_RESET);
                divide(num1, num2);
                System.out.println(ANSI_BLUE + "[ ? ] " + ANSI_RESET + "¿Quieres realizar otra operación? " + ANSI_BLUE
                        + "s/n" + ANSI_RESET);
                answer = sc.next();
                if (answer.equals("s")) {
                    wait(1000);
                    main(args);
                } else {
                    System.out.println(ANSI_RED + "[ i ] Saliendo..." + ANSI_RESET);
                    wait(500);
                    System.exit(0);
                }
                break;
            case 5:
                System.out.println(ANSI_RED + "[ i ] Saliendo..." + ANSI_RESET);
                wait(500);
                System.exit(0);
                break;
            default:
                System.out.println(ANSI_RED + "[ ! ] Por favor, elige una opcion válida" + ANSI_RESET);
                System.out.println("\n");
                wait(500);
                main(args);
                break;
        }
        sc.close();

    }

    public static void add(String n1, String n2) {
        // Colores
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        try {
            int num1 = Integer.parseInt(n1);
            int num2 = Integer.parseInt(n2);
            int sum = num1 + num2;
            wait(500);
            System.out.println(ANSI_GREEN + "[ i ] " + ANSI_RESET + "El resultado de la operación es " + ANSI_GREEN
                    + sum + ANSI_RESET);
        } catch (NumberFormatException e) {
            System.out.println(ANSI_RED + "[ ! ] Los datos intrroducidos no son válidos, por favor intentalo de nuevo"
                    + ANSI_RESET);
        }
    }

    public static void subtract(String n1, String n2) {
        // Colores
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        try {
            int num1 = Integer.parseInt(n1);
            int num2 = Integer.parseInt(n2);
            int sub = num1 - num2;
            wait(500);
            System.out.println(ANSI_GREEN + "[ i ]" + ANSI_RESET + "El resultado de la operación es " + ANSI_GREEN + sub
                    + ANSI_RESET);
        } catch (NumberFormatException e) {
            System.out.println(ANSI_RED + "[ ! ] Los datos introducidos no son válidos, por favor intentalo de nuevo"
                    + ANSI_RESET);
        }
    }

    public static void multiply(String n1, String n2) {
        // Colores
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        try {
            int num1 = Integer.parseInt(n1);
            int num2 = Integer.parseInt(n2);
            int mul = num1 * num2;
            wait(500);
            System.out.println(ANSI_GREEN + "[ i ] " + ANSI_RESET + "El resultado de la operación es " + ANSI_GREEN
                    + mul + ANSI_RESET);
        } catch (NumberFormatException e) {
            System.out.println(ANSI_RED + "[ ! ] Los datos introducidos no son válidos, por favor intentalo de nuevo"
                    + ANSI_RESET);
        }
    }

    public static void divide(String n1, String n2) {
        // Colores
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        try {
            int num1 = Integer.parseInt(n1);
            int num2 = Integer.parseInt(n2);
            if (num2 == 0) {
                System.out.println(ANSI_RED + "[ ! ] No se puede dividir por cero" + ANSI_RESET);
                System.exit(1);
            } else {
                int div = num1 / num2;
                wait(500);
                System.out.println(ANSI_GREEN + "[ i ]" + ANSI_RESET + "El resultado de la operación es " + ANSI_GREEN
                        + div + ANSI_RESET);
            }
        } catch (NumberFormatException e) {
            System.out.println(ANSI_RED + "[ ! ] Los datos introducidos no son válidos, por favor intentalo de nuevo"
                    + ANSI_RESET);
        }
    }
}
