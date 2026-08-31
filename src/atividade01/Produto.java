package atividade01;
import java.util.Scanner;

public class Produto {
    int codigo;
    String descricao;
    double precoCusto;
    int qtdeEmEstoque = 0;
    Scanner input = new Scanner(System.in);

    int aumentarEstoque(int aumentoQtde) {
        qtdeEmEstoque = qtdeEmEstoque + aumentoQtde;
        return qtdeEmEstoque;
    }

    int baixarEstoque(int baixarQtde) {

        if (baixarQtde > qtdeEmEstoque) {
            qtdeEmEstoque = qtdeEmEstoque - baixarQtde;
        } else {
            System.out.println("Quantidade acima do possuido!");
        }
        return qtdeEmEstoque;
    }

     double calcularValorEstoque() {
        return qtdeEmEstoque * precoCusto;
    }

}
