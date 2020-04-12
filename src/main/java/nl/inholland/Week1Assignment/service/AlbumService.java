package nl.inholland.Week1Assignment.service;

import org.springframework.stereotype.Service;
import nl.inholland.Week1Assignment.model.Album;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Service
public class AlbumService {
    private List<Album> albums;

    public AlbumService() {
        albums = Arrays.asList(
                new Album(1L, "Map of the Soul: 7", "BTS", 16),
                new Album(2L, "Map of the Soul: Persona", "BTS", 15),
                new Album(1L, "Love Yourself: Answer", "BTS", 14)
        );
    }

    public List<Album> getAlbums() {
        return albums;
    }
}
