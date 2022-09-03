package ivandjoh.online.springmongo.controller;

import ivandjoh.online.springmongo.model.Tutorial;
import ivandjoh.online.springmongo.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
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


}
