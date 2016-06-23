package com.herb.domain.elevator;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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

	@Column(name="SERIAL_NUM")
	private String serialNum;

	@Column(name="ELEVATOR_TYPE")
	private Integer elevatorType;//种类。曳引式电梯，液压电梯，自动扶梯，自动人行道

	@Column(name="DRAG_MODE")
	private Integer dragMode;//拖动方式，交流，直流，液压
	
	@Column(name="DRIVE_MODE")
	private Integer driveMode;//驱动方式，强制驱动电梯，曳引驱动电梯，液压电梯

	@Column(name="CONTROL_MODE")
	private Integer controlMode;//控制方式

	@Column(name="ELEVATOR_FNT_CLASS")
	private Integer elevatorFntClass;//功能分类，乘客电梯，载货电梯，客货两用，病床电梯，住宅电梯，杂物电梯，船用电梯，观光电梯，汽车电梯

	@Column(name="SPEED")
	private Integer speed;

	@Column(name="RATED_LOAD")
	private Integer ratedLoad;

	@Column(name="PASSENGERS_NUMBER")
	private Integer passengersNumber;

	@Column(name="REGISTRATION_CODE")
	private String registrationCode;

	@Column(name="RUN_STATUS")
	private Integer runStatus;

	@Column(name="PAY_STAUTS")
	private Integer payStauts;

	@Column(name="ON_LINESTATUS")
	private Integer onLineStatus;

	@Column(name="CHECK_STATUS")
	private Integer checkStatus;

	@Column(name="HEALTH_STATUS")
	private Integer healthStatus;

	@Column(name="IS_PEOPLE_TRAPPED")
	private Boolean isPeopleTrapped;
	
	@Column(name="LONGITUDE")
	private Double longitude;
	
	@Column(name="LATITUDE")
	private Double latitude;
	
	@Column(name="X")
	private Double x;
	
	@Column(name="Y")
	private Double y;
	
	@Column(name="LOCATION")
	private String location;
	
	@Column(name="SUB_LOCATION")
	private String subLocation;
	
	@ManyToOne
	private Area area;
	
	@ManyToOne
	private AddressDetail addressDetail;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="FLOOR")
	private int floor;

	@ManyToOne
	private ElevatorModel elevatorModel;//电梯型号

	@OneToOne
	@JoinColumn(name="MONITORDEVICE_ID")
	private MonitorDevice monitorDevice;
	
	@OneToMany
	@JoinColumn(name="ELEVATOR_ID")
	private Set<ElevatorFaultRecord> elevatorFaultRecordes;
	
	@OneToMany
	@JoinColumn(name="ELEVATOR_ID")
	private Set<ElevatorSignalRecord> elevatorSignalRecordes;

	@ElementCollection
	private Map<String, String> attributes = new HashMap<String, String>();

	public Set<ElevatorFaultRecord> getElevatorFaultRecordes() {
		return elevatorFaultRecordes;
	}

	public void setElevatorFaultRecordes(Set<ElevatorFaultRecord> elevatorFaultRecordes) {
		this.elevatorFaultRecordes = elevatorFaultRecordes;
	}

	public Set<ElevatorSignalRecord> getElevatorSignalRecordes() {
		return elevatorSignalRecordes;
	}

	public void setElevatorSignalRecordes(Set<ElevatorSignalRecord> elevatorSignalRecordes) {
		this.elevatorSignalRecordes = elevatorSignalRecordes;
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
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public Integer getDriveMode() {
		return driveMode;
	}

	public void setDriveMode(Integer driveMode) {
		this.driveMode = driveMode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSubLocation() {
		return subLocation;
	}

	public void setSubLocation(String subLocation) {
		this.subLocation = subLocation;
	}
	
}
