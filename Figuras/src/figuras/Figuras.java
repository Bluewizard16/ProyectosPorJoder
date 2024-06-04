package figuras;

import java.util.Scanner;

public class Figuras{

    public static void main(String[] args) {

        Menu menu = new Menu();
        Impresiones imp = new Impresiones();
        Scanner s = new Scanner(System.in);
        int opt = 0;

        System.out.println("Bienvenido");
        do {
            menu.Menu();
            opt = s.nextInt();

            switch (opt) {
                case 1:
                    imp.resultCuadrado();
                    break;
                case 2:
                    imp.resultCirc();
                    break;
                case 3:
                    imp.resultRect();
                    break;
                case 4:
                    imp.resultTrian();
                    break;
                case 5:
                    imp.resultRombo();
                    break;
                case 6:
                    imp.resultParale();
                    break;
                case 7:
                    imp.resultTrap();
                    break;
                case 8:
                    imp.resultPolig();
                    break;
                case 9:
                    System.out.println("Saliendo.");
                    break;
                default:
                    System.out.println("Opción incorrecta!");
                    break;
            }

        } while (opt != 9);
        System.out.println("Vuelva pronto.");
    }
}
