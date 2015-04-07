package calcmodel.Operations;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sunny on 07.04.2015.
 */
public class OperationDivTest {

    private OperationDiv op;

    @Before
    public void setUp() throws Exception {

        op = new OperationDiv();
    }

    @Test
    public void testExecute() throws Exception {
        double arg1 = 40;
        double arg2 = 10;
        double expected = 4;

        double result = op.execute(arg1, arg2);

        assertEquals(expected, result, 0.1E-10);
    }

    @Test(expected = Exception.class)
    public void testExecuteDivByZero() throws Exception {
        double arg1 = 40;
        double arg2 = 0;


        op.execute(arg1, arg2);


    }

    @Test
    public void testExecuteMax_Value_MinValue() throws Exception {
        double arg1 = Double.MAX_VALUE;
        double arg2 = Double.MIN_VALUE;
        double expected = Double.POSITIVE_INFINITY;

        double result = op.execute(arg1, arg2);

        assertEquals(expected, result, 0.1E-10);
    }

    @Test
    public void testShowDescription() throws Exception {
        String expected = "Default help string for "+ "/" + " operation";
        String result = op.showDescription();
        assertEquals(expected, result);
    }
}