package com.herb.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * 角色
 * 
 * @author Administrator
 *
 */
@Entity
@Table(name="ROLES")
public class Roles extends AbstractEntity implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private String name;

	@Column
	private String desc;
	
	@ManyToMany
	private Set<FunctionalPermissions> fnctnlPermissions;

//	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
//	@JoinColumn(name = "role_id")
//	private Set<User> user;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Roles(String name) {
		super();
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

//	public Set<User> getUser() {
//		return user;
//	}
//
//	public void setUser(Set<User> user) {
//		this.user = user;
//	}

	
	public Roles() {

	}

	public Set<FunctionalPermissions> getFnctnlPermissions() {
		return fnctnlPermissions;
	}

	public void setFnctnlPermissions(Set<FunctionalPermissions> fnctnlPermissions) {
		this.fnctnlPermissions = fnctnlPermissions;
	}

}
