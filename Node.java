/**
 * Representa um nó na árvore de Código Morse.
 * Cada nó armazena um caractere e tem referências para um filho à esquerda (ponto)
 * e um filho à direita (traço).
 */
public class Node {
    char character; // O caractere correspondente (ex: 'A', 'B', 'C')
    Node left;      // Filho para o caminho do 'ponto' (.)
    Node right;     // Filho para o caminho do 'traço' (-)

    /**
     * Construtor para criar um nó com um caractere específico.
     * @param character O caractere a ser armazenado no nó.
     */
    public Node(char character) {
        this.character = character;
        this.left = null;
        this.right = null;
    }

    /**
     * Construtor padrão para criar um nó vazio (como a raiz).
     */
    public Node() {
        this.character = '\0'; // Caractere nulo para nós intermediários ou raiz
        this.left = null;
        this.right = null;
    }
}