import java.util.*;
import java.lang.*;

public class Cart {
	
	Map<String, Integer> inventory = new HashMap<String, Integer>();
	Map<String, Integer> cart_items = new HashMap<String, Integer>();
	
	
	public int getTotal() {
		int TotalCost =-1;
		
		if (cart_items.isEmpty()) {
			TotalCost = 0;
		}
		else {
			
		}
		return TotalCost;
		
	}



	public void add_item(String string, int i) {
		// TODO Auto-generated method stub
		cart_items.put(string,i);
				
	}
	

}
