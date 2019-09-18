package com.stackroute;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Test_Sorted_set {

    private static Sorted_Set _sorted;
    @Before
    public void setUp() throws Exception {
        _sorted=new Sorted_Set();
    }

    @After
    public void tearDown() throws Exception {
        _sorted=null;
    }

    @Test
    public void Test_ElementsAreSorted() {
        HashSet<String> _actual=new HashSet<>();
        _actual.add("Harry");
        _actual.add("Olive");
        _actual.add("Alice");
        _actual.add("Bluto");
        _actual.add("Eugene");
        List<String> _expected=new ArrayList<>();
        _expected.add("Alice");
        _expected.add("Bluto");
        _expected.add("Eugene");
        _expected.add("Harry");
        _expected.add("Olive");
        assertEquals("Expected list Doesn't matching with actual array",_expected,_sorted.SortAccordingToAlphabets(_actual));
        _actual.clear();
        _expected.clear();
        _actual.add("Pineapple");
        _actual.add("Orange");
        _actual.add("Apple");
        _actual.add("Blueberry");
        _actual.add("Tomato");
        _expected.add("Apple");
        _expected.add("Blueberry");
        _expected.add("Orange");
        _expected.add("Pineapple");
        _expected.add("Tomato");
        assertEquals("Expected list Doesn't matching with actual array",_expected,_sorted.SortAccordingToAlphabets(_actual));
    }

    @Test
    public void Test_ElementsAreSorted_failure() {
        HashSet<String> _actual=new HashSet<>();
        assertNull("Expected list Doesn't matching with actual array",_sorted.SortAccordingToAlphabets(_actual));
    }
}
