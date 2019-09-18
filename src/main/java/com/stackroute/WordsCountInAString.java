package com.stackroute;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WordsCountInAString {

    Map<String, Integer> _Frequency=new LinkedHashMap<>();
    public String CountNoOFWords(String _Sentence){
        _Frequency.clear();
        String[] str=_Sentence.split("[ +-_+,+ @+*+?+.+!+]+");
        if(str.length<=1){
            return null;
        }
        for (String s:str){
            Integer count=_Frequency.get(s);
            _Frequency.put(s,(count==null)?1:++count);
        }
//        System.out.println(_Frequency.size());
//        System.out.println(_Frequency);
        return _Frequency.toString();

    }

}
