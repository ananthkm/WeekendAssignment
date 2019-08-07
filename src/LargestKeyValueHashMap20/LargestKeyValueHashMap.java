package LargestKeyValueHashMap20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LargestKeyValueHashMap {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
 
	// Create a hash map
	HashMap<Integer, String> hm = new HashMap<Integer, String>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0;i<n;i++) {
    	int value = sc.nextInt();
    	String key = sc.next();
    	hm.put(value, key);
    }
	// Get first key and value
	Map.Entry<Integer, String> firstEntry = hm.entrySet().iterator().next();
	int largestKey = firstEntry.getKey();
	String largestKeyValue = firstEntry.getValue();
 
	for (Map.Entry<Integer, String> map : hm.entrySet()) {
	    int key = map.getKey();
	    if (key > largestKey) {
		largestKey = key;
		largestKeyValue = map.getValue();
	    }
	}
	System.out.println(largestKeyValue);
    }
}