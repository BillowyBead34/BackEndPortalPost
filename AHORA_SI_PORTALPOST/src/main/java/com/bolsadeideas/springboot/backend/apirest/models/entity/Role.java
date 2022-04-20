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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="role")
public class Role implements Serializable{

	@Id
	@Column(name="role_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="role_name",unique=true, length=20)
	private String rolename;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="role_description", length=20)
	private String roledescription;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="createdat")
	@Temporal(TemporalType.DATE)
	private Date createdat;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="modifiedat")
	@Temporal(TemporalType.DATE)
	private Date modifiedat;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="role_operation", joinColumns= @JoinColumn(name="role_id"),
	inverseJoinColumns=@JoinColumn(name="operation_id"),
	uniqueConstraints= {@UniqueConstraint(columnNames= {"role_id", "operation_id"})})
	private List<Operation> operation;

	
	public Long getRoleid() {
		return id;
	}


	public void setRoleid(Long roleid) {
		this.id = roleid;
	}


	public String getRolename() {
		return rolename;
	}


	public void setRolename(String rolename) {
		this.rolename = rolename;
	}


	public String getRoledescription() {
		return roledescription;
	}


	public void setRoledescription(String roledescription) {
		this.roledescription = roledescription;
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


	public List<Operation> getOperation() {
		return operation;
	}


	public void setOperation(List<Operation> operation) {
		this.operation = operation;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
