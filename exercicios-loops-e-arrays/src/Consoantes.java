import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] consoantes = new String[6];
        int qtdConsoantes = 0;

        int cont = 0;
        do{
            System.out.println("Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a")
                    ||letra.equalsIgnoreCase("e")
                    ||letra.equalsIgnoreCase("i")
                    ||letra.equalsIgnoreCase("o")
                    ||letra.equalsIgnoreCase("u"))){
                consoantes[cont] = letra;
                        qtdConsoantes++;
            }
            cont++;
        } while(cont < consoantes.length);

        System.out.println(qtdConsoantes);
        System.out.println();
        /*for(int i = 0; i<=qtdConsoantes; i++){
            System.out.println(consoantes[i]);
        }*/

        for (String consoante : consoantes) {
            if (consoante != null){
                System.out.println(consoante + " ");
            }
            
        }
        System.out.println("Deu certo");
        scan.close();
    }
}
