import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Unit Tests for the BinaryNode Class
 */
public class BinaryNodeTest extends TestCase {

    /**
     * Unit test for the getData() method
     */
    public void testGetData() {

        // Arrange
        BinaryNode<Object> node = new BinaryNode<Object>(4);

        // Act
        Object actualData = node.getData();

        // Assert
        assertEquals(4, actualData);
    }

    /**
     * Unit Test for the setData() method
     */
    public void testSetData() {

        // Arrange
        BinaryNode<Object> node = new BinaryNode<Object>();

        // Act
        node.setData(4);

        // Assert
        assertEquals(4, node.getData());
    }

    /**
     * Unit Test for the getLeftChild() method
     */
    public void testGetLeftChild() {

        // Arrange
        BinaryNode<Object> node = new BinaryNode<Object>(1);

        // Act
        BinaryNode<Object> left = new BinaryNode<Object>(2);
        node.setLeftChild(left);

        // Assert
        assertEquals(left, node.getLeftChild());
    }

    /**
     * Unit Test for setLeftChild()
     */
    public void testSetLeftChild() {

        // Arrange
        BinaryNode<Object> node = new BinaryNode<Object>(1);

        // Act
        BinaryNode<Object> left = new BinaryNode<Object>(2);
        node.setLeftChild(left);

        // Assert
        assertEquals(node.getLeftChild().getData(), 2);
    }

    /**
     * Unit Test for hasLeftChild()
     */
    public void testHasLeftChild() {

        // Arrange
        BinaryNode<Object> noLeft = new BinaryNode<Object>(1);
        BinaryNode<Object> withLeft = new BinaryNode<Object>(5);

        // Act
        BinaryNode<Object> left = new BinaryNode<Object>(2);
        withLeft.setLeftChild(left);

        // Assert
        assertEquals(noLeft.hasLeftChild(), false);
        assertEquals(withLeft.hasLeftChild(), true);
    }

    /**
     * Unit Test for getRightChild()
     */
    public void testGetRightChild() {

        // Arrange
        BinaryNode<Object> node = new BinaryNode<Object>(1);

        // Act
        BinaryNode<Object> right = new BinaryNode<Object>(2);
        node.setRightChild(right);

        // Assert
        assertEquals(right, node.getRightChild());
    }

    /**
     * Unit Test for setRightChild()
     */
    public void testSetRightChild() {

        // Arrange
        BinaryNode<Object> node = new BinaryNode<Object>(1);

        // Act
        BinaryNode<Object> right = new BinaryNode<Object>(2);
        node.setRightChild(right);

        // Assert
        assertEquals(node.getRightChild().getData(), 2);
    }

    /**
     * Unit Test for hasRightChild()
     */
    public void testHasRightChild() {

        // Arrange
        BinaryNode<Object> noRight = new BinaryNode<Object>(1);
        BinaryNode<Object> withRight = new BinaryNode<Object>(5);

        // Act
        BinaryNode<Object> right = new BinaryNode<Object>(2);
        withRight.setRightChild(right);

        // Assert
        assertEquals(noRight.hasRightChild(), false);
        assertEquals(withRight.hasRightChild(), true);
    }

    /**
     * Unit Test for isLeaf()
     */
    public void testIsLeaf() {

        // Arrange
        BinaryNode<Object> leafNode = new BinaryNode<Object>(1);
        BinaryNode<Object> internalNode = new BinaryNode<Object>(2);
        BinaryNode<Object> anotherLeaf = new BinaryNode<Object>(3);
        internalNode.setLeftChild(anotherLeaf);

        // Act
        boolean isLeafNode = leafNode.isLeaf();
        boolean isInternalLeafNode = internalNode.isLeaf();

        // Assert
        assertEquals(isLeafNode, true);
        assertEquals(isInternalLeafNode, false);
    }

    /**
     * Unit Test for copy()
     */
    public void testCopy() {

        // Arrange
        BinaryNode<Object> someNode = new BinaryNode<Object>(1);

        // Act
        BinaryNode<Object> copyNode = someNode.copy();

        // Assert
        assertEquals(someNode.getData(), copyNode.getData());
    }

    /**
     * Unit Test for postorderTraverse_binaryNodeMethod()
     */
    public void testPostorderTraverse_binaryNodeMethod() {

        // Arrange
        BinaryNode<Object> node = new BinaryNode<Object>(1);
        BinaryNode<Object> left = new BinaryNode<Object>(2);
        BinaryNode<Object> right = new BinaryNode<Object>(3);
        node.setLeftChild(left);
        node.setRightChild(right);

        // Prepare logging to catch output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        node.postorderTraverse_binaryNodeMethod();

        // Assert
        assertEquals("2 3 1 ", outContent.toString());
    }

    /**
     * Unit Test for getHeight_binaryNodeMethod()
     */
    public void testGetHeight_binaryNodeMethod() {

        // Arrange
        BinaryNode<Object> node = new BinaryNode<Object>(1);
        BinaryNode<Object> left = new BinaryNode<>(2);
        node.setLeftChild(left);

        // Act
        int expectedHeight = node.getHeight_binaryNodeMethod();

        // Assert
        assertEquals(expectedHeight, 2);
    }

    /**
     * Unit Test for getNumberOfNodes_binaryNodeMethod()
     */
    public void testGetNumberOfNodes_binaryNodeMethod() {

        // Arrange
        BinaryNode<Object> node = new BinaryNode<Object>(1);
        BinaryNode<Object> left = new BinaryNode<>(2);
        BinaryNode<Object> right = new BinaryNode<>(3);
        node.setLeftChild(left);
        node.setRightChild(right);

        // Act
        int expectedNodes = 3;
        int actualNodes = node.getNumberOfNodes_binaryNodeMethod();

        // Assert
        assertEquals(expectedNodes, actualNodes);
    }
}