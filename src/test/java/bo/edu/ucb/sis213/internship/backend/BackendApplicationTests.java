package bo.edu.ucb.sis213.internship.backend;

import bo.edu.ucb.sis213.internship.backend.bl.InternshipBl;
import bo.edu.ucb.sis213.internship.backend.dao.CompanyRepository;
import bo.edu.ucb.sis213.internship.backend.entity.Company;
import bo.edu.ucb.sis213.internship.backend.entity.Internship;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BackendApplicationTests {

	@Autowired
	private InternshipBl internshipBl;

	@Autowired
	private CompanyRepository companyRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createInternship() {
		Company company = new Company();
		company.setBusinessName("Business 1");
		company.setTradeName("Trade 1");
		company.setTaxId("1111111");
		company.setWebsite("https://www.example1.com");
		company.setLogoUrl("https://www.example1.com/logo.png");
		company.setCreateDate(new Date());
		company.setStatus(true);
		company.setVersion(1);
		company.setTxDate(new Date());
		company.setTxUser("User1");
		company.setTxHost("Host1");
		companyRepository.saveAndFlush(company);
		System.out.println("Company ID: " + company.getCompanyId());

		Internship internship = new Internship();
		internship.setCompanyId(company);
		internship.setTitle("Pasantía de");
		internship.setDescription("Descripción de la pasantía");
		internship.setDeadline(new Date());
		internship.setCreateDate(new Date());
		internship.setStatus(true);
		internship.setVersion(1);
		internship.setTxDate(new Date());
		internship.setTxUser("John Doe");
		internship.setTxHost("localhost");
		Internship newInternship  = internshipBl.save(internship);
		assertNotNull(newInternship, "No se pudo crear la pasantía");
		assertNotNull(newInternship.getInternshipId(), "La llave primaria es nula");
	}

	@Test
	public void findByCompanyId(){
		List<Internship> internshipList = internshipBl.findByCompanyId(1L);
		assertNotNull(internshipList, "La lista de pasantías es nula");
		assertTrue(internshipList.size() > 0, "La lista de pasantías está vacía");
	}


}
