package com.herb.domain.elevator;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.herb.domain.AbstractEntity;

@Entity
@Table(name="ELEVATOR_MODEL")
public class ElevatorModel extends AbstractEntity implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="MODEL_NAME")
	private String modelName;
	
	@Column(name="MODEL_CODE")
	private String modelCode;

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelCode() {
		return modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}
	
	
}
