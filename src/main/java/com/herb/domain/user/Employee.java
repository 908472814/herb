package com.herb.domain.user;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.herb.domain.AbstractEntity;
import com.herb.domain.Company;

@Entity
@Table(name="EMPLOYEE")
public class Employee extends AbstractEntity implements Serializable{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	@Column
	private String name;
	
	@Column(nullable = false)
	private String account;
	
	@Column(nullable = false)
	private String pwd;
	
	@Column
	private String phone;
	
	@ManyToOne
	@JoinColumn(name="C_ID")
	private Company company;
	
	@ManyToMany
	@JoinColumn(name="ROLE_ID")
	private Set<Role> roles;
	
	@ElementCollection
	private Map<String, String> attributes = new HashMap<String, String>();
	
	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
