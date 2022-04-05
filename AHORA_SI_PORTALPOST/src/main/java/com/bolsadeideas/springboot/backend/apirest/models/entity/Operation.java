package com.bolsadeideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;
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
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Operation")
public class Operation implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long OperationId;

	@Column(unique = true, length = 20)
	private String OperationName;

	public Long getOperationId() {
		return OperationId;
	}

	public void setOperationId(Long operationId) {
		OperationId = operationId;
	}

	public String getOperationName() {
		return OperationName;
	}

	public void setOperationName(String operationName) {
		OperationName = operationName;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
