package esprit.pi.forum.services;

import esprit.pi.forum.entities.Candidature;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
public interface ICandidatureService {
    public Candidature addCandidature(Candidature candidature);
    public Candidature updateCandidature(Candidature candidature);
    public List<Candidature> getAllCandidature();
    public void deleteCandidature(long idCandidature);
    public Candidature addCandidatureAndAssignToOffer (Candidature candidature , Long idOffre);
    public List<Candidature> getCandidaturesByUserId(Long idUser);


}
