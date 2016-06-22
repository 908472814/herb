package com.herb.domain.user;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.herb.domain.AbstractEntity;

/**
 * 角色
 * 
 * @author Administrator
 *
 */
@Entity
@Table(name="ROLE")
public class Role extends AbstractEntity implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private String name;

	@ManyToMany
	private Set<FunctionalPermissions> fnctnlPermissions;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role(String name) {
		this.name = name;
	}


//	public Set<User> getUser() {
//		return user;
//	}
//
//	public void setUser(Set<User> user) {
//		this.user = user;
//	}

	public Role() {

	}

	public Set<FunctionalPermissions> getFnctnlPermissions() {
		return fnctnlPermissions;
	}

	public void setFnctnlPermissions(Set<FunctionalPermissions> fnctnlPermissions) {
		this.fnctnlPermissions = fnctnlPermissions;
	}

}
