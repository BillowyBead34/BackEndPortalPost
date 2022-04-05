package com.bolsadeideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Business")
public class Business implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long BusinessId;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="RIF",unique=true, length=20)
	private String RIF;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="BusinessName",unique=true, length=20)
	private String BusinessName;
	
	@Column(name="MailBusiness", unique = true)
	private String MailBusiness;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="CreatedAt")
	@Temporal(TemporalType.DATE)
	private Date CreatedAt;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="ModifiedAt")
	@Temporal(TemporalType.DATE)
	private Date ModifiedAt;


	public Long getBusinessId() {
		return BusinessId;
	}


	public void setBusinessId(Long businessId) {
		BusinessId = businessId;
	}


	public String getRIF() {
		return RIF;
	}


	public void setRIF(String RIF) {
		RIF = RIF;
	}


	public String getBusinessName() {
		return BusinessName;
	}


	public void setBusinessName(String businessName) {
		BusinessName = businessName;
	}


	public String getMailBusiness() {
		return MailBusiness;
	}


	public void setMailBusiness(String mailBusiness) {
		MailBusiness = mailBusiness;
	}


	public Date getCreatedAt() {
		return CreatedAt;
	}


	public void setCreatedAt(Date createdAt) {
		CreatedAt = createdAt;
	}


	public Date getModifiedAt() {
		return ModifiedAt;
	}


	public void setModifiedAt(Date modifiedAt) {
		ModifiedAt = modifiedAt;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
