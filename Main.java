import java.util.Scanner;

/**
 * Classe principal para executar o decodificador de Código Morse.
 * O programa solicita ao usuário uma sequência de Código Morse e a decodifica.
 */
public class Main {
    public static void main(String[] args) {
        // 1. Inicializa e constrói a árvore Morse
        MorseTree morseTree = new MorseTree();

        // 2. Imprime a árvore resultante no console
        morseTree.printTree();

        // 3. Configura o leitor de input do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDecodificador de Código Morse");
        System.out.println("-------------------------------");
        System.out.println("Regras:");
        System.out.println("- Use '.' para ponto e '-' para traço.");
        System.out.println("- Separe o código de cada letra com um espaço.");
        System.out.println("- Exemplo: .... . .-.. .-.. ---");
        System.out.print("\nDigite o código Morse para decodificar: ");

        // 4. Lê a entrada do usuário
        String userInput = scanner.nextLine();

        // 5. Decodifica a entrada e exibe o resultado
        if (userInput != null && !userInput.trim().isEmpty()) {
            String decodedMessage = morseTree.decodeWord(userInput);
            System.out.println("\nPalavra Decodificada: " + decodedMessage);
        } else {
            System.out.println("\nNenhuma entrada fornecida. O programa será encerrado.");
        }
        
        scanner.close();
    }
}
