package com.bolsadeideas.springboot.backend.apirest.models.entity;
//187
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
@Table(name = "user")
public class Usuario implements Serializable {

	//@OneToOne(mappedBy="User", fetch=FetchType.LAZY); este se meteria aqui si desearamos saber ambos lados, tanto user como transaccion
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="identification", unique = true, length = 20)
	private String identification;
	
	@Column(name="username", unique = true, length = 20)
	private String username;

	@Column(name="password", length = 60)
	private String password;

	@Column(name="names", length = 60)
	private String names;
	
	@Column(name="surnames", length = 20)
	private String surnames;

	@Column(name="email", unique = true)
	private String email;
	
	@Column(name="avatar")
	private String avatar;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="createdat")
	@Temporal(TemporalType.DATE)
	private Date createdat;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="modifiedat")
	@Temporal(TemporalType.DATE)
	private Date modifiedat;
	
	@NotEmpty(message ="no puede estar vacio")
	@Column(name="lastlogin",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date lastlogin;

	@Column(name="enabled")
	private Boolean enabled;

	@ManyToOne
	private Role role_id;
	
	@OneToMany( targetEntity=Business.class )
	private List business_id;
	
	

	

	public Long getUser_id() {
		return id;
	}





	public void setUser_id(Long user_id) {
		this.id = user_id;
	}





	public String getIdentification() {
		return identification;
	}





	public void setIdentification(String identification) {
		this.identification = identification;
	}




	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}





	public String getNames() {
		return names;
	}





	public void setNames(String names) {
		this.names = names;
	}





	public String getSurnames() {
		return surnames;
	}





	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public String getAvatar() {
		return avatar;
	}





	public void setAvatar(String avatar) {
		this.avatar = avatar;
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





	public Date getLastlogin() {
		return lastlogin;
	}





	public void setLastlogin(Date lastlogin) {
		this.lastlogin = lastlogin;
	}




	public Boolean getEnabled() {
		return enabled;
	}





	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}





	public Role getRole_id() {
		return role_id;
	}





	public void setRole_id(Role role_id) {
		this.role_id = role_id;
	}





	





	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public String getUsername() {
		return username;
	}





	public void setUsername(String username) {
		this.username = username;
	}





	public List getBusiness_id() {
		return business_id;
	}





	public void setBusiness_id(List business_id) {
		this.business_id = business_id;
	}











	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
