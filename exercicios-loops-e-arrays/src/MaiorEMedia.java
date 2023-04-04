import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        int num;
        int cont = 0;
        int maior=0;
        double media;
        double soma = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Número: ");
            num = scan.nextInt();
            if (cont == 0){
                maior = num;
            }
            else if (num > maior){
                maior = num;
            }
            soma = soma + num;
            cont ++;
        } while (cont < 5);
        
        System.out.println();

        System.out.println("O maior é: " + maior);
        media = soma/5;
        System.out.println("A média é: " + media);

        scan.close();
    }
}
