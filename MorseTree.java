/**
 * Gerencia a Árvore Binária para codificação e decodificação de Código Morse.
 * A estrutura da árvore segue a heurística do Código Morse:
 * - Navegar à esquerda para um 'ponto' (.).
 * - Navegar à direita para um 'traço' (-).
 */
public class MorseTree {

    private final Node root;

    /**
     * Construtor que inicializa a árvore e a popula com o alfabeto Morse padrão.
     */
    public MorseTree() {
        root = new Node(); // A raiz é um nó vazio
        buildTree();
    }

    /**
     * Insere um caractere na árvore com base em sua representação em Código Morse.
     * @param morseString A sequência de pontos e traços (ex: ".-").
     * @param character O caractere correspondente (ex: 'A').
     */
    public void insert(String morseString, char character) {
        Node currentNode = root;
        for (char c : morseString.toCharArray()) {
            if (c == '.') {
                if (currentNode.left == null) {
                    currentNode.left = new Node();
                }
                currentNode = currentNode.left;
            } else if (c == '-') {
                if (currentNode.right == null) {
                    currentNode.right = new Node();
                }
                currentNode = currentNode.right;
            }
        }
        currentNode.character = character;
    }

    /**
     * Decodifica uma palavra inteira fornecida em Código Morse.
     * @param morseWord Uma string contendo códigos Morse separados por espaços.
     * (Ex: "-- --- .-. ... .")
     * @return A palavra decodificada.
     */
    public String decodeWord(String morseWord) {
        StringBuilder decodedWord = new StringBuilder();
        // Divide a entrada por espaços para obter o código de cada letra
        String[] letters = morseWord.trim().split(" ");
        for (String morseLetter : letters) {
            decodedWord.append(decodeLetter(morseLetter));
        }
        return decodedWord.toString();
    }
    
    /**
     * Decodifica o código Morse de uma única letra.
     * @param morseLetter O código a ser decodificado (ex: "--").
     * @return O caractere decodificado.
     */
    private char decodeLetter(String morseLetter) {
        Node currentNode = root;
        for (char c : morseLetter.toCharArray()) {
            if (c == '.' && currentNode.left != null) {
                currentNode = currentNode.left;
            } else if (c == '-' && currentNode.right != null) {
                currentNode = currentNode.right;
            } else {
                return '?'; // Retorna '?' se o código for inválido
            }
        }
        return currentNode.character;
    }

    /**
     * Imprime a visualização da árvore no console.
     * Este método inicia a chamada recursiva.
     */
    public void printTree() {
        System.out.println("--- Visualização da Árvore Morse ---");
        printTreeRecursive(root, "", true);
        System.out.println("------------------------------------");
    }

    /**
     * Método recursivo auxiliar para imprimir a árvore de forma clara.
     * @param node O nó atual a ser impresso.
     * @param prefix O prefixo de formatação para desenhar as linhas.
     * @param isTail Indica se é o último nó de um galho.
     */
    private void printTreeRecursive(Node node, String prefix, boolean isTail) {
        if (node == null) {
            return;
        }
        System.out.println(prefix + (isTail ? "└── " : "├── ") + (node.character != '\0' ? node.character : "ROOT"));
        
        // O filho da direita vem primeiro para uma visualização mais intuitiva (formato deitado)
        if (node.left != null || node.right != null) {
            if (node.right != null) {
                printTreeRecursive(node.right, prefix + (isTail ? "    " : "│   "), node.left == null);
            }
            if (node.left != null) {
                printTreeRecursive(node.left, prefix + (isTail ? "    " : "│   "), true);
            }
        }
    }


    /**
     * Popula a árvore com o alfabeto e números em Código Morse.
     */
    private void buildTree() {
        // Letras
        insert(".-", 'A');
        insert("-...", 'B');
        insert("-.-.", 'C');
        insert("-..", 'D');
        insert(".", 'E');
        insert("..-.", 'F');
        insert("--.", 'G');
        insert("....", 'H');
        insert("..", 'I');
        insert(".---", 'J');
        insert("-.-", 'K');
        insert(".-..", 'L');
        insert("--", 'M');
        insert("-.", 'N');
        insert("---", 'O');
        insert(".--.", 'P');
        insert("--.-", 'Q');
        insert(".-.", 'R');
        insert("...", 'S');
        insert("-", 'T');
        insert("..-", 'U');
        insert("...-", 'V');
        insert(".--", 'W');
        insert("-..-", 'X');
        insert("-.--", 'Y');
        insert("--..", 'Z');
        // Números
        insert("-----", '0');
        insert(".----", '1');
        insert("..---", '2');
        insert("...--", '3');
        insert("....-", '4');
        insert(".....", '5');
        insert("-....", '6');
        insert("--...", '7');
        insert("---..", '8');
        insert("----.", '9');
    }
}