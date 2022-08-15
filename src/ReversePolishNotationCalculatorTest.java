
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReversePolishNotationCalculatorTest {

    @Test
    public void shouldCalculateAddition() {
    ReversePolishNotationCalculator reversePolishNotationCalculator = new ReversePolishNotationCalculator();
    int result = reversePolishNotationCalculator.calculatePolishNotation("2 3 +");
    Assertions.assertEquals(5, result);
    }

    @Test
    public void shouldCaclulateMinus() {
        ReversePolishNotationCalculator reversePolishNotationCalculator = new ReversePolishNotationCalculator();
        int result = reversePolishNotationCalculator.calculatePolishNotation("5 4 -");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void shouldCaclulateMultiplication() {
        ReversePolishNotationCalculator reversePolishNotationCalculator = new ReversePolishNotationCalculator();
        int result = reversePolishNotationCalculator.calculatePolishNotation("2 3 *");
        Assertions.assertEquals(6, result);
    }

    @Test
    public void shouldCaclulateSpaces() {
        ReversePolishNotationCalculator reversePolishNotationCalculator = new ReversePolishNotationCalculator();
        int result = reversePolishNotationCalculator.calculatePolishNotation(" 6    2  - ");
        Assertions.assertEquals(4, result);
    }
}