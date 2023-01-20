/*
 * Yuhao(Eric) Zhao
 * CS 5004
 * Lab 0
 * 1/14/2023
 * Create a unit test for Book class
 * Depend on both Book and Person classes
 * */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * A JUnit test class for the Book class.
 */
public class BookTest {
	
	private Person Jay;
	private Book   NovsC;
	
	@Before
	public void setup() {
		Jay=new Person("Jay", "Chou", 1979);
		NovsC= new Book("November's Chopin", this.Jay, (float)20.2);
	}

	@Test
	public void testgetTitle() {
		assertEquals("November's Chopin", NovsC.getTitle());
	}
	
	@Test
	public void testgetPrice() {
		assertEquals((float)20.2, NovsC.getPrice(),0);
	}
	
	@Test
	public void testgetAuthor() {
		assertEquals(Jay.getFirstName(), NovsC.getAuthor().getFirstName());
		assertEquals(Jay.getLastName(), NovsC.getAuthor().getLastName());
		assertEquals(Jay.getYearOfBirth(), NovsC.getAuthor().getYearOfBirth());

	}

}
