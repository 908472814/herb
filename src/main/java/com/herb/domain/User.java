package com.herb.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/**
 * 角色
 * @author Administrator
 *
 */
@Entity
@Table(name="USER")
public class User extends AbstractEntity implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String pwd;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade=CascadeType.ALL) 
	@JoinColumn(name="ROLE_ID")
	private Role Role;
	
	@OneToOne
	@JoinColumn(name="E_ID")
	private Employee Employee;
	
	public Employee getEmployee() {
		return Employee;
	}

	public void setEmployee(Employee employee) {
		Employee = employee;
	}

	public Role getRole() {
		return Role;
	}

	public void setRole(Role Role) {
		this.Role = Role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String name) {
		this.name = name;
	}

	public User() {
		
	}

}
