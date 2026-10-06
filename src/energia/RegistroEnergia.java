package energia;

public class RegistroEnergia {
    private double valor_estimado;
    private String endereco;
    private String observacao;
    private boolean instalado;
    private int kWat_consumido;

    RegistroEnergia(double valor_estimado, String observacao){
        this.valor_estimado=valor_estimado;
        this.endereco=null;
        this.observacao=observacao;
        this.instalado=false;
        this.kWat_consumido=0;}


        public double  getValor_estimado(){
            return valor_estimado;
        }

        public string getEndereco(){
            
        }

    }

}
