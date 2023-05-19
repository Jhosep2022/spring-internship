package bo.edu.ucb.sis213.internship.backend.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;

    @Column(name = "business_name", nullable = false)
    private String businessName;

    @Column(name = "trade_name", nullable = false)
    private String tradeName;

    @Column(name = "tax_id", nullable = false)
    private String taxId;

    @Column(name = "website", nullable = false)
    private String website;

    @Column(name = "logo_url", nullable = false)
    private String logoUrl;

    @Column(name = "create_date", nullable = false)
    private Date createDate;

    @Column(name = "status", nullable = false)
    private Boolean status;

    @Version
    @Column(name = "version", nullable = false)
    private Integer version;

    @Column(name = "tx_date", nullable = false)
    private Date txDate;

    @Column(name = "tx_user", nullable = false)
    private String txUser;

    @Column(name = "tx_host", nullable = false)
    private String txHost;

    public Company() {
    }

    public Company(Long companyId, String businessName, String tradeName, String taxId, String website,
                   String logoUrl, Date createDate, Boolean status, Integer version, Date txDate, String txUser,
                   String txHost) {
        this.companyId = companyId;
        this.businessName = businessName;
        this.tradeName = tradeName;
        this.taxId = taxId;
        this.website = website;
        this.logoUrl = logoUrl;
        this.createDate = createDate;
        this.status = status;
        this.version = version;
        this.txDate = txDate;
        this.txUser = txUser;
        this.txHost = txHost;
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

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
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

    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }

    public String getTxUser() {
        return txUser;
    }

    public void setTxUser(String txUser) {
        this.txUser = txUser;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + companyId +
                ", businessName='" + businessName + '\'' +
                ", tradeName='" + tradeName + '\'' +
                ", taxId='" + taxId + '\'' +
                ", website='" + website + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                ", createDate=" + createDate +
                ", status=" + status +
                ", version=" + version +
                ", txDate=" + txDate +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                '}';
    }
}
