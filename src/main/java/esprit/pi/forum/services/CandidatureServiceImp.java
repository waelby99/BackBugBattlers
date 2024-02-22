package esprit.pi.forum.services;

import esprit.pi.forum.entities.Candidature;
import esprit.pi.forum.entities.Offre;
import esprit.pi.forum.repositories.CandidatureRepository;
import esprit.pi.forum.repositories.OffreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
@AllArgsConstructor
public class CandidatureServiceImp implements ICandidatureService{
    CandidatureRepository candidatureRepository;
    OffreRepository offreRepository;
    @Override
    public Candidature addCandidature(Candidature candidature) {
        return candidatureRepository.save(candidature);
    }

    @Override
    public Candidature updateCandidature(Candidature candidature) {
        return candidatureRepository.save(candidature);
    }

    @Override
    public List<Candidature> getAllCandidature() {
        return candidatureRepository.findAll();
    }

    @Override
    public void deleteCandidature(long idCandidature) {
        candidatureRepository.deleteById(idCandidature);

    }
public Candidature addCandidatureAndAssignToOffer (Candidature candidature , Long idOffre) {
    Offre offre = offreRepository.findById(idOffre).orElse(null);
    if (offre != null) {
        candidature.setOffre(offre);
        offre.getCandidaturess().add(candidature);
        offreRepository.save(offre);
        return candidatureRepository.save(candidature);
    } else {
        return null;
    }}

    public List<Candidature> getCandidaturesByUserId(Long idUser) {
        return  candidatureRepository.findByUserIdUser(idUser);
    }

}


