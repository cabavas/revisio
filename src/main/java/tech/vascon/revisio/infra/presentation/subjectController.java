package tech.vascon.revisio.infra.presentation;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.vascon.revisio.core.entities.Subject;

@RestController
@RequestMapping("api/v1/")
public class subjectController {

    @PostMapping("subject")
    public String createSubject(@RequestBody Subject subject) {
        return "subject created";
    }
}
