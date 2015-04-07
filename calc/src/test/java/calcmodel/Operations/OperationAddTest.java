package calcmodel.Operations;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sunny on 07.04.2015.
 */
public class OperationAddTest {

    private OperationAdd op;

    @Before
    public void setUp() throws Exception {

        op = new OperationAdd();
    }

    @Test
    public void testExecute() throws Exception {
        double arg1 = 20;
        double arg2 = 40;
        double expected = 60;

        double result = op.execute(arg1, arg2);

        assertEquals(expected, result, 0.1E-10);

    }

    @Test
    public void testExecuteMax_Values() throws Exception {
        double arg1 = Double.MAX_VALUE;
        double arg2 = Double.MAX_VALUE;
        double expected = Double.POSITIVE_INFINITY;

        double result = op.execute(arg1, arg2);

        assertEquals(expected, result, 0.1E-10);

    }


    @Test
    public void testShowDescription() throws Exception {
        String expected = "Default help string for "+ "+" + " operation";
        String result = op.showDescription();
        assertEquals(expected, result);
    }

    @Test
    public void testGetOperationSign() throws Exception {

    }
}