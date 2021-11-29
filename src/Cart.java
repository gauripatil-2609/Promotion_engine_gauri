import java.util.*;
import java.lang.*;

public class Cart {
	
	Map<String, Integer> inventory = new HashMap<String, Integer>();
	Map<String, Integer> cart_items = new HashMap<String, Integer>();
	
	
	
	public double getTotal() {
		double TotalCost =-1;
		
		if (cart_items.isEmpty()) {
			TotalCost = 0.0;
		}
		
		return TotalCost;
		
	}
	

}
