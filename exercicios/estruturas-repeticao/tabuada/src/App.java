import java.util.Scanner;

/* Desnvolver um gerador de tabuada,
capaz de gerar a tabuada de qualquer numero inteiro.
O usuario deve informar de qual nummero ele deseja ver a tabuada.
*/

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();
        
        System.out.println("Tabuada de " + tabuada);

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
        }
    }
}
