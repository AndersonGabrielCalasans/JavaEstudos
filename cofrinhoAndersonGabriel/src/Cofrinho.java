
/*
 * Classe principal do projeto "Cofrinho"
 * 
 * contem metodo main e implementacao dos metodos estaticos para execucao do programa 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Cofrinho {

    // variaveis estaticas da classe principal
    static Scanner input = new Scanner(System.in);
    static ArrayList<Moeda> listaDeMoedas;
    static double TotalEmReais = 0;

    public static void main(String[] args) throws Exception {

        // instancia ArrayList
        listaDeMoedas = new ArrayList<Moeda>();

        // Chama metodo menuPrincipal
        menuPrincipal();
    }

    // implementacao do metodo menu principal
    public static void menuPrincipal() {
        System.out.println("\n |------------- Cofrinho -------------|"
                + "\n |    Selecione a opção desejada:     |"
                + "\n |                                    |"
                + "\n | 1- Adicionar uma nova moeda        |"
                + "\n | 2- Remover uma moeda               |"
                + "\n | 3- Listas moedas do cofrinho       |"
                + "\n | 4- Mostrar o total em Reais        |"
                + "\n | 0- Encerrar                        |"
                + "\n |------------------------------------|");
        System.out.println();
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                adicionaMoeda();
                break;
            case 2:
                removeMoeda();
                break;
            case 3:
                listaMoedas();
                break;
            case 4:
                totalMoedas();
                break;
            case 0:
                System.out.println("\nObrigado por usar o cofrinho, volte sempre!");
                System.exit(0);
                break;

            default:
                System.out.println("\nOpção inválido!");
                menuPrincipal();
                break;
        }
    }

    // Cria metodo que adiciona as moedas
    public static void adicionaMoeda() {
        System.out.println("\n |------------- Cofrinho -------------|"
                + "\n |          Escolha a moeda:          |"
                + "\n |                                    |"
                + "\n | 1- Real;                           |"
                + "\n | 2- Dolar;                          |"
                + "\n | 3- Euro;                           |"
                + "\n | 0- Voltar.                         |"
                + "\n |------------------------------------|");
        System.out.println();
        int opcaoMenuAdicionaMoeda = input.nextInt();

        // Verifica se a opcao digitada é válida e se que voltar pro menu principal
        if (opcaoMenuAdicionaMoeda == 0) {
            menuPrincipal();
        } else if (opcaoMenuAdicionaMoeda < 0 || opcaoMenuAdicionaMoeda > 3) {
            System.out.println("\nOpção inválida!");
            adicionaMoeda();
        } else {
            System.out.println("\nDigite o valor da moeda:");
            double valorMoeda = input.nextDouble();

            switch (opcaoMenuAdicionaMoeda) {

                case 1:
                    // Cria moeda caso seja Real
                    listaDeMoedas.add(new Real(valorMoeda));
                    System.out.println("\nMoeda adicionada!");
                    menuPrincipal();
                    break;

                case 2:
                    // Cria moeda caso seja Dolar
                    listaDeMoedas.add(new Dolar(valorMoeda));
                    System.out.println("\nMoeda adicionada!");
                    menuPrincipal();
                    break;

                case 3:
                    // Cria moeda caso seja Euro
                    listaDeMoedas.add(new Euro(valorMoeda));
                    System.out.println("\nMoeda adicionada!");
                    menuPrincipal();
                    break;
            }
        }

    }

    // Cria metodo removeMoeda
    public static void removeMoeda() {

        // Valida se lista vazia
        validaListaMoedas();

        System.out.println("\n |------------- Cofrinho -------------|"
                + "\n |          Escolha a moeda:          |"
                + "\n |                                    |"
                + "\n | 1- Real;                           |"
                + "\n | 2- Dolar;                          |"
                + "\n | 3- Euro;                           |"
                + "\n | 0- Voltar.                         |"
                + "\n |------------------------------------|");

        int opcaoMenuRemoveMoeda = input.nextInt();

        // Transforma opcao em string
        String stringMoeda = "";

        switch (opcaoMenuRemoveMoeda) {
            case 1:
                stringMoeda = "Real";
                break;
            case 2:
                stringMoeda = "Dolar";
                break;
            case 3:
                stringMoeda = "Euro";
                break;
            case 0:
                menuPrincipal();
                break;

            default:
                System.out.println("\nOpção Inválida!");
                menuPrincipal();
                break;
        }

        System.out.println("\nDigite o valor da moeda: ");
        System.out.println();
        double valorMoeda = input.nextDouble();

        // Valida se valor da moeda é maior que 0
        if (valorMoeda <= 0) {
            System.out.println("\nValor inválido!");
            menuPrincipal();
        }

        boolean validador = false; // validador de sucesso
        for (Moeda moeda : listaDeMoedas) {
            if (moeda.getTipoMoeda() == stringMoeda && moeda.getValor() == valorMoeda) {
                listaDeMoedas.remove(moeda);
                validador = true;
                break;
            }
        }

        // Valida se encontrou a moeda
        if (validador == true) {
            System.out.println("\nMoeda retirada com sucesso!");
        } else {
            System.out.println("\nMoeda não encontrada!");
        }

        // Retorna menu principal
        menuPrincipal();
    }

    // cria metodo lista moedas
    public static void listaMoedas() {

        validaListaMoedas();
        System.out.println();
        
        // foreach que percorre a lista e retorna info das moedas
        for (Moeda moeda : listaDeMoedas) {
            moeda.info();
        }

        menuPrincipal();
    }

    // metodo que retorna o total convertido em reais
    public static void totalMoedas() {
        System.out.println();
        for (Moeda moeda : listaDeMoedas) {
            TotalEmReais += moeda.converter();
        }

        System.out.println();
        System.out.println("\nValor total do cofrinho em R$: " + TotalEmReais);

        menuPrincipal();
    }

    // Valida se existe moedas no cofrinho
    public static void validaListaMoedas() {
        if (listaDeMoedas.size() == 0) {
            System.out.println("\nLista vazia, adicione moedas primeiro!");
            menuPrincipal();
        }
    }
}
