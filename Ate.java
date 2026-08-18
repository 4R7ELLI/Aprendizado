import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ate{
    static void main(String [] args) {
        Scanner input= new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        System.out.println("-----Olá, seja bem vindo!----- ");
        System.out.println("-----Ao Menu Principal-----");
        System.out.println("Aviso: a cada 3 itens colocado na sua lista iremos perguntar a você se desejar continuar.");
        System.out.printf("Vamos começar a montar a sua lista de compras? ");
        String continua= input.next();
        double valort= 0 ;
        while (continua.equalsIgnoreCase("sim")){
            for (int i = 0; i < 3; i++) {
                System.out.printf("Produto: ");
                String produto = input.next();
                produto = Character.toUpperCase(produto.charAt(0)) + produto.substring(1).toLowerCase();
                System.out.printf("Valor do produto: ");
                Double valor = input.nextDouble();
                valort= valor+valort;
                System.out.println("o valor total ta dando: "+valort);
                lista.add(produto+"-R$"+valor);
            }

            System.out.printf("desejar continuar? ");
            continua= input.next();
        }
        System.out.println("-----Menu Final-----");
        System.out.println("1. Desejar vê a sua lista.");
        System.out.println("2. Desejar vê o total final.");
        System.out.println("3. Mostra tudo: ");
        System.out.printf("Qual das opções você desejar? ");
        int opcao = input.nextInt();
        if (opcao == 1){
            System.out.println(lista);
        }else if (opcao==2){
            System.out.println("R$"+valort);
        }else {
            System.out.println(lista+"-R$"+valort);
        }
    }
}