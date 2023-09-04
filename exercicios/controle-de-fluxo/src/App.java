public class App {
    public static void main(String[] args) throws Exception {
        int mes = 2;

        if (mes == 1) {
            System.out.println("Janeiro");
            System.out.println("Férias");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
            System.out.println("Férias");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
            System.out.println("Férias");
        } else {
            System.out.println("Número Inválido");
        }

        String diaSemana = "Segunda";

        switch (diaSemana) {
            case "Segunda":
                System.out.println(1);
                break;
            case "Terça":
                System.out.println(2);
                break;
            case "Quarta":
                System.out.println(3);
                break;
            case "Quinta":
                System.out.println(4);
                break;
            case "Sexta":
                System.out.println(5);
                break;
            case "Sábado":
                System.out.println(6);
                break;
            case "Domingo":
                System.out.println(7);
                break;
            default:
                System.out.println("Insira um dia valido");
        }

        int numero = 4;

        switch (numero) {
            case 1, 2, 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
                break;
        }
    }
}

// com if, exiba o nome do mes do ano de acordo com seu numero, evite o efeito
// flecha, faça tambem outro if que vereifique se o mes é julho dezembro ou
// janeiro, para assim exibir ferias

// com switch use string para a partir do dia da semana, exibir seu numero,
// ainda no switch, faça outro exemplo onde, se uma variavel inteira for entre 1
// e 3 exibir o texto "certo", se for 4 "errado", 5 'talvez' e os outro 'valor
// indefinido'.