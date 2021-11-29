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
    	int number_of_C =0;
    	switch(item) {
    	case "A" :
    		Total =((units/3)*130 + (units%3)*50);
    		break;
    	case "B" :
    		Total = ((units/2)*45 + (units%2)*30);
    		break;
    	case "C" :
    		number_of_C = units;
    		Total = units*20;
    		break;
    	case "D" :
    		if (number_of_C == 0) {
    			Total = units*15;
    		}
    		else {
    			if (number_of_C == units) {
    				Total = units*30;
    			}
    			else if (number_of_C < units) {
    				Total = (units - number_of_C)*15 + number_of_C *30;
    				
    			}
    			else {
    				Total = (number_of_C - units)*20 + units * 30;
    			}
    		}
    		break;
    		
    	}
    	return Total;
    }
	public void add_item(String string, int i) {
		// TODO Auto-generated method stub
		cart_items.put(string,i);
				
	}
	
	

}
