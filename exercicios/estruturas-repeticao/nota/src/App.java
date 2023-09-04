import java.util.Scanner;

/* Faça um programa que peça uma nota entre 0 e 10.
Mostre uma mensagem caso o valor seja invalido
 e continue pedindo ate que insira outro valor valido
*/

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota Invalida! Digite novamente: ");
            nota = scan.nextInt();
        }
    }
}
