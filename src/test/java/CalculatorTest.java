import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(8, 4, 10.25, 2.5);
    }

    @Test
    public void canAdd(){
        assertEquals(12, calculator.getAdd());
    }

    @Test
    public void canSubtract(){
        assertEquals(4, calculator.getSubtract());
    }

    @Test
    public void canMultiply(){
        assertEquals(32, calculator.getMultiply());
    }

    @Test
    public void canDivide(){
        assertEquals(4.1, calculator.getDivide(), 0.0);
    }
}
