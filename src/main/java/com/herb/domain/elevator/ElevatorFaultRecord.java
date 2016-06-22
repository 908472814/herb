package com.herb.domain.elevator;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.herb.domain.AbstractEntity;

@Entity
@Table(name = "ElevatorFaultRecord")
public class ElevatorFaultRecord extends AbstractEntity implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private FaultCode faultCode;
	
	@Column
	private Timestamp happendTime;

	public FaultCode getFaultCode() {
		return faultCode;
	}

	public void setFaultCode(FaultCode faultCode) {
		this.faultCode = faultCode;
	}

	public Timestamp getHappendTime() {
		return happendTime;
	}

	public void setHappendTime(Timestamp happendTime) {
		this.happendTime = happendTime;
	}
}	
