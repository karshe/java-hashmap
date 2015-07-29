package HashMapIllustration;

import java.util.HashMap;

/**
 *
 * @author Utkarsh Kumar Raut (karshe)
 */
public class HashMapIllustration {
    public static void main(String args[]){
        System.out.println("Illustrating Java HashMap");
        
        System.out.println("Creating new HashMap object");
        
        HashMap<String, Integer> mHashMap = new HashMap<>();
        mHashMap.put("Shubham Singh", 23);
        mHashMap.put("Gaurav Soni", 22);
        mHashMap.put("Vikrant Singh", 21);
        
        System.out.println("Added few entities.");
        
        
    }
}
