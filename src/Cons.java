/**
 * Represents a non-empty functional list (cons cell).
 * This class holds a value and a reference to the tail of the list.
 * It is used to construct functional lists by linking values.
 *
 * @author Mykhailo Rytsariev
 * @since JDK1.4
 */
public class Cons extends FunList {
    private int _dat;         // The value of this cons cell
    private FunList _cdr;    // The tail of the list

    /**
     * Constructor for creating a list with a specified head and tail.
     *
     * @param carDat the head (first element) of the list.
     * @param cdr    the tail of the list.
     */
    public Cons(int carDat, FunList cdr) {
        _dat = carDat;
        _cdr = cdr;
    }

    /**
     * Constructor for creating a list with a single element and an empty tail.
     * This constructor uses the unique instance of Empty for the tail.
     *
     * @param i the element of the list.
     */
    public Cons(int i) {
        _dat = i;
        _cdr = Empty.UniqueInstance();
    }

    /**
     * Returns the first element of the list.
     *
     * @return the first element of the list.
     */
    public int car() {
        return _dat;
    }

    /**
     * Returns the tail of the list (all elements except the first).
     *
     * @return the tail of the list.
     */
    public FunList cdr() {
        return _cdr;
    }

    /**
     * Helper method to provide a string representation of the list.
     * It recursively constructs the string from the head and tail.
     *
     * @return a string representation of the list.
     */
    String toStringHelp() {
        return " " + _dat + _cdr.toStringHelp();
    }
}
