package com.herb.domain.elevator;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.herb.domain.AbstractEntity;

@Entity
@Table(name = "FAULTCODE")
public class FaultCode extends AbstractEntity implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	@Column
	private Integer faultCode;
	
	@Column
	private String faultName;
	
	@Column
	private String faultDesc;
	public Integer getFaultCode() {
		return faultCode;
	}
	public void setFaultCode(Integer faultCode) {
		this.faultCode = faultCode;
	}
	public String getFaultName() {
		return faultName;
	}
	public void setFaultName(String faultName) {
		this.faultName = faultName;
	}
	public String getFaultDesc() {
		return faultDesc;
	}
	public void setFaultDesc(String faultDesc) {
		this.faultDesc = faultDesc;
	}
	
}
