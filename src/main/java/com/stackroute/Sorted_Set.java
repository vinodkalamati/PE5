//Write a program to implement set interface which sorts the given randomly ordered names in
//
//        ascending order. Convert the sorted set in to an array list
//        Input : Harry Olive Alice Bluto Eugene
//        Output :
//        Sorted Set : Alice Bluto Eugene Harry Olive
//        Array list from Set : Alice Bluto Eugene Harry Olive

package com.stackroute;

import java.util.*;

public class Sorted_Set {


    public List<String> SortAccordingToAlphabets(HashSet<String> _set){
        if(_set.isEmpty()){
            return null;
        }
        TreeSet<String> _sort=new TreeSet<>(_set);
        List<String> _sortedList=new ArrayList<>(_sort);
        return _sortedList;
    }
}
