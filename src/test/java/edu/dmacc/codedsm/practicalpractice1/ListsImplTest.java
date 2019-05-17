package edu.dmacc.codedsm.practicalpractice1;

import junit.framework.Assert;
import junit.framework.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ListsImplTest {
    private ListsImpl classUnderTest;

    @Before
    public void setUp() throws Exception {
        classUnderTest = new ListsImpl();
    }


    @Test
    public void intToString() {
    }

    @Test
    public void shouldAddTen() {
        ListsImpl listsImpl = new ListsImpl();
        Integer result = listsImpl.addTen(5);
        assertEquals(15, (int)result);
    }
}