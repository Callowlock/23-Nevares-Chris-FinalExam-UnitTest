import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest {
    private StringCalculator stringCalculator;

    @Test
    public void addWithNegativeNumber() {
        stringCalculator = new StringCalculator();
        assertThrows(Exception.class, ()->{stringCalculator.add("-1,1");});

    }

    @Test
    public void addIgnoreNumbersGreaterThanThousand() throws Exception{
        stringCalculator = new StringCalculator();
        int count = stringCalculator.add("10, 10001");
        assertEquals(10, count);
    }
}
