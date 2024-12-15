import java.util.Scanner;

public class BEE_1013 {
    public static void main(String[] args) {

        int a, b, c;

        Scanner leitor = new Scanner(System.in);

        a = leitor.nextInt();
        b = leitor.nextInt();
        c = leitor.nextInt();


        if(a > b && a > c) {
            System.out.println(a + " eh o maior");
        } else if (b > c){
            System.out.println(b + " eh o maior");
        } else {
            System.out.println(c + " eh o maior");
        }

    }
}
