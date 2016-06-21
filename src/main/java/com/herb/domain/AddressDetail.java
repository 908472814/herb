package com.herb.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.herb.domain.elevator.Elevator;

@Entity
@Table(name="ADDRESSDETAIL")
public class AddressDetail extends AbstractEntity implements Serializable{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;


	@Column
	private String detail;
	
	@OneToMany
	private Set<Elevator> elevatores;
	
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Set<Elevator> getElevatores() {
		return elevatores;
	}
	public void setElevatores(Set<Elevator> elevatores) {
		this.elevatores = elevatores;
	}
	
}