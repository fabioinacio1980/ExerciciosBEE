import java.util.Scanner;

public class BEE1116 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int linhas;
        double a, b, resultado;

        linhas = teclado.nextInt();

        for (int i = 0; i < linhas; i++) {
            a = teclado.nextDouble();
            b = teclado.nextDouble();
            if(b != 0){
                resultado = a / b;
                System.out.printf("%.1f\n", resultado);
            }
            else{
                System.out.println("divisao impossivel");
            }
        }
        teclado.close();
    }
}
