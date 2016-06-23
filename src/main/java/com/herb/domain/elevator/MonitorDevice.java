package com.herb.domain.elevator;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
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
	
	@Column(name="VERSION")
	private String version;
	
	@Column(name="HARDWARE_VERSION")
	private String hardwareversion;
	
	@Column(name="SOFT_VERSION")
	private String softVersion;
	
	@Column(name="COMMUNICATION_MODE")
	private String communicationMode;
	
	@ManyToOne
	private MonitorDevModel monitorDevModel;
	
	@ElementCollection
	private Map<String, String> attributes = new HashMap<String, String>();
	
	public String getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
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
	
	public String getSoftVersion() {
		return softVersion;
	}
	public void setSoftVersion(String softVersion) {
		this.softVersion = softVersion;
	}
	public MonitorDevModel getMonitorDevModel() {
		return monitorDevModel;
	}
	public void setMonitorDevModel(MonitorDevModel monitorDevModel) {
		this.monitorDevModel = monitorDevModel;
	}
	public Map<String, String> getAttributes() {
		return attributes;
	}
	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}
	public String getHardwareversion() {
		return hardwareversion;
	}
	public void setHardwareversion(String hardwareversion) {
		this.hardwareversion = hardwareversion;
	}
}
