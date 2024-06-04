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
    
    void resultCirc(){
        System.out.println("Digite el valor del radio: ");
        float radio = s.nextFloat();
        
        area.calcularAreaCirculo(radio);
        per.PCir(radio);
    }
    
    void resultRect(){
        System.out.print("Digite el valor de la base: ");
        float base = s.nextFloat();
        System.out.print("Digite el valor de la altura: ");
        float altura = s.nextFloat();
        
        area.calcularAreaRectangulo(base, altura);
        per.PRect(base, altura);
    }
    
    void resultTrian(){
        System.out.print("Digite el valor de la base: ");
        float base = s.nextFloat();
        System.out.print("Digite el valor de la altura: ");
        float altura = s.nextFloat();
        System.out.print("Digite el valor del lado 1: ");
        float lado1 = s.nextFloat();
        System.out.print("Digite el valor del lado 2");
        float lado2 = s.nextFloat();
        System.out.print("Digite el valor del lado 3");
        float lado3 = s.nextFloat();
        
        area.calcularAreaTriangulo(base, altura);
        per.PTria(lado1, lado2, lado3);
    }
    
    // Rombo regular
    void resultRombo(){
        System.out.print("Digite el valor de la diagonal mayor: ");
        float dMayor = s.nextFloat();
        System.out.print("Digite el valor de la diagonal menor: ");
        float dMenor = s.nextFloat();
        System.out.print("Digite el valor de uno de sus lados: ");
        float ladoX = s.nextFloat();
        
        area.calcularAreaRombo(dMayor, dMenor);
        per.PROm(ladoX);
    }
    
    void resultParale(){
        System.out.print("Digite el valor de la base: ");
        float base = s.nextFloat();
        System.out.print("Digite el valor de la altura: ");
        float altura = s.nextFloat();
        
        area.calcularAreaParalelogramo(base, altura);
        per.PParale(base, altura);
    }
    
    void resultTrap(){
        System.out.print("Digite el valor de la base mayor: ");
        float baseMa = s.nextFloat();
        System.out.print("Digite el valor de la base menor: ");
        float baseMe = s.nextFloat();
        System.out.print("Digite el valor de la altura: ");
        float altura = s.nextFloat();
        System.out.print("Digite le valor del lado 1: ");
        float lado1 = s.nextFloat();
        System.out.print("Digite le valor del lado 2: ");
        float lado2 = s.nextFloat();
        System.out.print("Digite le valor del lado 3: ");
        float lado3 = s.nextFloat();
        System.out.print("Digite le valor del lado 4: ");
        float lado4 = s.nextFloat();
        
        area.calcularAreaTrapecio(baseMa, baseMe, altura);
        per.PTrap(lado1, lado2, lado3, lado4);
    }
    
    void resultPolig(){
        System.out.print("Indique el numero de lados del Polígono Regular: ");
        int nLados = s.nextInt();
        System.out.print("Digite el valor de uno de los lados: ");
        float lado = s.nextFloat();
        System.out.print("Digite el valor de la apotema: ");
        float apotema = s.nextFloat();
        
        area.calcularAreaPoligonoRegular(nLados, lado, apotema);
        per.PPo(nLados, lado);
    }
}
