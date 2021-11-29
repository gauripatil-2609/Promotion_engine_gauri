import java.util.*;
import java.lang.*;

public class Cart {
	
	Map<String, Integer> inventory = new HashMap<String, Integer>();
	Map<String, Integer> cart_items = new HashMap<String, Integer>();
	
	public Cart() {
		inventory.put("A", 50);
		inventory.put("B", 30);
		inventory.put("C", 20);
		inventory.put("D", 15);
	}
	public int getTotal() {
		int TotalCost =0;
		
		if (cart_items.isEmpty()) {
			
		}
		else {
			
			TotalCost = calculateTotalCost();
			
						
		}
		return TotalCost;
		
	}


	private int calculateTotalCost() {
		
		int TotalCost = 0;
		
		for(String item: cart_items.keySet()) {
			
			TotalCost = TotalCost + (cart_items.get(item)*inventory.get(item));
		}
		
		return TotalCost;
	}
	public void add_item(String string, int i) {
		// TODO Auto-generated method stub
		cart_items.put(string,i);
				
	}
	

}
