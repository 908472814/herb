package com.herb.domain.elevator;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.herb.domain.AbstractEntity;
@Entity
@Table(name="MONITORDEVICE")
public class MonitorDevice extends AbstractEntity implements Serializable{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	@Column
	private String serialNum;
	
	@Column
	private String type;
	
	@Column
	private String version;
	
	@Column
	private String softVersion;
	
	@Column
	private String communicationMode;
	
	@Column
	private String inputVoltage;
	
	@Column
	private Boolean hasUPS;
	
	@OneToOne
	private Elevator elevator;
	
	public Elevator getElevator() {
		return elevator;
	}
	public void setElevator(Elevator elevator) {
		this.elevator = elevator;
	}
	public String getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getCommunicationMode() {
		return communicationMode;
	}
	public void setCommunicationMode(String communicationMode) {
		this.communicationMode = communicationMode;
	}
	public String getInputVoltage() {
		return inputVoltage;
	}
	public void setInputVoltage(String inputVoltage) {
		this.inputVoltage = inputVoltage;
	}
	
	public Boolean getHasUPS() {
		return hasUPS;
	}
	public void setHasUPS(Boolean hasUPS) {
		this.hasUPS = hasUPS;
	}
	
	public String getSoftVersion() {
		return softVersion;
	}
	public void setSoftVersion(String softVersion) {
		this.softVersion = softVersion;
	}
	
}
