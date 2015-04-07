package calcmodel.Operations;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sunny on 07.04.2015.
 */
public class OperationMultiplyTest {

    private OperationMultiply op;

    @Before
    public void setUp() throws Exception {

        op = new OperationMultiply();
    }

    @Test
    public void testExecute() throws Exception {
        double arg1 = 2;
        double arg2 = 4;
        double expected = 8;

        double result = op.execute(arg1, arg2);

        assertEquals(expected, result, 0.1E-10);
    }

    @Test
    public void testShowDescription() throws Exception {
        String expected = "Default help string for "+ "*" + " operation";
        String result = op.showDescription();
        assertEquals(expected, result);
    }
}