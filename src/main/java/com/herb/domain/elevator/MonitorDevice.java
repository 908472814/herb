package com.herb.domain.elevator;

import com.herb.domain.AbstractEntity;

public class MonitorDevice extends AbstractEntity{
	private String serialNum;
	private String type;
	private String version;
	private String softVersion;
	private String communicationMode;
	private String inputVoltage;
	private Boolean hasUPS;
	private String desc;
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getSoftVersion() {
		return softVersion;
	}
	public void setSoftVersion(String softVersion) {
		this.softVersion = softVersion;
	}
	
}
