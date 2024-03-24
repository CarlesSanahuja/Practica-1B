.
import java.util.Scanner;

public class Main {
    public static Scanner scan;

    public Main() {
    }
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
                        exercici1();
                    } catch (Exception var5) {
                        var5.printStackTrace();
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
    public static void exercici1() {

    }
}