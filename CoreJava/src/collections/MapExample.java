package collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap<String,Integer> basket = new HashMap<String,Integer>();
		
	//key is always unique i.e item3
		basket.put("Item1", 1);
		basket.put("Item2", 5);
		basket.put("Item3", 2);
		basket.put("Item4", 2);
		
		System.out.println("The map is " + basket);
		
		basket.put("Item3", 4);
		System.out.println("The map after change is " + basket);
		
		basket.remove("Item2");
		System.out.println("The map after delete is " + basket);
		
		/*basket.put("Item5", null);
		System.out.println("The map after adding null value is " + basket);
		
		basket.put(null, 4);
		System.out.println("The map after adding null key is " + basket); */
		
		for(String item:basket.keySet()) {
			
			System.out.println("Item name is " + item);//item variable contain first Item1
			System.out.println("Item quantity is " + basket.get(item));//For item1 print the key
		}
		
		for(Integer val: basket.values()) {
			
			System.out.println("The value is " + val);
		}

String str = "Clean World Green World Happy World";
		//arr1 will contain all the words in an array
		String[] arr1 = str.split(" ");
		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		
		for(String word:arr1) {	
			if(!map1.keySet().contains(word)) {
				map1.put(word, 1);
			}else {	
				map1.put(word, map1.get(word)+1);
			}
		}
		
		System.out.println("The resulting map  is " + map1);
		
	}

}

