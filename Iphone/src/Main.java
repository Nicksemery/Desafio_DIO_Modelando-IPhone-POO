import Domain.ControlScreen;
import Domain.SmartPhone;

import java.util.Scanner;

public class Main {

    private final static Scanner sc = new Scanner(System.in);
    private final static SmartPhone sp = new SmartPhone();

    public static void main(String[] args) {




        System.out.println("Olá e bem-vindo novo usuario. Qual o seu nome?");
        var nome = sc.nextLine();

        while (true) {
            System.out.println("=========");
            System.out.printf("Tela inicial de %s\n", nome);
            System.out.println("=========");

            System.out.println("1 - Phone");
            System.out.println("2 - IPod");
            System.out.println("3 - Internet");
            System.out.println("4 - Desligar");

            int inpt = sc.nextInt();
            sc.nextLine();

            if (inpt == 4) {
                System.out.println("Desligando...");
                break;
            }
            if (inpt < 1 || inpt > 3) {
                System.out.println("Opção inválida.");
                continue;
            }
            var menu = ControlScreen.values()[inpt -1 ];
            switch (menu) {
                case IPod -> {
                    System.out.println("1 - Selecionar Música");
                    System.out.println("2 - Tocar Música");
                    System.out.println("3 - Pausar Música");
                    System.out.println("4 - Retornar");
                    int selection = sc.nextInt();
                    sc.nextLine();
                    switch (selection){
                        case 1 -> {
                            System.out.println("Nome da música");
                            sp.SelecionarMusica(sc.nextLine());
                        }
                        case 2 -> sp.Tocar();
                        case 3 -> sp.Pausar();
                        case 4 -> {
                            break;
                        }
                    }
                }case Internet -> {
                    System.out.println("1 - Pesquisar na Internet");
                    System.out.println("2 - Adicionar nova aba");
                    System.out.println("3 - Atualizar Página");
                    System.out.println("4 - Retornar");
                    int selection = sc.nextInt();
                    sc.nextLine();
                    switch (selection){
                        case 1 -> {
                            System.out.println("Digite o nome do site ou url");
                            sp.ExibirPagina(sc.nextLine());
                        }
                        case 2 -> sp.AdicionarNovaAba();
                        case 3 -> sp.AtualizarPagina();
                        case 4 -> {break;}
                    }
                } case Phone -> {
                    System.out.println("1 - Ligar");
                    System.out.println("2 - Atender");
                    System.out.println("3 - Correio de voz");
                    System.out.println("4 - Retornar");
                    int selection = sc.nextInt();
                    sc.nextLine();
                    switch (selection){
                        case 1 -> {
                            System.out.println("Digite o número");
                            sp.Ligar(sc.nextLine());
                        }
                        case 2 -> sp.Atender();
                        case 3 -> sp.IniciarCorreioVoz();
                        case 4 -> {break;}
                    }
                }case Exit->System.exit(0);

            }

        }
    }
}