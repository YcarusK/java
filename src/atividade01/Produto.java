package atividade01;

public class Produto {
    int codigo;
    String descricao;
    double precoCusto;
    int qtdeEmEstoque = 0;

    int aumentarEstoque(int aumentoQtde) {
        qtdeEmEstoque = qtdeEmEstoque + aumentoQtde;
        return qtdeEmEstoque;
    }

    int baixarEstoque(int baixarQtde) {
        if (baixarQtde > qtdeEmEstoque) {
           return - 1;
        } 
         {
            qtdeEmEstoque = qtdeEmEstoque - baixarQtde;
            return qtdeEmEstoque;   
        }
    }

     double calcularValorEstoque() {
        return qtdeEmEstoque * precoCusto;
    }

}
