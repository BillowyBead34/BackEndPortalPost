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
@Table(name = "operation")
public class Operation implements Serializable {

	@Id
	@Column(name="operation_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="operation_name",unique = true, length = 20)
	private String operationname;

	

	public Long getOperation_id() {
		return id;
	}



	public void setOperation_id(Long operation_id) {
		this.id = operation_id;
	}



	public String getOperationname() {
		return operationname;
	}



	public void setOperationname(String operationname) {
		this.operationname = operationname;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
