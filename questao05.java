import java.util.Scanner;

public class questao05 {
    public static String inverterString(String input) {        
        char[] seqCaracteres = input.toCharArray();
                
        int inicio = 0;
        int fim = seqCaracteres.length - 1;
        
        while (inicio < fim) {
            char temp = seqCaracteres[inicio];
            seqCaracteres[inicio] = seqCaracteres[fim];
            seqCaracteres[fim] = temp;
            inicio++;
            fim--;
        }
        
        return new String(seqCaracteres);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a string a ser invertida: ");
        String input = scanner.nextLine();

        // Chama a função para inverter a string
        String stringInvertida = inverterString(input);
        System.out.println("String invertida: " + stringInvertida);
        System.out.println("Programa finalizado!");
    }
}
