package com.stackroute;

import java.util.Map;

public class MapObjectSwapKeyValues {

    public String SwapKeyValues(Map<String,String> _map){
        if(_map.size()>2){
            return null;
        }
        if(_map.isEmpty()){
            return null;
        }

        String _str=_map.get("val1");
        if(_str==null) {
            return null;
        }
        _map.replace("val2",_str);
        _map.replace("val1"," ");
        return _map.toString();

    }
}
