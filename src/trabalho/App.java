package trabalho;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int botao;

        Item[] pecas = new Item[5];

        Acessorio a = new Acessorio("Bolsa", 5, 5, 10);
        RoupaTamanhoUnico r = new RoupaTamanhoUnico("Short de praia", 6, 30, 100);
        RoupaPMG r1 = new RoupaPMG("Camisa do Palmeiras", 5, 10, 10, 5, 100);
        Acessorio b = new Acessorio("Chapeu", 5, 6, 10);
        RoupaPMG r9 = new RoupaPMG("Camisa do Belo", 5, 1, 10, 5, 100);

        pecas[0] = a;
        pecas[1] = r;
        pecas[2] = r1;
        pecas[3] = b;
        pecas[4] = r9;

        String pessoa;

        do {
            System.out.println("0 - " + pecas[0].getDescricao());
            System.out.println("1 -" + pecas[1].getDescricao());
            System.out.println("2 -" + pecas[2].getDescricao());
            System.out.println("3 -" + pecas[3].getDescricao());
            System.out.println("4 -" + pecas[4].getDescricao());
            System.out.println("5 - Sair do Sistema");

            System.out.println("Escolha uma das opcoes acima");
            botao = sc.nextInt();

            switch (botao) {

                case 0:
                    try {
                        pecas[0].venda();
                        pecas[0].reposicaoEstoque();
                    } catch (ValorIncorretoException e) {
                        System.out.println(e.getMessage());
                    } catch (EstoqueNoMaxException j) {
                        System.out.println(j.getMessage());
                    } catch (InputMismatchException nfe) {
                        System.out.println("Isso nao e um valor valido!");
                    }

                    break;

                case 1:
                    try {
                        pecas[1].venda();
                        pecas[1].reposicaoEstoque();
                    } catch (ValorIncorretoException e) {
                        System.out.println(e.getMessage());
                    } catch (EstoqueNoMaxException j) {
                        System.out.println(j.getMessage());
                    }
                    break;

                case 2:
                    try {
                        pecas[2].venda();
                        pecas[2].reposicaoEstoque();
                    } catch (ValorIncorretoException e) {
                        System.out.println(e.getMessage());
                    } catch (EstoqueNoMaxException j) {
                        System.out.println(j.getMessage());
                    }
                    break;

                case 3:
                    try {
                        pecas[3].venda();
                        pecas[3].reposicaoEstoque();
                    } catch (ValorIncorretoException j) {
                        System.out.println(j.getMessage());
                    } catch (EstoqueNoMaxException j) {
                        System.out.println(j.getMessage());
                    } catch (InputMismatchException nfe) {
                        System.out.println("Isso nao e um valor valido");
                    }
                    break;

                case 4:
                    try {
                        pecas[4].venda();
                        pecas[4].reposicaoEstoque();
                    } catch (ValorIncorretoException e) {
                        System.out.println(e.getMessage());
                    } catch (EstoqueNoMaxException j) {
                        System.out.println(j.getMessage());
                    }
                    break;

                case 5:

                    System.out.println(pecas[0].toString() +
                            pecas[1].toString() +
                            pecas[2].toString() +
                            pecas[3].toString() +
                            pecas[4].toString());
                    break;

                default:
                    System.out.println("Opção invalida, tente novamente");
            }

        } while (botao != 5);

    }

}
