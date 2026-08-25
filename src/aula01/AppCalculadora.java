package aula01;


public class AppCalculadora {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        calc.operando1= 10;
        calc.operando2= 5;
        System.out.println("Adição: " + calc.adicao());
        System.out.println("Subtração: " + calc.subtracao());
        System.out.println("Multiplicação: " + calc.multiplicacao());
        System.out.println("Divisão: " + calc.divisão());
        
    }

}
