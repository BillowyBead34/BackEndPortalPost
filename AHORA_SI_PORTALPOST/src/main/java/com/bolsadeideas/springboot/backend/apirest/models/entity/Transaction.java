package com.bolsadeideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "User")
public class Transaction implements Serializable {

	@Id
	@Column(name="TransactionId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long TransactionId;
	
	@Column(name="Phone", unique = true, length = 20)
	private String Phone;
	
	@Column(name="Identification", unique = true, length = 20)
	private String Identification;

	@Column(name="NameSurname", length = 60)
	private String NameSurname;

	@Column(name="Amount", length = 60)
	private String Amount;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="CreatedAt")
	@Temporal(TemporalType.DATE)
	private Date CreatedAt;

	@ManyToOne
	private Operation OperationId;

	@ManyToOne
	private Bank BankId;
	
	//@JoinColumn(name = "UserId", updatable = false, nullable = false)
	@OneToOne
    @JoinColumn(name = "UserId", updatable = false, nullable = false)
    private Usuario UserId;
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
