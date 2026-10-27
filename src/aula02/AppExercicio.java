package aula02;
import java.util.InputMismatchException;
import 	java.util.Scanner;
public class AppExercicio {

    
    static double[] meses = {12500.56, 10345.90, 14007.45,  9075.67, 11346.80,  6788.99,
    						  8366.77, 15456.70,  9087.55, 10456.67, 14741.53, 12567.50};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        mostrarVetor();
        
        do {
			int mes = 0;
			boolean valido = true;

			while(valido == false){
				try{
					System.out.print("Informe o mês para alterar o faturamento: ");
					mes = input.nextInt();
				}
				catch (InputMismatchException e){
					System.out.println(" Elemento invalido atribuido.");
					continue;
				}

				if (mes == 0) {
					break;	
				}
			}
			
        	
        	System.out.println("O faturamento atual.......: " + meses[mes-1]);

        	System.out.print("Informe o novo faturamento: ");
        	double faturamento = input.nextDouble();
        	
        	alteraFaturamento(faturamento, mes);
        	System.out.println("Faturamento alterado!!!");  
        	
        	mostrarVetor();
        } while (true);
        input.close();
	}
	
	public static void mostrarVetor(){
        for (int i=0; i<meses.length; i++) {
            System.out.printf("%2d [%10.2f]\n",  (i+1), meses[i]);
        }
	}
	
	public static void alteraFaturamento(double valorFaturado, int mes) {
		meses[mes-1] = valorFaturado;
	}

}