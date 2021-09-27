/*
 Autor: Gabriel Vargas Reyes
 Fecha: 26/09/2021 

 Consideraciones:
  - Si se utliza la función "System.out.print()" en lugar de System.out.println() se podrá introducir texto en la misma linea
  (por eso aparecen lineas con "System.out.print()" y con "System.out.println()")
  */

package Calculator;

import java.util.Scanner;

public class calculator_v2 {
    public static void main(String[] args) {
        // Colores
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_CYAN = "\u001B[36m";
        String BOLD_TEXT = "\033[0;1m";
        String PLAIN_TEXT = "\033[0;0m";

        Scanner sc = new Scanner(System.in);
        System.out.println(BOLD_TEXT + ANSI_CYAN + "[ 1 ] Suma" + PLAIN_TEXT + ANSI_RESET);
        System.out.println(BOLD_TEXT + ANSI_CYAN + "[ 2 ] Resta" + PLAIN_TEXT + ANSI_RESET);
        System.out.println(BOLD_TEXT + ANSI_CYAN + "[ 3 ] Multiplicacion" + PLAIN_TEXT + ANSI_RESET);
        System.out.println(BOLD_TEXT + ANSI_CYAN + "[ 4 ] Division" + PLAIN_TEXT + ANSI_RESET);
        System.out.println(BOLD_TEXT + ANSI_CYAN + "[ 5 ] Acerca De" + PLAIN_TEXT + ANSI_RESET);
        System.out.println(BOLD_TEXT + ANSI_CYAN + "[ 6 ] Salir" + PLAIN_TEXT + ANSI_RESET);
        System.out.println("\n");
        System.out.print(BOLD_TEXT + ANSI_BLUE + "[ ? ] Por favor, elige una opción: " + PLAIN_TEXT + ANSI_RESET);
        int option;
        try {
            option = sc.nextInt();
        } catch (Exception e) {
            System.out.println(
                    BOLD_TEXT + ANSI_RED + "[ ! ] El caracter introducido no es un número." + PLAIN_TEXT + ANSI_RESET);
            option = 0;
            System.exit(1);
        }
        switch (option) {
            case 1:
                System.out.println(BOLD_TEXT + ANSI_GREEN + "[ i ] Has elegido SUMA" + PLAIN_TEXT + ANSI_RESET);
                System.out.print(BOLD_TEXT + ANSI_BLUE + "[ ? ] Ingresa el primer número: " + PLAIN_TEXT + ANSI_RESET);
                String num1 = sc.next();
                checkChars(num1);
                System.out.println(
                        BOLD_TEXT + ANSI_GREEN + "[ i ] Has introducido el número " + num1 + PLAIN_TEXT + ANSI_RESET);
                System.out.print(BOLD_TEXT + ANSI_BLUE + "[ ? ] Ingresa el segundo número: " + PLAIN_TEXT + ANSI_RESET);
                String num2 = sc.next();
                checkChars(num2);
                System.out.println(
                        BOLD_TEXT + ANSI_GREEN + "[ i ] Has introducido el número " + num2 + PLAIN_TEXT + ANSI_RESET);
                add(num1, num2);
                System.out.print(BOLD_TEXT + ANSI_BLUE + "[ ? ] ¿Quieres realizar otra operación? s/n " + PLAIN_TEXT
                        + ANSI_RESET);
                String answer = sc.next();
                if (answer.equals("s")) {
                    wait(1000);
                    main(args);
                } else {
                    System.out.println("\n");
                    System.out.println(BOLD_TEXT + ANSI_RED + "[ i ] Saliendo..." + PLAIN_TEXT + ANSI_RESET);
                    wait(500);
                    System.exit(0);
                }
                break;
            case 2:
                System.out.println(BOLD_TEXT + ANSI_GREEN + "[ i ] Has elegido RESTA" + PLAIN_TEXT + ANSI_RESET);
                System.out.print(BOLD_TEXT + ANSI_BLUE + "[ ? ] Ingresa el primer número: " + PLAIN_TEXT + ANSI_RESET);
                num1 = sc.next();
                checkChars(num1);
                System.out.println(
                        BOLD_TEXT + ANSI_GREEN + "[ i ]  Has introducido el número " + num1 + PLAIN_TEXT + ANSI_RESET);
                System.out.print(BOLD_TEXT + ANSI_BLUE + "[ ? ] Ingresa el segundo nùmero: " + PLAIN_TEXT + ANSI_RESET);
                num2 = sc.next();
                checkChars(num2);
                System.out.println(
                        BOLD_TEXT + ANSI_GREEN + "[ i ] Has introducido el número " + num2 + PLAIN_TEXT + ANSI_RESET);
                subtract(num1, num2);
                System.out.print(BOLD_TEXT + ANSI_BLUE + "[ ? ] ¿Quieres realizar otra operación? s/n" + PLAIN_TEXT
                        + ANSI_RESET);
                answer = sc.next();
                if (answer.equals("s")) {
                    wait(1000);
                    main(args);
                } else {
                    System.out.println("\n");
                    System.out.println(BOLD_TEXT + ANSI_RED + "[ i ] Saliendo..." + PLAIN_TEXT + ANSI_RESET);
                    wait(500);
                    System.exit(0);
                }
                break;
            case 3:
                System.out
                        .println(BOLD_TEXT + ANSI_GREEN + "[ i ] Has elegido MULTIPLICACION" + PLAIN_TEXT + ANSI_RESET);
                System.out.print(BOLD_TEXT + ANSI_BLUE + "[ ? ] Ingresa el primer nùmero: " + PLAIN_TEXT + ANSI_RESET);
                num1 = sc.next();
                checkChars(num1);
                System.out.println(
                        BOLD_TEXT + ANSI_GREEN + "[ i ] Has introducido el número " + num1 + PLAIN_TEXT + ANSI_RESET);
                System.out.print(BOLD_TEXT + ANSI_BLUE + "[ ? ] Ingresa el segundo nùmero: " + PLAIN_TEXT + ANSI_RESET);
                num2 = sc.next();
                checkChars(num2);
                System.out.println(
                        BOLD_TEXT + ANSI_GREEN + "[ i ] Has introducido el número " + num2 + PLAIN_TEXT + ANSI_RESET);
                multiply(num1, num2);
                System.out.print(BOLD_TEXT + ANSI_BLUE + "[ ? ] ¿Quieres realizar otra operación? s/n " + PLAIN_TEXT
                        + ANSI_RESET);
                answer = sc.next();
                if (answer.equals("s")) {
                    wait(1000);
                    main(args);
                } else {
                    System.out.println("\n");
                    System.out.println(BOLD_TEXT + ANSI_RED + "[ i ] Saliendo..." + PLAIN_TEXT + ANSI_RESET);
                    wait(500);
                    System.exit(0);
                }
                break;
            case 4:
                System.out.println(BOLD_TEXT + ANSI_GREEN + "[ i ] Has elegido DIVISION" + PLAIN_TEXT + ANSI_RESET);
                System.out.print(BOLD_TEXT + ANSI_BLUE + "[ ? ] Ingresa el primer número: " + PLAIN_TEXT + ANSI_RESET);
                num1 = sc.next();
                checkChars(num1);
                System.out.println(
                        BOLD_TEXT + ANSI_GREEN + "[ i ] Has introducido el número " + num1 + PLAIN_TEXT + ANSI_RESET);
                System.out.print(BOLD_TEXT + ANSI_BLUE + "[ ? ] Ingresa el segundo nùmero: " + PLAIN_TEXT + ANSI_RESET);
                num2 = sc.next();
                checkChars(num2);
                System.out.println(
                        BOLD_TEXT + ANSI_GREEN + "[ i ] Has introducido el número " + num2 + PLAIN_TEXT + ANSI_RESET);
                divide(num1, num2);
                System.out.print(BOLD_TEXT + ANSI_BLUE + "[ ? ] ¿Quieres realizar otra operación? s/n " + PLAIN_TEXT
                        + ANSI_RESET);
                answer = sc.next();
                if (answer.equals("s")) {
                    wait(1000);
                    main(args);
                } else {
                    System.out.println("\n");
                    System.out.println(BOLD_TEXT + ANSI_RED + "[ i ] Saliendo..." + PLAIN_TEXT + ANSI_RESET);
                    wait(500);
                    System.exit(0);
                }
                break;
            case 5:
                System.out.println(BOLD_TEXT + ANSI_GREEN + "[ i ] Acerca De" + PLAIN_TEXT + ANSI_RESET);
                System.out.println("\n");
                System.out.println(BOLD_TEXT + ANSI_BLUE + "[ i ] Autor: Gabriel Vargas (Github: @GabrielCrackPro)"
                        + PLAIN_TEXT + ANSI_RESET);
                System.out.println(BOLD_TEXT + ANSI_BLUE + "[ i ] Fecha: 26/09/2021" + PLAIN_TEXT + ANSI_RESET);
                break;
            case 6:
                System.out.println(BOLD_TEXT + ANSI_RED + "[ i ] Saliendo..." + PLAIN_TEXT + ANSI_RESET);
                wait(500);
                System.exit(0);
                break;
            default:
                System.out.println(
                        BOLD_TEXT + ANSI_RED + "[ ! ] Por favor, elige una opcion válida" + PLAIN_TEXT + ANSI_RESET);
                wait(1000);
                main(args);
                break;
        }
        sc.close();

    }

    public static void wait(int miliseconds) {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    } // Función para pausar el programa

    public static void checkChars(String input) {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String BOLD_TEXT = "\033[0;1m";
        String PLAIN_TEXT = "\033[0;0m";
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String symb = "!@,{}[]:;''#$%&/()=?|";
        String upperChars = chars.toUpperCase();
        for (int i = 0; i < input.length(); i++) {
            if (input.contains(chars) || input.contains(upperChars) || input.contains(symb)) {
                System.out.println(BOLD_TEXT + ANSI_RED + "[ ! ] Debes introducir un número" + PLAIN_TEXT + ANSI_RESET);
                wait(1000);
                System.exit(1);
            }
        }
    } // Función para comprobar que el usuario no ha introducido letras o simbolos

    public static void add(String n1, String n2) {
        // Colores
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String BOLD_TEXT = "\033[0;1m";
        String PLAIN_TEXT = "\033[0;0m";
        try {
            float num1 = Float.parseFloat(n1);
            float num2 = Float.parseFloat(n2);
            float sum = num1 + num2;
            System.out.println(
                    BOLD_TEXT + ANSI_GREEN + "[ + ] El resultado de la operación es " + sum + PLAIN_TEXT + ANSI_RESET);
            wait(500);
            System.out.println("\n");
        } catch (NumberFormatException e) {
            System.out.println(
                    BOLD_TEXT + ANSI_RED + "[ ! ] Los datos intrroducidos no son válidos, por favor intentalo de nuevo"
                            + PLAIN_TEXT + ANSI_RESET);
        }
    }

    public static void subtract(String n1, String n2) {
        // Colores
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String BOLD_TEXT = "\033[0;1m";
        String PLAIN_TEXT = "\033[0;0m";
        try {
            float num1 = Float.parseFloat(n1);
            float num2 = Float.parseFloat(n2);
            float sub = num1 - num2;
            wait(500);
            System.out.println(
                    BOLD_TEXT + ANSI_GREEN + "[ - ] El resultado de la operación es " + sub + PLAIN_TEXT + ANSI_RESET);
            System.out.println("\n");
        } catch (NumberFormatException e) {
            System.out.println(
                    BOLD_TEXT + ANSI_RED + "[ ! ] Los datos introducidos no son válidos, por favor intentalo de nuevo"
                            + PLAIN_TEXT + ANSI_RESET);
        }
    }

    public static void multiply(String n1, String n2) {
        // Colores
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String BOLD_TEXT = "\033[0;1m";
        String PLAIN_TEXT = "\033[0;0m";
        try {
            float num1 = Float.parseFloat(n1);
            float num2 = Float.parseFloat(n2);
            float mul = num1 * num2;
            wait(500);
            System.out.println(
                    BOLD_TEXT + ANSI_GREEN + "[ x ] El resultado de la operación es " + mul + PLAIN_TEXT + ANSI_RESET);
            System.out.println("\n");
        } catch (NumberFormatException e) {
            System.out.println(
                    BOLD_TEXT + ANSI_RED + "[ ! ] Los datos introducidos no son válidos, por favor intentalo de nuevo"
                            + PLAIN_TEXT + ANSI_RESET);
        }
    }

    public static void divide(String n1, String n2) {
        // Colores
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String BOLD_TEXT = "\033[0;1m";
        String PLAIN_TEXT = "\033[0;0m";
        try {
            float num1 = Float.parseFloat(n1);
            float num2 = Float.parseFloat(n2);
            if (num2 == 0) {
                System.out
                        .println(BOLD_TEXT + ANSI_RED + "[ ! ] No se puede dividir por cero" + PLAIN_TEXT + ANSI_RESET);
                System.exit(1);
            } else {
                float div = num1 / num2;
                wait(500);
                System.out.println(BOLD_TEXT + ANSI_GREEN + "[ / ] El resultado de la operación es " + div + PLAIN_TEXT
                        + ANSI_RESET);
                System.out.println("\n");
            }
        } catch (NumberFormatException e) {
            System.out.println(
                    BOLD_TEXT + ANSI_RED + "[ ! ] Los datos introducidos no son válidos, por favor intentalo de nuevo"
                            + PLAIN_TEXT + ANSI_RESET);
        }
    }
}