import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PromotionEngineTest {
	
	
	@Test
	
	public void TotalofEmptyCart() {
		Cart shoppingCart = new Cart();
		assertEquals(0,shoppingCart.getTotal(),0); 
		
	}
	
	@Test
	
	public void TestScenarioA() {
		Cart shoppingCart = new Cart();
		shoppingCart.add_item("A",1);
		shoppingCart.add_item("B",1);
		shoppingCart.add_item("C",1);
		assertEquals(100,shoppingCart.getTotal(),0);
		
	}

}
