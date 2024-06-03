package figuras;

class Areas extends Perimetros {

    public float calcularAreaCuadrado(float lado) {
        float area = lado * lado;
        System.out.println("El area es: " + area);
        return area;
    }

    public float calcularAreaCirculo(float radio) {
        float area = (float) (Math.PI * (Math.pow(radio, 2)));
        System.out.println("El area es: " + area);
        return area;
    }

    public float calcularAreaRectangulo(float base, float altura) {
        float area = base * altura;
        System.out.println("El area es: " + area);
        return area;
    }

    public float calcularAreaTriangulo(float base, float altura) {
        float area = (base * altura) / 2;
        System.out.println("El area es: " + area);
        return area;
    }

    public float calcularAreaRombo(float dMayor, float dMenor) {
        float area = (dMayor * dMenor) / 2;
        System.out.println("El area es: " + area);
        return area;
    }

    public float calcularAreaParalelogramo(float baseP, float alturaP) {
        float area = baseP * alturaP;
        System.out.println("El area es: " + area);
        return area;
    }

    // baseTMayor = Base Trapecio Mayor
    // baseTMenor = Base Trapecio Menor
    // alturaT = Altura Trapecio
    public float calcularAreaTrapecio(float baseTMayor, float baseTMenor, float alturaT) {
        float area = ((baseTMayor + baseTMenor) / 2) * alturaT;
        System.out.println("El area es: " + area);
        return area;
    }

    // n = cantidad lados
    // ladoP = valor del lado del poligono regular
    // apotema = Apotema
    public float calcularAreaPoligonoRegular(int n, float ladoP, float apotema) {
        float area = ((n * ladoP) * apotema) / 2;
        return area;
    }
}
