import java.util.Scanner;

public class Indicemassacorporal {

    public static void main (String[] args) {

        System.out.println("Calculadora para Massa Corporal");
        Scanner indice = new Scanner (System.in);   

        System.out.print("Informe seu Peso: ");
        double peso = indice.nextDouble();
        System.out.print("Informe sua Altura: ");
        double altura = indice.nextDouble();
        
        double imc;
        imc = peso / (altura * altura);
        System.out.println("Seu Índice de Massa Corporal é " + imc);

        
    }
    
}
