import java.util.Scanner;

public class BEE_1044 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int a, b;

        a = teclado.nextInt();
        b = teclado.nextInt();

        if(a > b) {
            if (a % b == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        } else if( a < b){
            if (b % a == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        }

        teclado.close();


    }

}
