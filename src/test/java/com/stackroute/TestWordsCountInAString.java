package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestWordsCountInAString {

    private static WordsCountInAString _words;

    @Before
    public void setUp() throws Exception {
        _words=new WordsCountInAString();
    }

    @After
    public void tearDown() throws Exception {
        _words=null;
    }

    @Test
    public void TestWordsCountInAString() {
        assertEquals("Frequency Of Words in a String","{one=5, two=2, three=2}",_words.CountNoOFWords("one one -one___two,,three,one @three*one?two"));
        assertEquals("Frequency Of Words in a String","{dont=1, trouble=6, the=4, if=1, you=2, troubles=1, i=2, am=2, not=1, truth=1}",_words.CountNoOFWords("dont ___________ trouble the ,,,,,,,trouble. if you @@@@@@@@trouble the trouble, @@trouble** troubles you.??? i am not the trouble , ?@*i am the truth...!!!"));
    }

    @Test
    public void TestWordsCountInAString_Failure(){
        assertNotEquals("Frequency Of Words in a String","{@@=2, **=4}",_words.CountNoOFWords("@@ @@ ** ** ** 8**"));
        assertNull("Frequency Of Words in a String",_words.CountNoOFWords("@@@@@"));
    }
}
