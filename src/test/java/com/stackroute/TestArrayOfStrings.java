package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestArrayOfStrings {
    private static ArrayOfStrings _Array;

    @Before
    public void setUp() throws Exception {
        _Array=new ArrayOfStrings();
    }

    @After
    public void tearDown() throws Exception {
        _Array=null;
    }

    @Test
    public void TestArrayOfStrings_Use_toStringMethod_toConvertMap() {
        assertEquals("set true if the value appears 2 times in an array","{a=true, b=false, c=true, d=false}",_Array.ArrayOfStrings_Map(new String[]{"a","b","c","d","a","c","c"}));
        assertEquals("set true if the value appears 2 times in an array","{dont=false, trouble=true, the=true, if=false, you=false, i=false, am=false, not=false, truth=false}",_Array.ArrayOfStrings_Map(new String[]{"dont","trouble","the","trouble","if","you","trouble","the","trouble","i","am","not","the","trouble","truth"}));

    }
    @Test
    public  void TestArrayOfStrings_Use_toStringMethod_toConvertMap_failure(){
        assertNotEquals("set true if the value appears 2 times in an array","{a=true, b=false, c=false}",_Array.ArrayOfStrings_Map(new String[]{"a","ab","c"}));
        assertNull("expected String doesn't match with the actual String",_Array.ArrayOfStrings_Map(new String[]{}));
    }
}

