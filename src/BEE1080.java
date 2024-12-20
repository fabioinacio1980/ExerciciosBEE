import java.util.Scanner;

public class BEE1080 {
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

        int valor;
        int maior = 0, pos = 0;

        for (int i = 0; i < 100; i++) {
            valor = teclado.nextInt();
            if(valor > maior){
                maior = valor;
                pos = i+1;
            }
        }
        System.out.println(maior);
        System.out.println(pos);

        teclado.close();
    }
}
