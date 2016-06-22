package com.herb.domain.log;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.herb.domain.AbstractEntity;
@Entity
@Table(name="LoginedUser")
public class LoginedUser extends AbstractEntity implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	private String ip;
	
	@Column
	private String mac_addr;
	
	@Column(nullable = false)
	private Timestamp loginTime;
	
	@Column(nullable = false)
	private String jsessionid;
	
	@Column(nullable = false)
	private String token;
	
	
	public Timestamp getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Timestamp loginTime) {
		this.loginTime = loginTime;
	}
	public String getJsessionid() {
		return jsessionid;
	}
	public void setJsessionid(String jsessionid) {
		this.jsessionid = jsessionid;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
}
