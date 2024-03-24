
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
                            throw new ArithmeticException();
                        }
                        if (n < 0 | p < 0){
                            throw new ArithmeticException();
                        }
                    } catch (ArithmeticException e) {
                        System.out.println(" Ni n ni p poden ser zero.");
                    }
                case 2:
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

    }
}