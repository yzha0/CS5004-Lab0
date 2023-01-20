/*
 * Yuhao(Eric) Zhao
 * CS 5004
 * Lab 0
 * 1/19/2023
 * Construct a new Music Class
 * */

/**
 * This class represents a piece of music. A piece of music has name, artist, 
 * album name, genre.
 */
public class Music {
    private String song_name;
    private Person artist;
    private String album_name;
    private String genre;

      
    /**
      * Construct a Music object that has name, artist, album name and genre.
      * 
      * @param song_name   the name to be given to this piece
      * @param artist      the artist to be given to this piece
      * @param album_name  the album_name to be given to this piece
      * @param genre       the genre to be assigned to this piece
      */
 
    public Music(String song_name, Person artist, String album_name, String genre) {
    	    this.song_name = song_name;
    	    this.artist = artist;
    	    this.album_name = album_name;
    	    this.genre =genre;
    	  }

	/**
	 * Return the name of this music.
	 *
	 * @return the name of this music
	 */
	
	public String getSong_name() {
	  return this.song_name;
	}
	
	/**
	 * Return the artist of this music.
	 *
	 * @return the artist of this music as a @link{Person}
	 */
	
	public Person getArtist() {
	  return this.artist;
	}
	
	/**
	 * Return the album of this object.
	 *
	 * @return the album of this music
	 */
	
	public String getAlbum_name() {
	  return this.album_name;
	}
	
	/**
	 * Return the genre of this music
	 * 
	 * @return the genre of this music
	 */
	public String getGenre() {
	  return this.genre;
	}

}
   
