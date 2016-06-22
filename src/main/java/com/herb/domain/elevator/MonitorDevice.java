package com.herb.domain.elevator;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.herb.domain.AbstractEntity;
@Entity
@Table(name="MONITOR_DEVICE")
public class MonitorDevice extends AbstractEntity implements Serializable{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="SERIAL_NUM")
	private String serialNum;
	
	@Column(name="TYPE")
	private String type;
	
	@Column(name="VERSION")
	private String version;
	
	@Column(name="SOFT_VERSION")
	private String softVersion;
	
	@Column(name="COMMUNICATION_MODE")
	private String communicationMode;
	
	@Column(name="INPUT_VOLTAGE")
	private String inputVoltage;
	
	@Column(name="HAS_UPS")
	private Boolean hasUPS;
	
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
