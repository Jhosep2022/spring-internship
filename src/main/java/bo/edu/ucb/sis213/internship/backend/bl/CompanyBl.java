package bo.edu.ucb.sis213.internship.backend.bl;

import bo.edu.ucb.sis213.internship.backend.dao.CompanyRepository;
import bo.edu.ucb.sis213.internship.backend.dto.CompanyDto;
import bo.edu.ucb.sis213.internship.backend.entity.Company;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CompanyBl {
    private CompanyRepository companyRepository;

    public CompanyBl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public CompanyDto save(CompanyDto companyDto) {
        Company company = new Company();
        company.setCompanyId(companyDto.getCompanyId());
        company.setBusinessName(companyDto.getBusinessName());
        company.setTradeName(companyDto.getTradeName());
        company.setTaxId(companyDto.getTaxId());
        company.setWebsite(companyDto.getWebsite());
        company.setCreateDate(companyDto.getCreateDate());
        company.setVersion(companyDto.getVersion());
        company.setTxDate(new Date());
        company.setTxUser("admin");
        company.setStatus(true);
        company.setTxHost("localhost");
        companyRepository.saveAndFlush(company);
        company.setCompanyId(company.getCompanyId()); // Colocar el ID generado
        return companyDto;
    }
}
