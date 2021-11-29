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
	
	@Test
	
	public void TestScenarioB() {
		Cart shoppingCart = new Cart();
		shoppingCart.add_item("A",5);
		shoppingCart.add_item("B",5);
		shoppingCart.add_item("C",1);
		assertEquals(370,shoppingCart.getTotal(),0);
		
	}
	
	@Test
	
	public void TestScenarioC() {
		Cart shoppingCart = new Cart();
		shoppingCart.add_item("A",3);
		shoppingCart.add_item("B",5);
		shoppingCart.add_item("C",1);
		shoppingCart.add_item("D",1);
		assertEquals(280,shoppingCart.getTotal(),0);
		
	}

}
