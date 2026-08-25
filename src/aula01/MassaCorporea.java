package aula01;

public class MassaCorporea {
     double peso;
     double altura;
     double imc;
     String situacao;

     void calcularImc(){
        imc= peso / (altura * altura);
     }

     void definirSituação(){
      if (imc<17){
         situacao = "muito abaixo do peso";
      }

      else if (imc<18.5){
         situacao = "abaixo do peso";
      }

      else if(imc<25){
         situacao="peso normal";
      }

      else if(imc<30){
         situacao="acima do peso";
      }

      else if(imc<35){
         situacao="obesidade grau 1";
      }

      else if(imc<=40){
         situacao="obesidade grau 2";
      }

      else{
         situacao="obesidade grau 3";
      }

     }
}
