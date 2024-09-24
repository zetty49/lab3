/**
 * A test class for the sort method of the FunList class.
 * This class demonstrates how to sort a list and prints the result.
 * The main method serves as the entry point for testing.
 *
 * @author Mykhailo Rytsariev
 * @since JDK22
 */
public class SortTest {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        // Creating a sample FunList instance with unsorted elements
        FunList list = new Cons(3, new Cons(1, new Cons(4, Empty.UniqueInstance())));

        // Sorting the list and storing the result
        FunList sortedList = list.sort();

        // Printing the resulting sorted list
        System.out.println("Sorted List: " + sortedList);
    }
}
