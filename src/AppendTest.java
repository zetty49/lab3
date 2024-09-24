/**
 * A test class for the append method of the FunList class.
 * This class demonstrates how to append two lists together
 * and prints the result.
 * The main method serves as the entry point for testing.
 *
 * @author Mykhailo Rytsariev
 * @since JDK22
 */
public class AppendTest {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        // Creating two sample FunList instances
        FunList list1 = new Cons(1, new Cons(2, new Cons(3, Empty.UniqueInstance())));
        FunList list2 = new Cons(4, new Cons(5, Empty.UniqueInstance()));

        // Appending the two lists and storing the result
        FunList appendedList = list1.append(list2);

        // Printing the resulting appended list
        System.out.println("Appended List: " + appendedList);
    }
}
