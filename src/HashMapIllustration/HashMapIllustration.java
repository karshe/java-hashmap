package HashMapIllustration;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Utkarsh Kumar Raut (karshe)
 */
public class HashMapIllustration {
    public static void main(String args[]){
        System.out.println("Illustrating Java HashMap");        
        System.out.println("Creating new HashMap object");
        
        CreateHashMap cHashMap = new CreateHashMap();
        HashMap<String, Integer> mHashMap = cHashMap.populate();
        System.out.println("Added few entities.");
        
        cHashMap.addStudent("Yash Tejas", 24);
        
        System.out.println("Retrieve age of Vikrant Singh");
        Integer mAge = mHashMap.get("Vikrant Singh");        
        System.out.println("Age of Vikrant Singh is : " + mAge + " years.");
        
        Iterator<String> keyItr = mHashMap.keySet().iterator();
        
        while(keyItr.hasNext()){
            String tName = keyItr.next();
            Integer tAge = mHashMap.get(tName);
            System.out.println("Age of "+tName+" is "+tAge);
        }
    }
}
