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
	private double longitude;
	
	@Column(name="LATITUDE")
	private double latitude;
	
	@Column(name="HIERARCHICAL")
	private int hierarchical;//层次
	
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

	public int getHierarchical() {
		return hierarchical;
	}

	public void setHierarchical(int hierarchical) {
		this.hierarchical = hierarchical;
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
