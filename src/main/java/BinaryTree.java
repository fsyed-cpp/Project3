/**
 * Class for the Binary Tree - uses Nodes containing left and right children
 * @param <T> Using generic type 'T'
 */
public class BinaryTree<T> implements BinaryTreeInterface<T> {

    // MARK: - Properties

    private BinaryNode<T> root;

    // MARK: - Constructors

    /**
     * Creates an empty binary tree
     */
    public BinaryTree() {
        root = null;
    }

    /**
     * Creates a Binary Tree with a root
     * @param rootData Data to be passed to the root
     */
    public BinaryTree(T rootData) {
        root = new BinaryNode<>(rootData);
    } // end constructor

    /**
     * Creates a Binary Tree with left and right subtree
     * @param rootData Data to be set as the root
     * @param leftTree The left subtree
     * @param rightTree The right subtree
     */
    public BinaryTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree) {
        initializeTree(rootData, leftTree, rightTree);
    }

    /**
     * Creates a new Binary tree using the Interface
     * @param rootData Data to be set as the root
     * @param leftTree The left subtree
     * @param rightTree The right subtree
     */
    public void setTree(T rootData, BinaryTreeInterface<T> leftTree,
                        BinaryTreeInterface<T> rightTree) {
        initializeTree(rootData, (BinaryTree<T>)leftTree,
                (BinaryTree<T>)rightTree);
    }

    /**
     * Set / Change the root node data
     * @param rootData The data in the root node
     */
    public void setRootData(T rootData) {
        root.setData(rootData);
    }

    /**
     * Returns the data from the root node
     * @return The data living in the root node
     */
    public T getRootData() {
        if (isEmpty())
            throw new EmptyTreeException();
        else
            return root.getData();
    }

    /**
     * Check if the tree exists
     * @return
     */
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * Erase the tree
     */
    public void clear() {
        root = null;
    }

    /**
     * Set the root node
     * @param rootNode The root node for the tree
     */
    protected void setRootNode(BinaryNode<T> rootNode) {
        root = rootNode;
    } // end setRootNode

    /**
     * Returns the root node
     * @return Root node
     */
    protected BinaryNode<T> getRootNode() {
        return root;
    }

    /**
     * Creates a new Binary Tree
     * @param rootData The root node data
     * @param leftTree The subtree for the left child
     * @param rightTree The subtree for the right child
     */
    private void initializeTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree) {
        root = new BinaryNode<>(rootData);

        if ((leftTree != null) && !leftTree.isEmpty())
            root.setLeftChild(leftTree.root);

        if ((rightTree != null) && !rightTree.isEmpty())
        {
            if (rightTree != leftTree)
                root.setRightChild(rightTree.root);
            else
                root.setRightChild(rightTree.root.copy());
        } // end if

        if ((leftTree != null) && (leftTree != this))
            leftTree.clear();

        if ((rightTree != null) && (rightTree != this))
            rightTree.clear();
    }

    /** -------------------------------------------------------------------- */
    /** Task 1: Implement the 4 methods
     *     . In BinaryTree.java
     *          1. public void postorderTraverse();
     *          2. private void postorderTraverse(BinaryNode<T> node)
     *          3. public void postorderTraverse_callBinaryNodeMethod()
     *     . In BinaryNode.java
     *          4. public void postorderTraverse_binaryNodeMethod() */

    /** calls postorderTraverse(BinaryNode<T> node)
     * prints (using post-order traversal) all nodes in the "whole" tree */
    public void postorderTraverse() {
        // TODO
        postorderTraverse(this.root);
        }

    /** A Recursive Method in the BinaryTree Class
     * prints (using post-order traversal) all nodes in the subtree rooted at this node.*/
    private void postorderTraverse(BinaryNode<T> node) {
        // TODO
        if (node != null)
        {
            postorderTraverse(node.getLeftChild());
            postorderTraverse(node.getRightChild());
            System.out.print(node.getData() + " ");
        }
    }

    /**
     * The following method will be called in the postorderTraverse_binaryNodeMethod(),
     * which is a recursive binaryNodeMethod class method
     * prints (using post-order traversal) all nodes in the subtree rooted at this node.
     * @param node
     */
    public void postorderTraverse_BinaryNodeMethod(BinaryNode <T> node) {
        if (node != null) {
            postorderTraverse_BinaryNodeMethod(node.getLeftChild());
            postorderTraverse_BinaryNodeMethod(node.getRightChild());
            System.out.print(node.getData() + " ");
        }
    }

    /** The following calls postorderTraverse_binaryNodeMethod(), which is a recursive binaryNode class method
     * prints (using post-order traversal) all nodes in the "whole" tree */
    public void postorderTraverse_callBinaryNodeMethod() {
        // TODO

    }

    /** -------------------------------------------------------------------- */
    /** Task 2: Implement the 2 methods
     *     . In BinaryTree.java
     *          1. public int getHeight_callBinaryNodeMethod()
     *     . In BinaryNode.java
     *          2. public int getHeight_binaryNodeMethod()*/

    /** calls getHeight(BinaryNode<T> node)
     @return  The height of the "whole" tree */
    public int getHeight() {
        return getHeight(root);
    } // end getHeight

    /** A Recursive Method in the BinaryTree Class
     * Computes the height of the subtree rooted at this node.
     @return  The height of the subtree rooted at this node. */
    private int getHeight(BinaryNode<T> node) {
        int height = 0;
        if (node != null)
            height = 1 + Math.max(getHeight(node.getLeftChild()),
                    getHeight(node.getRightChild()));
        return height;
    }

    /** The following calls getHeight_binaryNodeMethod() which is a recursive binaryNode class method
     * Computes the height of the "whole" tree.
     @return  The height of the "whole" tree. */
    public int getHeight_callBinaryNodeMethod() {
        // TODO
        return 0;
    }

    /** -------------------------------------------------------------------- */
    /** Task 3: Implement the 2 methods
     *     . In BinaryTree.java
     *          1. public int getNumberOfNodes()
     *          2. private int getNumberOfNodes(BinaryNode<T> node)*/

    /** calls getNumberOfNodes(BinaryNode<T> node)
     @return  The number of nodes in the "whole" tree */
    public int getNumberOfNodes() {
        // TODO: Get number of nodes from whole tree (starting from root)
        return 0;
    }

    /** A Recursive Method in the BinaryTree Class
     * Counts the nodes in the subtree rooted at this node.
     @return  The number of nodes in the subtree rooted at this node. */
    private int getNumberOfNodes(BinaryNode<T> node) {
        // TODO: Implement get number of nodes from given node
        return 0;
    }

    /** The following calls getNumberOfNodes_binaryNodeMethod() which is a recursive binaryNode class method
     * Counts the nodes in the "whole" tree
     @return  The number of nodes in the "whole" tree. */
    public int getNumberOfNodes_callBinaryNodeMethod() {
        int numberOfNodes = 0;
        if (root != null)
            numberOfNodes = root.getNumberOfNodes_binaryNodeMethod();
        return numberOfNodes;
    }
}
