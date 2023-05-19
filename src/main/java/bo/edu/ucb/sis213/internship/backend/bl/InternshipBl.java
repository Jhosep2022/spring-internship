package bo.edu.ucb.sis213.internship.backend.bl;

import bo.edu.ucb.sis213.internship.backend.dao.InternshipRepository;
import bo.edu.ucb.sis213.internship.backend.entity.Company;
import bo.edu.ucb.sis213.internship.backend.entity.Internship;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InternshipBl {
    private InternshipRepository internshipRepository;

    public InternshipBl(InternshipRepository
                                internshipRepository) {
        this.internshipRepository = internshipRepository;
    }
    public Internship save(Internship newInternship) {
        return internshipRepository.save(newInternship);
    }
    public List<Internship> findAll() {
        return internshipRepository.findAll();
    }

    public List<Internship> findByCompanyId(Long companyId) {
        return internshipRepository.finaAllByCompanyId(companyId);
    }
}
