import java.util.Scanner;

public class BEE1117 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double notas, total = 0, media;

        int contador = 0, sentinela = 0;


        do {
            while(contador < 2) {
                    notas = teclado.nextDouble();
                    if (notas >= 0.0 && notas <= 10.0) {
                        total += notas;
                        contador++;
                    } else {
                        System.out.println("nota invalida");
                    }
                }
            media = total / contador;
            System.out.println("media = " + media);
            System.out.println("novo calculo (1-sim 2-nao)");
            sentinela = teclado.nextInt();
            if(sentinela == 2) {
                break;
            }
        } while (sentinela != 2);
        teclado.close();
    }
}
