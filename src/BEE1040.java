import java.util.Scanner;

public class BEE1040 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, notaExame, media, mediaExame, soma;

        nota1 = teclado.nextDouble();
        nota2 = teclado.nextDouble();
        nota3 = teclado.nextDouble();
        nota4 = teclado.nextDouble();

        soma = nota1 + nota2 + nota3 + nota3;
        System.out.printf("%.1f\n", soma);

        media = (nota1 * 0.2) + (nota2 + 0.3) + (nota3 * 0.4) + (nota4 * 0.1);

        if(media >= 7.0){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");
        }
        else if(media >= 5.0 && media < 7.0){
            System.out.printf("Media: %.1f", media);
            System.out.println("Aluno em exame.");
            notaExame = teclado.nextDouble();
            System.out.printf("Nota do exame: %.1f", notaExame);
            mediaExame = (media + notaExame) / 2.0;
            if(mediaExame >= 5.0){
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
        }
        else if(media < 5.0){
            System.out.printf("Media: %.1f", media);
            System.out.println("Aluno reprovado.");
        }


        teclado.close();
    }
}
