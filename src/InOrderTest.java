/**
 * A test class for the insertInOrder method of the FunList class.
 * This class demonstrates how to insert an integer into a list
 * while maintaining the sorted order and prints the result.
 * The main method serves as the entry point for testing.
 *
 * @author Mykhailo Rytsariev
 * @since JDK22
 */
public class InOrderTest {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        // Creating a sample FunList instance with unsorted elements
        FunList list = new Cons(3, new Cons(1, new Cons(4, Empty.UniqueInstance())));

        // Inserting a number in order and storing the result
        FunList orderedList = list.insertInOrder(2);

        // Printing the resulting ordered list
        System.out.println("Ordered List after insertion: " + orderedList);
    }
}
