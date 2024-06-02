package figuras;

import java.util.Scanner;

public class Figuras extends Menu{

    public static void main(String[] args) {

        Menu menu = new Menu();
        Perimetros per = new Perimetros();
        Areas area = new Areas();
        Scanner s = new Scanner(System.in);
        int opt = 0;

        System.out.println("Bienvenido");
        do {
            menu.Menu(); 
            opt = s.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("Digite el valor del lado: ");
                    float lado = s.nextFloat();
                    menu.calcularAreaCuadrado(lado);
                    per.PC(lado);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
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
