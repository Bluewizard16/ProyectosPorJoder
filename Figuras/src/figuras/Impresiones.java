package figuras;
import java.util.Scanner;

public class Impresiones {

    Perimetros per = new Perimetros();
    Areas area = new Areas();
    Scanner s = new Scanner(System.in);
    
    void resultCuadrado() {
        System.out.print("Digite el valor del lado: ");
        float lado = s.nextFloat();
        area.calcularAreaCuadrado(lado);
        per.PC(lado);
    }
}
