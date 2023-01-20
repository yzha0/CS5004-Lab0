/*
 * Yuhao(Eric) Zhao
 * CS 5004
 * Lab 0
 * 1/14/2023
 * Create a unit test for Music class
 * Depend on both Book and Person classes
 * */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * A JUnit test class for the Book class.
 */
public class MusicTest {
	
	private Person Jay;
	private Music   RC;
	
	@Before
	public void setup() {
		Jay=new Person("Jay", "Chou", 1979);
		RC= new Music("Romantic Cellphone", this.Jay, "November's Chopin", "C-pop");
	}

	@Test
	public void testgetSong_name() {
		assertEquals("Romantic Cellphone", RC.getSong_name());
	}
	
	@Test
	public void testgetAlbum_name() {
		assertEquals("November's Chopin", RC.getAlbum_name());
	}
	
	@Test
	public void testgetArtist() {
		assertEquals(Jay.getFirstName(), RC.getArtist().getFirstName());
		assertEquals(Jay.getLastName(), RC.getArtist().getLastName());
		assertEquals(Jay.getYearOfBirth(), RC.getArtist().getYearOfBirth());

	}

}
