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

import org.hibernate.annotations.ManyToAny;

import com.herb.domain.AbstractEntity;
import com.herb.domain.AddressDetail;
import com.herb.domain.Area;

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
	
	@Column
	private Double longitude;
	
	@Column
	private Double latitude;
	
	@Column
	private Double x;
	
	@Column
	private Double y;
	
	@ManyToOne
	private Area area;
	
	@ManyToOne
	private AddressDetail addressDetail;
	
	@Column
	private String position;//一号位置
	
	@Column
	private String positionNum;//一号位置一号梯
	
	@Column
	private int floor;

	@ManyToOne
	private ElevatorModel elevatorModel;

	@OneToOne
	private MonitorDevice monitorDevice;
	
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
	
	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
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

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public AddressDetail getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(AddressDetail addressDetail) {
		this.addressDetail = addressDetail;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPositionNum() {
		return positionNum;
	}

	public void setPositionNum(String positionNum) {
		this.positionNum = positionNum;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}
}
