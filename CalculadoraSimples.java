import java.util.Scanner;

public class Calc {

    public int Adicao(int num1, int num2) { int resultado = num1 + num2; return resultado; }

    public int Subtracao(int num1, int num2) {  int resultado = num1 - num2; return resultado; }

    public int Divisao(int num1, int num2) { int resultado = num1 / num2; return resultado; }

    public int Multipicacao(int num1, int num2) { int resultado = num1 * num2; return resultado; }

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        int num1, num2;
    
        System.out.println("Seja bem Vindo!!!");
        System.out.println("Selecione a Operação!");
        System.out.println("1 -- Adição");
        System.out.println("2 -- Subtração");
        System.out.println("3 -- Divisão");
        System.out.println("4 -- Multiplicação");
        System.out.println("0 -- Sair");

        int opcoes = input.nextInt();

        Calc c = new Calc();

        int resultado;

        if (opcoes != 0){ 

            if(opcoes == 1) {

                System.out.println("Digite o Primeiro Valor: ");
                num1 = input.nextInt();
                System.out.println("Digite o Segundo Valor: ");
                num2 = input.nextInt();

                resultado = c.Adicao(num1, num2);

                System.out.println("O resultado foi %d", resultado);

            } else if (opcoes == 2) {

                System.out.println("Digite o Primeiro Valor: ");
                num1 = input.nextInt();
                System.out.println("Digite o Segundo Valor: ");
                num2 = input.nextInt();

                resultado = c.Subtracao(num1, num2);

                System.out.println("O resultado foi %d", resultado);

            } else if (opcoes == 3) {

                System.out.println("Digite o Primeiro Valor: ");
                num1 = input.nextInt();
                System.out.println("Digite o Segundo Valor: ");
                num2 = input.nextInt();

                resultado = c.Divisao(num1, num2);

                System.out.println("O resultado foi %d", resultado);

            } else if (opcoes == 4) {

                System.out.println("Digite o Primeiro Valor: ");
                num1 = input.nextInt();
                System.out.println("Digite o Segundo Valor: ");
                num2 = input.nextInt();

                resultado = c.Multipicacao(num1, num2);

                System.out.println("O resultado foi %d", resultado);

            }

        } else {

            System.out.println("Até depois!!");

        }
    
    }

}
