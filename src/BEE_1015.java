import java.util.Scanner;

public class BEE_1015 {
    public static void main(String[] args) {

        double x1, x2, y1, y2, distancia;

        Scanner leitor = new Scanner(System.in);

        x1 = leitor.nextDouble();
        x2 = leitor.nextDouble();
        y1 = leitor.nextDouble();
        y2 = leitor.nextDouble();

        distancia = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));

        System.out.printf("%.4f\n", distancia);


    }
}
