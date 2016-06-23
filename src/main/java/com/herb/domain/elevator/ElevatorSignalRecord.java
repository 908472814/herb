package com.herb.domain.elevator;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.herb.domain.AbstractEntity;

@Entity
@Table(name = "ELEVATOR_SIGNAL_RECORD")
public class ElevatorSignalRecord extends AbstractEntity implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="FLOOR")
	private String floot;

	public String getFloot() {
		return floot;
	}

	public void setFloot(String floot) {
		this.floot = floot;
	}
}	
