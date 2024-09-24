/**
 * Mimics a functional empty list, implementing the Singleton pattern.
 * This class represents an empty list in a functional way.
 * It ensures that there is only one instance of an empty list.
 *
 * @author Mykhailo Rytsariev
 * @since JDK1.4
 */
public class Empty extends FunList {
    private static final Empty UNIQUE_INSTANCE = new Empty();

    // Private constructor to prevent the creation of new instances
    private Empty() {}

    /**
     * Returns the unique instance of the Empty list.
     * This method provides access to the single instance of Empty.
     *
     * @return the single instance of Empty.
     */
    public static Empty UniqueInstance() {
        return UNIQUE_INSTANCE;
    }

    /**
     * Returns the first element of the list.
     * Since this is an empty list, it throws an exception.
     *
     * @throws NoSuchElementException if called on an empty list.
     */
    public int car() {
        throw new java.util.NoSuchElementException("car requires a non Empty Funlist");
    }

    /**
     * Returns the tail of the list (all elements except the first).
     * Since this is an empty list, it throws an exception.
     *
     * @throws NoSuchElementException if called on an empty list.
     */
    public FunList cdr() {
        throw new java.util.NoSuchElementException("cdr requires a non Empty Funlist");
    }

    /**
     * Helper method to provide a string representation of the empty list.
     *
     * @return an empty string representing the empty list.
     */
    String toStringHelp() {
        return "";
    }
}
