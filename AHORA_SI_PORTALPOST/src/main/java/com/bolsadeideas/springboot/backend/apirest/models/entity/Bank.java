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
@Table(name="bank")
public class Bank implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long bank_id;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="bank_code",unique=true, length=20)
	private String bankcode;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="bank_name", length=20)
	private String bankname;	

	
	
	public Long getBank_id() {
		return bank_id;
	}



	public void setBank_id(Long bank_id) {
		this.bank_id = bank_id;
	}



	public String getBankcode() {
		return bankcode;
	}



	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}



	public String getBankname() {
		return bankname;
	}



	public void setBankname(String bankname) {
		this.bankname = bankname;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
