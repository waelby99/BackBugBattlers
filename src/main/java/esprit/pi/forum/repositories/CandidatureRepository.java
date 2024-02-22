package esprit.pi.forum.repositories;

import esprit.pi.forum.entities.Candidature;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidatureRepository extends JpaRepository<Candidature, Long> {
    List<Candidature> findByUserIdUser(Long idUser);


}
