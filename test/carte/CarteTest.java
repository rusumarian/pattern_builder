package carte;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CarteTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Inainte de testare");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Dupa testare");
	}

	@Test
	public void testToString() {
		//fail("Not yet");
		Carte book = new Carte();
		assertNotNull(book);
		
		StringBuilder sb = new StringBuilder();
		assertNotNull(sb);
		String result = sb.toString();
		assertEquals("",result);
	}
	

}
