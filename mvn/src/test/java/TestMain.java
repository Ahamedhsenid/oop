
import org.example.Main;
import org.junit.jupiter.api.Test; // Imports the Test annotation from JUnit Jupiter (JUnit 5). This annotation is used to indicate that a method is a test method
import static org.junit.jupiter.api.Assertions.assertEquals; // compare expected and actual values in tests

public class TestMain
{
    @Test
    public void testSquare() { //method to do the test run and it doesnt return anything
        assertEquals(25, Main.Squaremethod(5));
        assertEquals(0, Main.Squaremethod(0));
        assertEquals(1, Main.Squaremethod(1));
        assertEquals(4, Main.Squaremethod(2));
    }
}