package exercicio2;

public class Main{
    public static void main(String[] args) {
        System.out.println("Exercício quadrilátero");
        double areaQuadrado = Quadrilatero.area(3);
        double areaRetângulo = Quadrilatero.area(5d,5d);
        double areaTrapezio = Quadrilatero.area(7,8,9);
        double areaLosango = Quadrilatero.area(5f,5f);

        System.out.println("A área do quadrado é: " + areaQuadrado);
        System.out.println("A área do retangulo é: " + areaRetângulo);
        System.out.println("A área do trapezio é: " + areaTrapezio);
        System.out.println("A área do losango é: " + areaLosango);
    }
    
    
    

}