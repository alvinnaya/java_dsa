package java_dsa.Hashing;

import java.util.*;

public class Hash {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("a",1);
        hashtable.put("b",2);

        System.out.println("get a  :  " + hashtable.get("a"));
    }
}
