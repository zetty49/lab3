/**
 * Abstract class that represents functional lists.
 * It defines the basic operations and behaviors of lists,
 * such as accessing the head and tail, and converting to a string.
 *
 * @author Mykhailo Rytsariev
 * @since JDK1.4
 */
public abstract class FunList {
    /**
     * Returns the first element of the list.
     * This method must be implemented by subclasses.
     *
     * @return the first element of the list.
     */
    public abstract int car();

    /**
     * Returns the tail of the list (all elements except the first).
     * This method must be implemented by subclasses.
     *
     * @return the tail of the list.
     */
    public abstract FunList cdr();

    /**
     * Provides a string representation of the list.
     * It calls the abstract method toStringHelp() to build the string.
     *
     * @return a string representation of the list.
     */
    public String toString() {
        return "(" + toStringHelp() + " ) ";
    }

    /**
     * Helper method to provide a string representation of the list.
     * This method must be implemented by subclasses.
     *
     * @return a string representation of the list.
     */
    abstract String toStringHelp();

    /**
     * Appends another FunList to this list, returning a new list.
     * This method does not modify the original lists.
     *
     * @param other the other list to append.
     * @return a new FunList containing elements of this list followed by elements of the other list.
     */
    public FunList append(FunList other) {
        if (this instanceof Empty) {
            return other;
        }
        return new Cons(this.car(), this.cdr().append(other));
    }

    /**
     * Inserts an integer into the list in sorted order.
     * Returns a new list that includes the original elements with the inserted integer.
     *
     * @param i the integer to insert.
     * @return a new FunList containing original elements and the inserted integer.
     */
    public FunList insertInOrder(int i) {
        if (this instanceof Empty || this.car() >= i) {
            return new Cons(i, this);
        }
        return new Cons(this.car(), this.cdr().insertInOrder(i));
    }

    /**
     * Sorts the list in non-descending order.
     * Returns a new list containing the same elements sorted.
     *
     * @return a new FunList that is sorted.
     */
    public FunList sort() {
        FunList sortedList = Empty.UniqueInstance();
        FunList current = this;
        while (current instanceof Cons) {
            sortedList = sortedList.insertInOrder(current.car());
            current = current.cdr();
        }
        return sortedList;
    }
}
