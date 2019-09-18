package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TestMapObjectSwapkeyValues {
    private static MapObjectSwapKeyValues _swappedMap;

    @Before
    public void setUp() throws Exception {
        _swappedMap=new MapObjectSwapKeyValues();
    }

    @After
    public void tearDown() throws Exception {
        _swappedMap=null;
    }
    @Test
    public void Test_ReplaceKeyValuePairs(){
        Map<String,String> _maps=new LinkedHashMap<>();
        _maps.put("val1","java");
        _maps.put("val2","c++");
        assertEquals("Expected String doesn't match with actual array","{val1= , val2=java}",_swappedMap.SwapKeyValues(_maps));
        _maps.clear();
        _maps.put("val1","mars");
        _maps.put("val2","saturn");
        assertEquals("Expected String doesn't match with actual array","{val1= , val2=mars}",_swappedMap.SwapKeyValues(_maps));
    }
    @Test
    public  void Test_ReplaceKeyValuePairs_Failure(){
        Map<String,String> _maps=new LinkedHashMap<>();
        assertNull("Expected String doesn't match with actual array",_swappedMap.SwapKeyValues(_maps));
        _maps.put("val1","mars");
        _maps.put("val2","saturn");
        _maps.put("val3","mars");
        _maps.put("val4","saturn");
        assertNull("Expected String doesn't match with actual array",_swappedMap.SwapKeyValues(_maps));
    }
}
