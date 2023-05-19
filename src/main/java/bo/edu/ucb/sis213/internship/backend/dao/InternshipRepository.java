package bo.edu.ucb.sis213.internship.backend.dao;

import bo.edu.ucb.sis213.internship.backend.entity.Company;
import bo.edu.ucb.sis213.internship.backend.entity.Internship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface InternshipRepository
        extends JpaRepository<Internship, Long> {

    public List<Internship> findByCompanyId(Company companyId);

    @Query("SELECT i FROM Internship i WHERE i.companyId.companyId = ?1 and i.status = true")
    public List<Internship> finaAllByCompanyId(Long companyId);
}
