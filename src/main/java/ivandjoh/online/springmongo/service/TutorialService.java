package ivandjoh.online.springmongo.service;

import ivandjoh.online.springmongo.model.Tutorial;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TutorialService {

    ResponseEntity<Tutorial> createTutorial(Tutorial tutorial);

    ResponseEntity<List<Tutorial>> getAllTutorials(String title);

    ResponseEntity<Tutorial> getTutorialById(String id);

    ResponseEntity<List<Tutorial>> findByPublished();

    ResponseEntity<Tutorial> updateTutorial(String id, Tutorial tutorial);

    ResponseEntity<HttpStatus> deleteTutorial(String id);

    ResponseEntity<HttpStatus> deleteAllTutorials();
}
