package esprit.pi.forum.controllers;

import esprit.pi.forum.entities.Candidature;
import esprit.pi.forum.entities.Offre;
import esprit.pi.forum.services.ICandidatureService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@AllArgsConstructor
@RestController
public class CandidatureController {

private ICandidatureService iCandidatureService;
    @PostMapping(value="/addCandidature" )
        public Candidature addCandidature(@RequestBody Candidature candidature) {
            return iCandidatureService.addCandidature(candidature);
        }
}
