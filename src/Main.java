import ParametrosInvalidosException.ParametrosInvalidosException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int numeroUm = lerNumero(terminal);
        System.out.println("Digite o segundo parâmetro");
        int numeroDois = lerNumero(terminal);

        try {
            // chamando o método contendo a lógica de contagem
            contar(numeroUm, numeroDois);

        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
//  Faz a verificação se é número ou símbolo
    static int lerNumero(Scanner terminal) {
        while (true) {
            try {
                return terminal.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número válido:");
                terminal.next(); // Limpar o buffer do Scanner
            }
        }
    }

    static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException {
        if (numeroUm > numeroDois) {
            throw new ParametrosInvalidosException();
        }
        int contagem = numeroDois - numeroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }
}