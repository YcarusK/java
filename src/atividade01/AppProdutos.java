package atividade01;
import java.util.Scanner;

public class AppProdutos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Produto p = new Produto();

        System.out.println("Digite o Codigo do Produto ");
        p.codigo = input.nextInt();
        input.nextLine();

        System.out.println("Descreva o produto ");
        p.descricao = input.nextLine();

        System.out.println("Digite o preço ");
        p.precoCusto = input.nextDouble();

        System.out.println("Produto Cadastrado, prosseguindo... ");

        boolean prosseguir = true;
        while (prosseguir) {
            System.out.println("Cadastro de Produtos: Selecione uma das seguintes opções");
            System.out.println("1 - aumentar estoque");
            System.out.println("2 - diminuir estoque");
            System.out.println("3 - verificar estoque");
            System.out.println("4 - Encerrar");
            int escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Defina um valor para o aumento: ");
                    int aumentoQtde = input.nextInt();
                    p.aumentarEstoque(aumentoQtde);
                    System.out.println("O valor atual do estoque é " + p.qtdeEmEstoque);
                    break;

                case 2:
                    System.out.println("Defina um valor para a diminuição: ");
                    
                    int baixarQtde = input.nextInt();
                    int resultado = p.baixarEstoque(baixarQtde);

                    if(resultado == -1){
                        System.out.println("Estoque insuficiênte");
                        System.out.println("O valor atual do estoque é " + p.qtdeEmEstoque);
                    }

                    else{
                    System.out.println("O valor atual do estoque é " + p.qtdeEmEstoque);
                    }
                    break;

                case 3:
                    System.out.println("Verificando...");
                    System.out.println("O valor do estoque atual é " + p.calcularValorEstoque());
                    break;

                case 4:
                    prosseguir = false;
                    System.out.println("Encerrando Serviço...");
                    break;

                default:
                    System.out.println("Opção indisponivel");
                    break;
            }
        }
        input.close();
    }
}
