import java.util.Scanner;

/* Faça um programa que calcule o fatorial 
de um numero inteiro fornecido pelo usuario
*/

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;
        
        
        System.out.print(fatorial +"! = ");
        for (int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }
        
        System.out.println(multiplicacao);
    }
}
