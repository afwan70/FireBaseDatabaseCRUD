package com.example.amirafwan.firebasedatabasecrud;

/**
 * Created by amirafwan on 10/30/17.
 */

    public class Artist {
    String artistID;
    String artistName;

    public Artist(){

    }

    public Artist(String artistID, String artistName) {
        this.artistID = artistID;
        this.artistName = artistName;
    }

    public String getArtistID() {

        return artistID;
    }

    public String getArtistName() {
        return artistName;
    }
}
