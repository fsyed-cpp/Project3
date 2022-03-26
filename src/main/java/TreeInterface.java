/**
 * Generic Interface for a Tree Data Structure
 * @param <T> Using Generic Type T
 */
public interface TreeInterface<T> {

    /**
     * Retrieves the data from the root node
     * @return The generic data from the root
     */
    public T getRootData();

    /**
     * Retrieves the height of the tree
     * @return The height as int
     */
    public int getHeight();

    /**
     * Retrieves the number of nodes in the tree
     * @return Number of nodes as type int
     */
    public int getNumberOfNodes();

    /**
     * Checks to see if the tree is empty
     * @return True if empty, false otherwise
     */
    public boolean isEmpty();

    /**
     * Removes the tree data
     */
    public void clear();
}
