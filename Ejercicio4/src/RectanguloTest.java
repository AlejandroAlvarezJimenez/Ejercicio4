import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectanguloTest {
	Rectangulo rectangulo1=new Rectangulo(5, 3);
	
	
	@Test
	void testCalcularArea() {
		
		
		assertEquals(15, rectangulo1.calcularArea());
		
	}
	
	@Test
	void testCalcularPerimetro() {
		assertEquals( 18, rectangulo1.calcularPerimetro());
	}

}
