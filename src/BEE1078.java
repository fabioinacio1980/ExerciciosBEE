import java.util.Scanner;

public class BEE1078 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor, resultado;

        valor = teclado.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            resultado = valor * i;
            System.out.println(i + " x " + valor + " = " + resultado);

        }
    }
}
