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
			
			TotalCost = TotalCost + ApplyPromotion(item,cart_items.get(item));
		}
		
		return TotalCost;
	}
	
    int ApplyPromotion(String item , int units) {
    	int Total =0;
    	
    	switch(item) {
    	case "A" :
    		Total =((units/3)*130 + (units%3)*50);
    		break;
    	case "B" :
    		Total = ((units/2)*45 + (units%2)*30);
    		break;
    	case "C" :
    		
        	int number_of_C = units;
    		if (cart_items.get("C") == 0) {
    			break;
    		}
    		if (cart_items.get("D") == null) {
    			Total = units*20;
    		}
    		else {
    			int number_of_D = cart_items.get("D");
    			if (number_of_C == number_of_D) {
    				Total = units*30;
    			}
    			else if (number_of_C < number_of_D) {
    				Total = (number_of_D - number_of_C)*15 + number_of_C *30;
    				
    			}
    			else {
    				Total = (number_of_C - number_of_D)*20 + number_of_D * 30;
    			}
    		}
    		cart_items.put("D",0);
    		break;
    	case "D" :
    		if (cart_items.get("D") == 0) {
    			break;
    		}
    		if (cart_items.get("C") == null) {
    			Total = units*15;
    		}
    		else {
    			int number_C = cart_items.get("C");
    			if (number_C == units) {
    				Total = units*30;
    			}
    			else if (number_C < units) {
    				Total = (units - number_C)*15 + number_C *30;
    				
    			}
    			else {
    				Total = (number_C - units)*20 + units * 30;
    			}
    		}
    		cart_items.put("C",0);
    		break;
    		
    	}
    	return Total;
    }
	public void add_item(String string, int i) {
		// TODO Auto-generated method stub
		cart_items.put(string,i);
				
	}
	
	

}
