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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "User")
public class Usuario implements Serializable {

	@Id
	@Column(name="UserId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long UserId;
	
	@Column(name="Identification", unique = true, length = 20)
	private String Identification;
	
	@Column(name="UserName", unique = true, length = 20)
	private String UserName;

	@Column(name="Password", length = 60)
	private String Password;

	@Column(name="Names", length = 60)
	private String Names;
	
	@Column(name="SurNames", length = 20)
	private String Surnames;

	@Column(name="Email", unique = true)
	private String Email;
	
	@Column(name="Avatar")
	private String Avatar;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="CreatedAt")
	@Temporal(TemporalType.DATE)
	private Date CreatedAt;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="ModifiedAt")
	@Temporal(TemporalType.DATE)
	private Date ModifiedAt;
	
	@NotEmpty(message ="no puede estar vacio")
	@Column(name="LastLogin",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date Lastlogin;

	@ManyToOne
	private Status StatusId;

	@ManyToOne
	private Role RoleId;
	
	@OneToMany( targetEntity=Business.class )
	private List Businesslist;
	
	

	public Usuario() {
		super();
	}

	public Usuario(Long userId, String identification, String userName, String password, String names, String surnames,
			String email, String avatar, @NotNull(message = "no puede estar vacio") Date createdAt,
			@NotNull(message = "no puede estar vacio") Date modifiedAt,
			@NotEmpty(message = "no puede estar vacio") Date lastlogin, Status statusId, Role roleId,
			List businesslist) {
		super();
		UserId = userId;
		Identification = identification;
		UserName = userName;
		Password = password;
		Names = names;
		Surnames = surnames;
		Email = email;
		Avatar = avatar;
		CreatedAt = createdAt;
		ModifiedAt = modifiedAt;
		Lastlogin = lastlogin;
		StatusId = statusId;
		RoleId = roleId;
		Businesslist = businesslist;
	}

	public Long getUserId() {
		return UserId;
	}

	public void setUserId(Long userId) {
		UserId = userId;
	}

	public String getIdentification() {
		return Identification;
	}

	public void setIdentification(String identification) {
		Identification = identification;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getNames() {
		return Names;
	}

	public void setNames(String names) {
		Names = names;
	}

	public String getSurnames() {
		return Surnames;
	}

	public void setSurnames(String surnames) {
		Surnames = surnames;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAvatar() {
		return Avatar;
	}

	public void setAvatar(String avatar) {
		Avatar = avatar;
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

	public Date getLastlogin() {
		return Lastlogin;
	}

	public void setLastlogin(Date lastlogin) {
		Lastlogin = lastlogin;
	}

	public Status getStatusId() {
		return StatusId;
	}

	public void setStatusId(Status statusId) {
		StatusId = statusId;
	}

	public Role getRoleId() {
		return RoleId;
	}

	public void setRoleId(Role roleId) {
		RoleId = roleId;
	}

	public List getBusinesslist() {
		return Businesslist;
	}

	public void setBusinesslist(List businesslist) {
		Businesslist = businesslist;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
