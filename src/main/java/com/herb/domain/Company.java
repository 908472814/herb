package com.herb.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="COMPANY")
public class Company extends AbstractEntity implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private Integer type;
	
	@Column
	private String addr;
	
	@Column
	private String phone;
	
	@Column
	private String fax;
	
	@Column
	private String email;
	
	@OneToMany
	@JoinColumn(name="C_ID")
	private Set<Employee> employees;
}
