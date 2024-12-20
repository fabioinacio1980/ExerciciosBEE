import java.util.Scanner;

public class BEE1094 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int linhas, cobaias, sapos = 0, ratos = 0, coelhos = 0;
        String tipo;
        double percSapos, percRatos, percCoelhos;

        linhas = teclado.nextInt();

        for (int i = 0; i < linhas; i++) {
            cobaias = teclado.nextInt();
            tipo = teclado.next();
            switch (tipo){
                case "S":
                    sapos += cobaias;
                    break;
                case "R":
                    ratos += cobaias;
                    break;
                case "C":
                    coelhos += cobaias;
                    break;
            }


        }
        percCoelhos = ((double) coelhos / (sapos + ratos + coelhos));
        percRatos = ((double) ratos / (sapos + ratos + coelhos));
        percSapos = ((double) sapos / (sapos + ratos + coelhos));

        System.out.println("Total: " + (sapos + ratos + coelhos) + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);
        System.out.println(String.format("Percentual de coelhos: %.2f", percCoelhos*100) + " %");
        System.out.println(String.format("Percentual de ratos: %.2f", percRatos*100) + " %");
        System.out.println(String.format("Percentual de sapos: %.2f", percSapos*100) + " %");
        teclado.close();
    }
}
