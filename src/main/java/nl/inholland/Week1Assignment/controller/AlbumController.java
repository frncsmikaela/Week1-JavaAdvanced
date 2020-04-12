package nl.inholland.Week1Assignment.controller;

import nl.inholland.Week1Assignment.model.Album;
import nl.inholland.Week1Assignment.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "albums")
@CrossOrigin(origins = {"http://localhost:8080", "http://localhost"})
public class AlbumController {

    @Autowired private AlbumService albumService;
    @RequestMapping(value= "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Album>> getAllAlbums(){
    return ResponseEntity.status(200).body(albumService.getAlbums());
    }
}
