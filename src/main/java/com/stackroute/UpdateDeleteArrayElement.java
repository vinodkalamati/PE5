package com.stackroute;



import java.util.ArrayList;
import java.util.List;

public class UpdateDeleteArrayElement {

    List _ElementsArray=new ArrayList();

   public void  AddElement(Object _elements){
       _ElementsArray.add(_elements);
   }

   public boolean UpdateElements(Object Replace_element,Object Update_element){
       if (_ElementsArray.contains(Replace_element)) {
           int number = _ElementsArray.indexOf(Replace_element);
           _ElementsArray.add(number, Update_element);
           return true;
       }
       return false;

   }

   public List EmptyArray(){
       _ElementsArray.clear();
       return _ElementsArray;
   }

}
//class Container<T>{
//    T value;
//}
