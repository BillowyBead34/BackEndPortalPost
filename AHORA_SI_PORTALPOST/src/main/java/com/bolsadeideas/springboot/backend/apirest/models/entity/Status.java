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
@Table(name="Status")
public class Status implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long StatusId;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="StatusName",unique=true, length=20)
	private String StatusName;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="StatusDescription", length=20)
	private String StatusDescription;	

	
	public Long getStatusId() {
		return StatusId;
	}


	public void setStatusId(Long statusId) {
		StatusId = statusId;
	}


	public String getStatusName() {
		return StatusName;
	}


	public void setStatusName(String statusName) {
		StatusName = statusName;
	}


	public String getStatusDescription() {
		return StatusDescription;
	}


	public void setStatusDescription(String statusDescription) {
		StatusDescription = statusDescription;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
