package calcmodel.Engine;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import calcmodel.Operations.*;
import org.mockito.stubbing.OngoingStubbing;
import utils.ListCreator;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

/**
 * Created by Sunny on 05.04.2015.
 */
public class CalculatorEngineTest {

    Manage  clc;

    @Before
    public void setUp() throws Exception {


      //  clc = (new ListCreator()). Arrange();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetAllItems() throws Exception {

    }

    @Test
    public void testCalculate() throws Exception {

        OperationAdd opAdd = mock(OperationAdd.class);
        ArrayList<Operation> op = new ArrayList<Operation>();
        op.add(opAdd);
        clc = CalcFactory.buildCalculator(op);
        double expected = 11;

        when(opAdd.execute(1, 10)).thenReturn(expected);
        when(opAdd.getOperationSign()).thenReturn("+");

        double result =  clc.calculate("+", 1, 10);

        verify(opAdd).execute(1, 10);
        assertEquals(expected, result, 0.1E-10);

    }

    @Test
    public void testGetLastResult() throws Exception {

    }

    @Test
    public void testGetHelpBySign() throws Exception {

    }
}