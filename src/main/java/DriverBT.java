/**
 * Driver class to demo the Binary Tree
 */
public class DriverBT {
    /**
     * Main method for our Binary Tree Driver class
     * @param args General arguments
     */
    public static void main(String[] args) {

        System.out.println("1st Testing Example:");
        BinaryTree<String> aTree = new BinaryTree<>();
        createTree1(aTree);

        System.out.println("(binaryTree) post-order: ");
        aTree.postorderTraverse();

        System.out.println("(binaryNode) post-order: ");
        aTree.postorderTraverse_callBinaryNodeMethod();

        System.out.println();

        System.out.println("(BinaryTree) Height of tree is " + aTree.getHeight());
        System.out.println("(BinaryNode) Height of tree is " + aTree.getHeight_callBinaryNodeMethod());

        System.out.println();

        System.out.println("(BinaryTree) # nodes of tree is " + aTree.getNumberOfNodes());
        System.out.println("(BinaryNode) # nodes of tree is " + aTree.getNumberOfNodes_callBinaryNodeMethod());

        System.out.println("==========================================");
        System.out.println();

        System.out.println("2nd Testing Example:");
        BinaryTree<String> aTree2 = new BinaryTree<>();
        createTree2(aTree2);

        System.out.println("(binaryTree) post-order: ");
        aTree2.postorderTraverse();

        System.out.println("(binaryNode) post-order: ");
        aTree2.postorderTraverse_callBinaryNodeMethod();

        System.out.println();

        System.out.println("(BinaryTree) Height of tree is " + aTree2.getHeight());
        System.out.println("(BinaryNode) Height of tree is " + aTree2.getHeight_callBinaryNodeMethod());

        System.out.println();

        System.out.println("(BinaryTree) # nodes of tree is " + aTree2.getNumberOfNodes());
        System.out.println("(BinaryNode) # nodes of tree is " + aTree2.getNumberOfNodes_callBinaryNodeMethod());

        System.out.println("Done.");
    }

    /**
     * Creates a Binary Tree from a String
     * @param tree Tree using type String
     */
    public static void createTree1(BinaryTree<String> tree) {
        // Leaves
        BinaryTree<String> dTree = new BinaryTree<>("D");
        BinaryTree<String> eTree = new BinaryTree<>("E");
        BinaryTree<String> gTree = new BinaryTree<>("G");

        // Subtrees:
        BinaryTree<String> fTree = new BinaryTree<>("F", null, gTree);
        BinaryTree<String> bTree = new BinaryTree<>("B", dTree, eTree);
        BinaryTree<String> cTree = new BinaryTree<>("C", fTree, null);

        tree.setTree("A", bTree, cTree);

        System.out.println("\nGiven Tree:\n");
        System.out.println("     A      ");
        System.out.println("   /   \\  ");
        System.out.println("  B     C  ");
        System.out.println(" / \\   /  ");
        System.out.println("D   E  F   ");
        System.out.println("        \\ ");
        System.out.println("         G ");
        System.out.println();
    }

    /**-------------------------------------------------------------------- */
    /**Task 4: Create a tree case as shown in assignment 3*/
    /**
     * Creates a second tree
     * @param tree A second tree using type String
     */
    public static void createTree2(BinaryTree<String> tree) {
        BinaryTree<String> xTree = new BinaryTree<>("X");
        BinaryTree<String> yTree = new BinaryTree<>("Y");
        BinaryTree<String> zTree = new BinaryTree<>("Z");

        // Subtrees:
        BinaryTree<String> dTree = new BinaryTree<>("X", null, zTree);
        BinaryTree<String> bTree = new BinaryTree<>("Y", xTree, yTree);
        BinaryTree<String> cTree = new BinaryTree<>("Z", dTree, null);

        tree.setTree("A", bTree, cTree);

        System.out.println("\nGiven Tree:\n");
        System.out.println("     A      ");
        System.out.println("   /   \\  ");
        System.out.println("  B     C  ");
        System.out.println(" / \\   /  ");
        System.out.println("X   Y  D   ");
        System.out.println("        \\ ");
        System.out.println("         Z ");
        System.out.println();
    }
}
