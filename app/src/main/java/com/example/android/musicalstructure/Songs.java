package com.example.android.musicalstructure;

/**
 * {@link Songs} represents a list of songs that is inside each type of music Button.
 * It contains the name of the song and the name of the artist.
 */

public class Songs {

    /**
     * Name of the song
     */
    private String mSongName;

    /**
     * Name of the artist
     */
    private String mArtistName;

    /**
     * Icon
     */
    private int mImageResourceId;

    /**
     * Create a new Songs object.
     *
     * @param songName        is the name of the song
     * @param artistName      is the name of the artist
     * @param imageResourceId is the icon of the music, if is playing or not
     */
    public Songs(String songName, String artistName, int imageResourceId) {
        mSongName = songName;
        mArtistName = artistName;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the song
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the name of the artist
     */
    public String getArtistName() {
        return mArtistName;

    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}