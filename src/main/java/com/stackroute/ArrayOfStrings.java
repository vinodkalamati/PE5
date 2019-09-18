package com.stackroute;

import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayOfStrings {
    Map<String,Boolean> _map=new LinkedHashMap<>();
    Boolean count;
    public String ArrayOfStrings_Map(String[] _array){
        _map.clear();
        if(_array.length<=1){
            return null;
        }
        for(String a:_array) {
            count = _map.get(a);
            _map.put(a,(count==null)?false:true);
        }
        System.out.println(_map);
    return _map.toString();
    }
}
