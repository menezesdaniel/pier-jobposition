import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class questao02 {
    public static List<Integer> fibonacciAteNumero(int numero) {
        // Verifica se o limite é negativo
        if (numero < 0) {
            return new ArrayList<>();
        }

        // Início da sequência com 0 e 1
        List<Integer> sequencia = new ArrayList<>();
        sequencia.add(0);
        sequencia.add(1);

        while (true) {            
            int proxNum = sequencia.get(sequencia.size() - 1) + sequencia.get(sequencia.size() - 2);
            int found = 0;
            if (proxNum > numero) {
                if (found == 0){
                    System.out.println("## AVISO: número informado NÃO pertence a sequência de Fibonacci! ##");
                }
                break;
            } else {
                if (proxNum == numero) {
                    found = numero;
                    System.out.println("## AVISO: número informado pertence a sequência de Fibonacci! ##");
                }
            }            
            sequencia.add(proxNum);
        }

        return sequencia;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número desejado: ");
        int numero = scanner.nextInt();
        
        List<Integer> resultado = fibonacciAteNumero(numero);

        // Imprime a sequência gerada
        System.out.println("Sequência de Fibonacci gerada: " + resultado);
    }
}
