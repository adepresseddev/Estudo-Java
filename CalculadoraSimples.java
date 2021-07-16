import java.util.Scanner;

public class CalculadoraSimples {

    Scanner input = new Scanner(System.in);

    public int Adicao() {

        System.out.println("Digite o Primeiro Valor: ");
        int num1 = input.nextInt();
        System.out.println("Digite o Segundo Valor: ");
        int num2 = input.nextInt();

        int resultado = num1 + num2;

        return resultado;

    }

    public int Subtracao() { 

        System.out.println("Digite o Primeiro Valor: ");
        int num1 = input.nextInt();
        System.out.println("Digite o Segundo Valor: ");
        int num2 = input.nextInt();

        int resultado = num1 - num2; 

        return resultado;

    }

    public int Divisao() {

        System.out.println("Digite o Primeiro Valor: ");
        int num1 = input.nextInt();
        System.out.println("Digite o Segundo Valor: ");
        int num2 = input.nextInt();

        int resultado = num1 / num2; 
        
        return resultado;
    }

    public int Multipicacao() { 
       
        System.out.println("Digite o Primeiro Valor: ");
        int num1 = input.nextInt();
        System.out.println("Digite o Segundo Valor: ");
        int num2 = input.nextInt();
       
        int resultado = num1 * num2;  
    
        return resultado;

    }

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

    
        System.out.println("Seja bem Vindo!!!");
        System.out.println("Selecione a Operação!");
        System.out.println("1 -- Adição");
        System.out.println("2 -- Subtração");
        System.out.println("3 -- Divisão");
        System.out.println("4 -- Multiplicação");
        System.out.println("0 -- Sair");

        int opcoes = input.nextInt();

        CalculadoraSimples c = new CalculadoraSimples();

        if (opcoes != 0){ 

            if(opcoes == 1) {

                int resultado = c.Adicao();

                System.out.println("O resultado foi " + resultado);

            } else if (opcoes == 2) {

                int resultado = c.Subtracao();

                System.out.println("O resultado foi " + resultado);

            } else if (opcoes == 3) {

                int resultado = c.Divisao();

                System.out.println("O resultado foi " + resultado);

            } else if (opcoes == 4) {

                int resultado = c.Multipicacao();

                System.out.println("O resultado foi " + resultado);

            }

        } else {

            System.out.println("Até depois!!");

        }
        
        input.close();
    
    }

}
