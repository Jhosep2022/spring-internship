package bo.edu.ucb.sis213.internship.backend.dto;

import java.util.Date;

public class CompanyDto {
    private Long companyId;
    private String businessName;
    private String tradeName;

    private String taxId;

    private String website;

    private Date createDate;

    private Boolean status;

    private Integer version;

    public CompanyDto() {
    }

    public CompanyDto(Long companyId, String businessName, String tradeName, String taxId, String website, Date createDate, Boolean status, Integer version) {
        this.companyId = companyId;
        this.businessName = businessName;
        this.tradeName = tradeName;
        this.taxId = taxId;
        this.website = website;
        this.createDate = createDate;
        this.status = status;
        this.version = version;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "CompanyDto{" +
                "companyId=" + companyId +
                ", businessName='" + businessName + '\'' +
                ", tradeName='" + tradeName + '\'' +
                ", taxId='" + taxId + '\'' +
                ", website='" + website + '\'' +
                ", createDate=" + createDate +
                ", status=" + status +
                ", version=" + version +
                '}';
    }
}
