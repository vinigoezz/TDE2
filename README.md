📟 Morse Code Decoder (Java Binary Tree)
Este projeto é uma ferramenta de linha de comando desenvolvida em Java que decodifica mensagens em Código Morse utilizando uma Árvore Binária de Busca.

🧠 Como Funciona?
A eficiência deste decodificador vem da sua estrutura de dados. O alfabeto Morse é mapeado em uma árvore binária onde:

Raiz (Root): Ponto de partida vazio.

Esquerda (.): Cada ponto na sequência leva você para o filho à esquerda.

Direita (-): Cada traço na sequência leva você para o filho à direita.

Ao final de uma sequência (como .-), o nó alcançado contém o caractere correspondente (A).

✨ Funcionalidades
Construção Dinâmica: A árvore é montada em tempo de execução inserindo cada letra e número.

Visualização da Árvore: O programa imprime no console uma representação visual da estrutura da árvore (hierarquia de nós).

Decodificação de Palavras: Suporta mensagens completas, desde que as letras sejam separadas por espaços.

Tratamento de Erros: Identifica códigos inválidos com um símbolo de interrogação ?.

🛠️ Tecnologias Utilizadas
Linguagem: Java 11+

Conceitos de POO: Encapsulamento, classes e métodos.

Estrutura de Dados: Árvore Binária Dinâmica.

📂 Estrutura do Código
Main.java: Ponto de entrada que gerencia a interação com o usuário.

MorseTree.java: A classe "cérebro" que contém a lógica de inserção, navegação e decodificação.

Node.java: Representação individual de cada "galho" ou "folha" da árvore.

🚀 Como Executar
Compile os arquivos:

Bash
javac Main.java MorseTree.java Node.java
Rode o programa:

Bash
java Main
Exemplo de uso:

Plaintext
Digite o código Morse para decodificar: .... . .-.. .-.. ---
Palavra Decodificada: HELLO
📊 Visualização da Árvore no Console
Ao iniciar, o programa exibirá a árvore deitada, facilitando o entendimento de como o Java está percorrendo os nós:

Plaintext
├── ROOT
│   ├── T (Direita: -)
│   │   ├── M
│   │   └── N
│   └── E (Esquerda: .)
│       ├── A
│       └── I
