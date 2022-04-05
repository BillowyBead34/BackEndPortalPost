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
@Table(name="Role")
public class Role implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long RoleId;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="RoleName",unique=true, length=20)
	private String RoleName;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="RoleDescription", length=20)
	private String RoleDescription;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="CreatedAt")
	@Temporal(TemporalType.DATE)
	private Date CreatedAt;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="ModifiedAt")
	@Temporal(TemporalType.DATE)
	private Date ModifiedAt;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="Role_Operation", joinColumns= @JoinColumn(name="RoleId"),
	inverseJoinColumns=@JoinColumn(name="OperationId"),
	uniqueConstraints= {@UniqueConstraint(columnNames= {"RoleId", "OperationId"})})
	private List<Operation> Operation;

	public Long getRoleId() {
		return RoleId;
	}

	public void setRoleId(Long roleId) {
		RoleId = roleId;
	}

	public String getRoleName() {
		return RoleName;
	}

	public void setRoleName(String roleName) {
		RoleName = roleName;
	}

	public String getRoleDescription() {
		return RoleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		RoleDescription = roleDescription;
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

	public List<Operation> getOperation() {
		return Operation;
	}

	public void setOperation(List<Operation> operation) {
		Operation = operation;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
