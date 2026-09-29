package atividade02;

public class RegistroEnergia{
    private double valorEstimado;
    private String endereco;
    private String observacao;
    private boolean instalado;
    private double kWaConsumido;
    
    
    
    public RegistroEnergia(double valorEstimado, String observacao){
        this.valorEstimado=valorEstimado;
        this.observacao=observacao;}
        
        
        public boolean instalar(String endereco){
            if(!instalado){
                this.endereco=endereco;
                this.kWaConsumido=0;
                this.instalado=true;
                return true;
                }
            return false;
        }
        public double desinstalar(int qtdWa){
            if(this.instalado){
                this.kWaConsumido= qtdWa*0.78;
                this.endereco= null;
                return kWaConsumido;
            }
            return 0;
        }
}
