package com.herb.domain.elevator;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.herb.domain.AbstractEntity;

@Entity
@Table(name = "ELEVATOR")
public class Elevator extends AbstractEntity implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	@Column
	private String serialNum;

	@Column
	private Integer elevatorType;

	@Column
	private Integer dragMode;

	@Column
	private Integer controlMode;

	@Column
	private Integer elevatorFntClass;

	@Column
	private Integer speed;

	@Column
	private Integer ratedLoad;

	@Column
	private Integer passengersNumber;

	@Column
	private String registrationCode;

	@Column
	private Integer runStatus;

	@Column
	private Integer payStauts;

	@Column
	private Integer onLineStatus;

	@Column
	private Integer checkStatus;

	@Column
	private Integer healthStatus;

	@Column
	private Boolean isPeopleTrapped;

	@ManyToOne
	private ElevatorModel elevatorModel;

	@OneToOne
	private MonitorDevice monitorDevice;
	
	@Column
	private double longitude;
	
	@Column
	private double latitude;
	
	@Column
	private double x;
	
	@Column
	private double y;
	
	@OneToMany
	private Set<ElevatorFaultRecord> elevatorFaultRecord;

	@ElementCollection
	private Map<String, String> attributes = new HashMap<String, String>();

	public Set<ElevatorFaultRecord> getElevatorFaultRecord() {
		return elevatorFaultRecord;
	}

	public void setElevatorFaultRecord(Set<ElevatorFaultRecord> elevatorFaultRecord) {
		this.elevatorFaultRecord = elevatorFaultRecord;
	}

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Integer getRatedLoad() {
		return ratedLoad;
	}

	public void setRatedLoad(Integer ratedLoad) {
		this.ratedLoad = ratedLoad;
	}

	public Integer getPassengersNumber() {
		return passengersNumber;
	}

	public void setPassengersNumber(Integer passengersNumber) {
		this.passengersNumber = passengersNumber;
	}

	public Integer getElevatorType() {
		return elevatorType;
	}

	public void setElevatorType(Integer elevatorType) {
		this.elevatorType = elevatorType;
	}

	public ElevatorModel getElevatorModel() {
		return elevatorModel;
	}

	public void setElevatorModel(ElevatorModel elevatorModel) {
		this.elevatorModel = elevatorModel;
	}

	public Integer getDragMode() {
		return dragMode;
	}

	public void setDragMode(Integer dragMode) {
		this.dragMode = dragMode;
	}

	public Integer getControlMode() {
		return controlMode;
	}

	public void setControlMode(Integer controlMode) {
		this.controlMode = controlMode;
	}

	public Integer getElevatorFntClass() {
		return elevatorFntClass;
	}

	public void setElevatorFntClass(Integer elevatorFntClass) {
		this.elevatorFntClass = elevatorFntClass;
	}

	public MonitorDevice getMonitorDevice() {
		return monitorDevice;
	}

	public void setMonitorDevice(MonitorDevice monitorDevice) {
		this.monitorDevice = monitorDevice;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}

	public Integer getRunStatus() {
		return runStatus;
	}

	public void setRunStatus(Integer runStatus) {
		this.runStatus = runStatus;
	}

	public Integer getPayStauts() {
		return payStauts;
	}

	public void setPayStauts(Integer payStauts) {
		this.payStauts = payStauts;
	}

	public Integer getOnLineStatus() {
		return onLineStatus;
	}

	public void setOnLineStatus(Integer onLineStatus) {
		this.onLineStatus = onLineStatus;
	}

	public Integer getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(Integer checkStatus) {
		this.checkStatus = checkStatus;
	}

	public Integer getHealthStatus() {
		return healthStatus;
	}

	public void setHealthStatus(Integer healthStatus) {
		this.healthStatus = healthStatus;
	}

	public Boolean getIsPeopleTrapped() {
		return isPeopleTrapped;
	}

	public void setIsPeopleTrapped(Boolean isPeopleTrapped) {
		this.isPeopleTrapped = isPeopleTrapped;
	}

	public String getRegistrationCode() {
		return registrationCode;
	}

	public void setRegistrationCode(String registrationCode) {
		this.registrationCode = registrationCode;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	
	
}
