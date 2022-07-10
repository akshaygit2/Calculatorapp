package calculatorproject;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


class CalculatorTest {

    @Test
    public void addtest() {
        CalculatorDemo c1 = new CalculatorDemo();
        int result = c1.add(10, 20);
        assertEquals(30,result);
    }

    @Test
    public void multiplications() {
        CalculatorDemo c1 = new CalculatorDemo();
        int result = c1.multiplications(40, 2);
        assertEquals(80,result);
    }

    @Test
    public void subtract() {
        CalculatorDemo c1 = new CalculatorDemo();
        int result = c1.subtract(50, 20);
        assertEquals(30,result);
    }

    @Test
    public void div() {
        CalculatorDemo c1 = new CalculatorDemo();
        int result = c1.div(10,2);
        assertEquals(5,result);
    }


}
