import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Provides Unit Tests for the Binary Tree Class
 */
public class BinaryTreeTest extends TestCase {

    /**
     * Unit test for the setTree() method
     */
    public void testSetTree() {

        // Arrange
        BinaryTree<Object> tree = new BinaryTree<Object>(1);
        BinaryNode<Object> someNode = new BinaryNode<Object>(4);
        BinaryTree<Object> leftTree = new BinaryTree<Object>(2);
        BinaryTree<Object> rightTree = new BinaryTree<Object>(3);

        // Act
        tree.setTree(someNode, leftTree, rightTree);

        // Assert
        assertEquals(tree.getRootNode().getLeftChild().getData(), 2);
        assertEquals(tree.getRootNode().getRightChild().getData(), 3);
    }

    /**
     * Unit test for the setRootData() method
     */
    public void testSetRootData() {

        // Arrange
        BinaryTree<Object> tree = new BinaryTree<Object>(1);

        // Act
        tree.setRootData(4);

        // Assert
        assertEquals(tree.getRootData(), 4);
    }

    /**
     * Unit test for the getRootData() method
     */
    public void testGetRootData() {

        // Arrange
        BinaryTree<Object> tree = new BinaryTree<Object>(1);

        // Act + Assert
        assertEquals(tree.getRootData(), 1);
    }

    /**
     * Unit test for the isEmpty() method
     */
    public void testIsEmpty() {

        // Arrange
        BinaryTree<Object> tree = new BinaryTree<Object>(1);
        BinaryTree<Object> emptyTree = new BinaryTree<Object>();

        // Act
        boolean treeEmpty = tree.isEmpty();
        boolean emptyTreeEmpty = emptyTree.isEmpty();

        // Assert
        assertEquals(treeEmpty, false);
        assertEquals(emptyTreeEmpty, true);
    }

    /**
     * Unit test for the clear() method
     */
    public void testClear() {

        // Arrange
        BinaryTree<Object> tree = new BinaryTree<Object>(1);

        // Act
        tree.clear();

        // Assert
        assertEquals(tree.isEmpty(), true);
    }

    /**
     * Unit test for the setRootNode() method
     */
    public void testSetRootNode() {

        // Arrange
        BinaryTree<Object> tree = new BinaryTree<Object>(1);

        // Act
        BinaryNode<Object> newNode = new BinaryNode<Object>(5);
        tree.setRootNode(newNode);

        // Assert
        assertEquals(tree.getRootData(), 5);
    }

    /**
     * Unit test for the getRootNode() method
     */
    public void testGetRootNode() {

        // Arrange
        BinaryTree<Object> tree = new BinaryTree<Object>(1);

        // Act
        BinaryNode<Object> newNode = new BinaryNode<Object>(5);
        tree.setRootNode(newNode);

        // Assert
        assertEquals(newNode, tree.getRootNode());
    }

    /**
     * Unit test for the postOrderTraversal() method
     */
    public void testPostorderTraverse() {

        // Arrange
        BinaryTree<Object> tree = new BinaryTree<Object>(1);
        BinaryNode<Object> left = new BinaryNode<Object>(2);
        BinaryNode<Object> right = new BinaryNode<Object>(3);
        tree.getRootNode().setLeftChild(left);
        tree.getRootNode().setRightChild(right);

        // Prepare logging to catch output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        tree.postorderTraverse();

        // Assert
        assertEquals("2 3 1 ", outContent.toString());
    }

    /**
     * Unit test for the PostorderTraverse_callBinaryNodeMethod() method
     */
    public void testPostorderTraverse_callBinaryNodeMethod() {

        // Arrange
        BinaryTree<Object> tree = new BinaryTree<Object>(1);
        BinaryNode<Object> left = new BinaryNode<Object>(2);
        BinaryNode<Object> right = new BinaryNode<Object>(3);
        tree.getRootNode().setLeftChild(left);
        tree.getRootNode().setRightChild(right);

        // Prepare logging to catch output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        tree.postorderTraverse_callBinaryNodeMethod();

        // Assert
        assertEquals("2 3 1 ", outContent.toString());
    }

    /**
     * Unit test for the getHeight() method
     */
    public void testGetHeight() {

        // Arrange
        BinaryTree<Object> tree = new BinaryTree<Object>(1);
        BinaryNode<Object> left = new BinaryNode<>(2);
        tree.getRootNode().setLeftChild(left);

        // Act
        int expectedHeight = tree.getHeight();

        // Assert
        assertEquals(2, expectedHeight);
    }

    /**
     * Unit test for the GetHeight_callBinaryNodeMethod() method
     */
    public void testGetHeight_callBinaryNodeMethod() {

        // Arrange
        BinaryTree<Object> tree = new BinaryTree<Object>(1);
        BinaryNode<Object> left = new BinaryNode<>(2);
        tree.getRootNode().setLeftChild(left);

        // Act
        int expectedHeight = tree.getHeight_callBinaryNodeMethod();

        // Assert
        assertEquals(2, expectedHeight);
    }

    /**
     * Unit test for the getNumberOfNodes() method
     */
    public void testGetNumberOfNodes() {

        // Arrange
        BinaryTree<Object> tree = new BinaryTree<Object>(1);
        BinaryNode<Object> left = new BinaryNode<>(2);
        BinaryNode<Object> right = new BinaryNode<>(3);
        tree.getRootNode().setLeftChild(left);
        tree.getRootNode().setRightChild(right);

        // Act
        int expectedNodes = 3;
        int actualNodes = tree.getNumberOfNodes();

        // Assert
        assertEquals(expectedNodes, actualNodes);
    }

    /**
     * Unit test for the getNumberOfNodes_callBinaryNodeMethod() method
     */
    public void testGetNumberOfNodes_callBinaryNodeMethod() {

        // Arrange
        BinaryTree<Object> tree = new BinaryTree<Object>(1);
        BinaryNode<Object> left = new BinaryNode<>(2);
        BinaryNode<Object> right = new BinaryNode<>(3);
        tree.getRootNode().setLeftChild(left);
        tree.getRootNode().setRightChild(right);

        // Act
        int expectedNodes = 3;
        int actualNodes = tree.getNumberOfNodes_callBinaryNodeMethod();

        // Assert
        assertEquals(expectedNodes, actualNodes);
    }
}