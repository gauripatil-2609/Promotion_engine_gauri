import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PromotionEngineTest {
	
	Cart shoppingCart = new Cart();
	@Test
	
	public void TotalofEmptyCart() {
		
		assertEquals(0.0,shoppingCart.getTotal(),0.0); 
		
	}

}
