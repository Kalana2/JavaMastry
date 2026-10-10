package lesson9;

import com.sun.jdi.Value;

import javax.swing.text.Element;
import javax.xml.transform.Result;
import java.security.Key;

public class Box <T>{
    private  T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }
}

// Common type - parameter names
//T -> Type
//E -> Element
//K -> Key
//V -> Value
//R -> Result
//ID -> Idenfier
