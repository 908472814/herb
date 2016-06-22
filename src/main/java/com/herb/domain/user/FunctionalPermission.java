package com.herb.domain.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.herb.domain.AbstractEntity;

/**
 * 功能权限
 * @author herb
 *
 */
@Entity
@Table(name="FUNCTIONAL_PERMISSION")
public class FunctionalPermission extends AbstractEntity implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="NAME")
	private String name;
	
	
	@Column(name="OPERATION")
	private String operation;
	
	@Column(name="URL")
	private String url;
	
//	@ManyToMany
//	private Set<Role> roles;

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

//	public Set<Role> getRoles() {
//		return roles;
//	}
//
//	public void setRoles(Set<Role> roles) {
//		this.roles = roles;
//	}
	
}
