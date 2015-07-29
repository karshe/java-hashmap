package HashMapIllustration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

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
       
        System.out.println("Size of mHashMap is : " + mHashMap.size());
        cHashMap.addStudent("Yash Tejas", 24);
        System.out.println("Size of mHashMap after adding Yash Tejas is : " + mHashMap.size());
        
        
        System.out.println("Retrieve age of Vikrant Singh");
        Integer mAge = mHashMap.get("Vikrant Singh");        
        System.out.println("Age of Vikrant Singh is : " + mAge + " years.");
        
        Iterator<String> keyItr = mHashMap.keySet().iterator();
        
        while(keyItr.hasNext()){
            String tName = keyItr.next();
            Integer tAge = mHashMap.get(tName);
            System.out.println("Age of "+tName+" is "+tAge);
        }
        
        boolean ifYogesh;
        
        ifYogesh = mHashMap.containsKey("Yogesh Khanchandani");
        System.out.println("Is Yogesh present? : " + ifYogesh);
        
        cHashMap.addStudent("Yogesh Khanchandani", 26);
        
        ifYogesh = mHashMap.containsKey("Yogesh Khanchandani");
        System.out.println("Is Yogesh present? : " + ifYogesh);
        
        boolean ifOlder;
        
        ifOlder = mHashMap.containsValue(30);
        System.out.println("Someone of 30? : " + ifOlder);
        
        String tName = "Yash Tejas";
        Object tStudent = mHashMap.remove(tName);
        System.out.println(tName+ " was removed!");
        
        System.out.println("Unsorted HashMap");
        
        keyItr = mHashMap.keySet().iterator();
        while(keyItr.hasNext()){
            tName = keyItr.next();
            System.out.println(tName + " : " + mHashMap.get(tName));
        }
        
        System.out.println("Sorting array using TreeMap");
        TreeMap sortedMap = new TreeMap(mHashMap);
        
        keyItr = sortedMap.keySet().iterator();
        while(keyItr.hasNext()){
            tName = keyItr.next();
            System.out.println(tName + " : " + sortedMap.get(tName));
        }
         
        
    }
}
