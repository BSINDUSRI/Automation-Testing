import java.util.Map;
import java.util.TreeMap;

public class tm1 {
//	  public static String findKeyByValue(Map<String, String> map, String value) {
//	        for (Map.Entry<String, String> entry : map.entrySet()) {
//	            if (entry.getValue().equals(value)) {
//	                return entry.getKey();
//	            }
//	        }
//	        return null; 
//	    }

	   
//	    public static String findValueByKey(Map<String, String> map, String key) {
//	        return map.get(key);
//	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> States= new TreeMap<>();
		States.put("Delhi","Delhi");
		States.put("Karnataka","Benguluru");
		States.put("UttarPradesh","Lucknow");
//		 String valueToFind = "Benguluru";
//	        String keyFound = findKeyByValue(States, valueToFind);
//	        System.out.println("Key for value '" + valueToFind + "': " + keyFound);
//
//	       
//	        String keyToFind = "Karnataka";
//	        String valueFound = findValueByKey(States, keyToFind);
//	        System.out.println("Value for key '" + keyToFind + "': " + valueFound);
		String searchElement="Karnataka";
		if(States.containsKey(searchElement)) {
			System.out.println("Search Element:  \n "+searchElement+":"+States.get(searchElement));
		}else {
			System.out.println("Not found");
		}
		
		

	}
//	public void SearchKey(String searchElement) {
//		String searchElement1="Karnataka";
//		if(States.containsKey(searchElement)) {
//			System.out.println("Search Element:  \n "+searchElement+":"+States.get(searchElement));
//		}else {
//			System.out.println("Not found");
//		}
//		
//		
//	}

	

}
