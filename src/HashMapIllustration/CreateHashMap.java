package HashMapIllustration;
import java.util.HashMap;

class CreateHashMap{
    HashMap<String, Integer> mHashMap = new HashMap<>();
    
    HashMap<String, Integer> populate(){
        mHashMap.put("Shubham Singh", 23);
        mHashMap.put("Gaurav Soni", 22);
        mHashMap.put("Vikrant Singh", 21);
        
        return mHashMap;
    }
    
    void addStudent(String mName, Integer mAge){
        mHashMap.put(mName, mAge);
    }
    
}