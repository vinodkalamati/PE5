package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestUpdateDeleteArrayElement {

    private static UpdateDeleteArrayElement _List;

    @Before
    public void setUp() throws Exception {
        _List=new UpdateDeleteArrayElement();

    }

    @After
    public void tearDown() throws Exception {
        _List=null;

    }

    @Test
    public void AddingAndUpdatingElements() {
        _List.AddElement("Apple");
        _List.AddElement("PineApple");
        _List.AddElement("Chai");
        _List.AddElement(34);
        _List.AddElement(-3);
        assertEquals("returns true if the Element is found and it is Updated:",true,_List.UpdateElements("Chai","Doha"));
        assertEquals("returns true if the Element is found and it is Updated:",false,_List.UpdateElements("44","Abdul"));
        assertTrue("returns true if the Element is found and it is Updated:",_List.UpdateElements(-3,"Orange"));
    }

    @Test
    public void AddingAndUpdatingElementsFailure() {
        assertNotEquals("Updating elements",true,_List.UpdateElements("chai","dosa"));
        assertNotEquals("Updating Elements",true,_List.UpdateElements("Orange","poha"));
    }

    @Test
    public void EmptyArrayList_ReturnsAnEmptyArray() {
        List _empty=new ArrayList();
        assertEquals("Removing Elements From the List",_empty,_List.EmptyArray());
    }
}
