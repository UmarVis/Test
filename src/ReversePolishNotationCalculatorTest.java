
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

public class ReversePolishNotationCalculatorTest {

    private static ReversePolishNotationCalculator reversePolishNotationCalculator;
    
    @BeforeAll
    public static void beforeAll(){
        reversePolishNotationCalculator = new ReversePolishNotationCalculator();
    }
    
    @Test
    public void shouldCalculateAddition() {
    int result = reversePolishNotationCalculator.calculatePolishNotation("2 3 +");
    Assertions.assertEquals(5, result);
    }

    @Test
    public void shouldCaclulateMinus() {
        int result = reversePolishNotationCalculator.calculatePolishNotation("5 4 -");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void shouldCaclulateMultiplication() {
        int result = reversePolishNotationCalculator.calculatePolishNotation("2 3 *");
        Assertions.assertEquals(6, result);
    }

    @Test
    public void shouldCaclulateSpaces() {
        int result = reversePolishNotationCalculator.calculatePolishNotation(" 6    2  - ");
        Assertions.assertEquals(4, result);
    }
}
