package ivandjoh.online.springmongo.service;

import ivandjoh.online.springmongo.model.Tutorial;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TutorialService {

    ResponseEntity<Tutorial> createTutorial(Tutorial tutorial);

    ResponseEntity<List<Tutorial>> getAllTutorials(String title);
}
