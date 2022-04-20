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
@Table(name="business")
public class Business implements Serializable{

	@Id
	@Column(name="business_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="rif",unique=true, length=20)
	private String rif;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="business_name",unique=true, length=20)
	private String businessname;
	
	@Column(name="mail_business", unique = true)
	private String mailbusiness;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="createdat")
	@Temporal(TemporalType.DATE)
	private Date createdat;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="modifiedat")
	@Temporal(TemporalType.DATE)
	private Date modifiedat;



	public Long getBusiness_id() {
		return id;
	}



	public void setBusiness_id(Long business_id) {
		this.id = business_id;
	}



	public String getRif() {
		return rif;
	}



	public void setRif(String rif) {
		this.rif = rif;
	}



	public String getBusinessname() {
		return businessname;
	}



	public void setBusinessname(String businessname) {
		this.businessname = businessname;
	}



	public String getMailbusiness() {
		return mailbusiness;
	}



	public void setMailbusiness(String mailbusiness) {
		this.mailbusiness = mailbusiness;
	}



	public Date getCreatedat() {
		return createdat;
	}



	public void setCreatedat(Date createdat) {
		this.createdat = createdat;
	}



	public Date getModifiedat() {
		return modifiedat;
	}



	public void setModifiedat(Date modifiedat) {
		this.modifiedat = modifiedat;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
