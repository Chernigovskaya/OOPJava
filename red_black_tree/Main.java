package red_black_tree;

import static red_black_tree.RedBlackTree.printRedBlackTree;

public class Main {
    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        tree.add(8);
        tree.add(5);
        tree.add(12);
        tree.add(3);
        tree.add(16);
        tree.add(2);
        tree.add(7);
        tree.add(24);
        tree.add(29);

        printRedBlackTree(tree);
    }
}
