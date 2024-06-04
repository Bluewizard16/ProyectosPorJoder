package figuras;

class Perimetros {

    // PC = perimetro cuadrado
    public float PC(float lado) {
        float perimetro = lado * 4;
        System.out.println("El perimetro es: " + perimetro + "\n");
        return perimetro;
    }
    
    public float PCir(float rad){
        float perimetro = (float) (Math.PI * (Math.pow(rad, 2)));
        System.out.println("El perimetro es: " + perimetro + "\n");
        return perimetro;
    }
    
    public float PRect(float baseT, float alturaT){
        float perimetro = (2 * baseT) + (2 * alturaT);
        System.out.println("El perímetro es: " + perimetro + "\n");
        return perimetro;
    }
    
    public float PTria(float lado1, float lado2, float lado3){
        float perimetro = lado1 + lado2 + lado3;
        System.out.println("El perimetro es: " + perimetro + "\n");
        return perimetro;
    }
    
    public float PROm(float ladoX){
        float perimetro = 4 * ladoX;
        System.out.println("El perimetro es; " + perimetro + "\n");
        return perimetro;
    }
    
    public float PParale(float baseP, float alturaP){
        float perimetro = (2 * baseP) + (2 * alturaP);
        System.out.println("El perimetro es: " + perimetro + "\n");
        return perimetro;
    }
    
    public float PTrap(float lado1T, float lado2T, float lado3T, float lado4T){
        float perimetro = lado1T + lado2T + lado3T + lado4T;
        System.out.println("El perimetro es: " + perimetro + "\n");
        return perimetro;
    }
    
    public float PPo(int n, float ladoPo){
        float perimetro = n * ladoPo;
        System.out.println("El perimetro es: " + perimetro + "\n");
        return perimetro;
    }
    
}
