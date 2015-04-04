package calcmodel;

import calcmodel.Operations.OperationAdd;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Double.MAX_VALUE;

public class OperationAddTest {
    OperationAdd add;
    double arg1;
    double arg2;
    @Before
    public void setUp() throws Exception {
        add = new OperationAdd();

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testExecuteAddTowMAX_VALUES() throws Exception {
      double result =  add.execute(MAX_VALUE, MAX_VALUE);
      Assert.assertEquals(Double.POSITIVE_INFINITY, result, 1E-10);
    }

    @Test
    public void testShowDescription() throws Exception {

    }

    @Test
    public void testSetDescription() throws Exception {

    }

    @Test
    public void testGetOperationSign() throws Exception {

    }
}