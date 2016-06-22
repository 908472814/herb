package com.herb.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.herb.domain.elevator.Elevator;

@Entity
@Table(name="AREA")
public class Area extends AbstractEntity implements Serializable{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="NAME")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="P_ID")
	private Area pArea;
	
	@OneToMany
	@JoinColumn(name="P_ID")
	private Set<Area> cAreas;
	
	@Column(name="LONGITUDE")
	private Double longitude;
	
	@Column(name="LATITUDE")
	private Double latitude;
	
	@Column(name="HIERARCHICAL")
	private Integer hierarchical;//层次
	
	@Column(name="HIERARCHICALNAME")
	private String hierarchicalName;
	
	@OneToMany
	private Set<Elevator> elevatores;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Area getpArea() {
		return pArea;
	}

	public void setpArea(Area pArea) {
		this.pArea = pArea;
	}

	public Set<Area> getcAreas() {
		return cAreas;
	}

	public void setcAreas(Set<Area> cAreas) {
		this.cAreas = cAreas;
	}

	public Double getLongitude() {
		return longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public Integer getHierarchical() {
		return hierarchical;
	}

	public void setHierarchical(Integer hierarchical) {
		this.hierarchical = hierarchical;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public String getHierarchicalName() {
		return hierarchicalName;
	}

	public void setHierarchicalName(String hierarchicalName) {
		this.hierarchicalName = hierarchicalName;
	}

	public Set<Elevator> getElevatores() {
		return elevatores;
	}

	public void setElevatores(Set<Elevator> elevatores) {
		this.elevatores = elevatores;
	}
}
