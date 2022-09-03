package ivandjoh.online.springmongo.controller;

import ivandjoh.online.springmongo.model.Tutorial;
import ivandjoh.online.springmongo.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TutorialController {

    @Autowired
    TutorialService tutorialService;

    @PostMapping("/tutorial")
    public ResponseEntity<Tutorial> createTutorial(
            @RequestBody Tutorial tutorial
    ) {
        return tutorialService.createTutorial(tutorial);
    }

    @GetMapping("/tutorials")
    public ResponseEntity<List<Tutorial>> getAllTutorials(
            @RequestParam(required = false) String title
    ) {
        return tutorialService.getAllTutorials(title);
    }

    @GetMapping("/tutorial/{id}")
    public ResponseEntity<Tutorial> getTutorialById(
            @PathVariable("id") String id
    ) {
        return tutorialService.getTutorialById(id);
    }

    @GetMapping("/tutorials/published")
    public ResponseEntity<List<Tutorial>> findByPublished() {
        return tutorialService.findByPublished();
    }

    @PutMapping("/tutorial/{id}")
    public ResponseEntity<Tutorial> updateTutorial(
            @PathVariable("id") String id,
            @RequestBody Tutorial tutorial
    ) {
        return tutorialService.updateTutorial(id, tutorial);
    }

    @DeleteMapping("/tutorial/{id}")
    public ResponseEntity<HttpStatus> deleteTutorial(
            @PathVariable("id") String id
    ) {
        return tutorialService.deleteTutorial(id);
    }

    @DeleteMapping("/tutorials")
    public ResponseEntity<HttpStatus> deleteAllTutorials() {
        return tutorialService.deleteAllTutorials();
    }
}
