import java.util.Scanner;

public class BEE1079 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int linhas;
        float valor1, valor2, valor3, media;

        linhas = teclado.nextInt();


        for (int i = 0; i < linhas ; i++) {
            valor1 = teclado.nextFloat();
            valor2 = teclado.nextFloat();
            valor3 = teclado.nextFloat();
            media = (valor1 * 0.2f) + (valor2 * 0.3f) + (valor3 * 0.5f);
            System.out.printf("%.1f\n", media);
        }


        teclado.close();
    }
}
