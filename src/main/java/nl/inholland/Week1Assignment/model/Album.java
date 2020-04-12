package nl.inholland.Week1Assignment.model;

public class Album {

    private long id;
    private String albumName;
    private String artist;
    private double price;

    public Album(){
    }

    public Album(long id, String albumName, String artist, double price) {
        this.id = id;
        this.albumName = albumName;
        this.artist = artist;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", albumName='" + albumName + '\'' +
                ", artist='" + artist + '\'' +
                ", price=" + price +
                '}';
    }

}


