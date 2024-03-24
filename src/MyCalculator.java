
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyCalculator {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int opcio;
        do {
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
            System.out.println("* Practica 1B                                                           *");
            System.out.println("* 1. Exercici 1                                                         *");
            System.out.println("* 2. Exercici 2                                                         *");
            System.out.println("* 3. Exercici 3                                                         *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
            System.out.print("Entra una opció (0-4): ");


            opcio = scan.nextInt();
            scan.nextLine();
            switch (opcio) {
                case 1:
                    try {
                        int n = 0;
                        int p = 0;
                        System.out.println("Introdueix dos enters separats per un espai: ");
                        n = scan.nextInt();
                        p = scan.nextInt();

                        scan.nextLine();
                       if (n == 0 | p == 0){
                            throw new ArithmeticException(" Ni n ni p poden ser zero.");
                        }
                        if (n < 0 | p < 0){
                            throw new ArithmeticException(" Ni n ni p poden ser negatius");
                        }
                        longPower(n,p);
                    } catch (ArithmeticException e) {
                        System.out.println(e);
                    }
                case 2:
                    try {
                        int x = 0;
                        int y = 0;
                        System.out.println("Introduce dos enteros separados por un espacio: ");
                        String input = scan.nextLine(); // Leer toda la línea de entrada
                        String[] parts = input.split(" "); // Dividir la entrada en partes separadas por espacios

                        if (parts.length != 2) {
                            throw new InputMismatchException();
                        }

                        try {
                            x = Integer.parseInt(parts[0]); // Convertir la primera parte en un entero
                            y = Integer.parseInt(parts[1]); // Convertir la segunda parte en un entero
                        } catch (NumberFormatException e) {
                            throw new InputMismatchException();
                        }

                        if (y == 0) {
                            throw new ArithmeticException();
                        }


                        division(x, y);
                    } catch (ArithmeticException e) {
                        System.out.println(" 'y' no pueden ser cero.");
                    } catch (InputMismatchException e) {
                        System.out.println("Deben ser dos números enteros.");
                    }
                case 3:
                case 4:
                case 5:
                    break;
                default:
                    System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 12");
            }
        } while(opcio != 0);

    }
    public static void longPower(int n, int p) {
        System.out.println(Math.pow(n,p));
    }
    public  static  void division(int x, int y){
        System.out.println(x/y);
    }
}