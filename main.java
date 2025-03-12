import java.util.Sacnner;
import avltree.AVLTree;

public class Main {
    public static void Main (String [] ){
        Scanner scanner = new Scanner (System.in);
        AVLTree avl = new AVLTree ();
        int opcao ;

        do {
            System.out.println("Selecione um algoritmo:");
            System.out.println("1 - Árvore AVL");
            System.out.println("2 - Árvore Rubro-Negra (Em breve)");
            System.out.println("3 - Árvore Trie (Em breve)");
            System.out.println("4 - Árvore Patricia (Em breve)");
            System.out.println("5 - Heap (Em breve)");
            System.out.println("6 - Tabela de Dispersão (Em breve)");
            System.out.println("7 - Casamento de Cadeias (Em breve)");
            System.out.println("8 - Compressão de Dados (Em breve)");
            System.out.println("0 - Sair");
            
            opcao =  scanner.nextInt();

            switch (opcao) {
                case 1:
                    aplicarAVLTree (scanner);
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;

                default:
                    System.out.println("opção ainda nao implementada");
            }
        } while (opcao != 0);

        scanner.close();


    }

    private static void aplicar AVLTree(Scanner scanner){
        AVLTree avl = new AVLTree();
        int[] array = {30,10,40,5,20,35,50};

        System.out.println("Array original:" + Array.toString(array));
        
        for (int num: array){
            avl.insert(num);
        }

        System.out.println("Arvore AVL (EM ORDEM): ");
        avl.inOrderTransversal();
        System.out.println();
    }
}
