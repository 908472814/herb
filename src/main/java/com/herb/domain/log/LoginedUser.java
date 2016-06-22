package com.herb.domain.log;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.herb.domain.AbstractEntity;
@Entity
@Table(name="LOGINED_USER")
public class LoginedUser extends AbstractEntity implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="IP")
	private String ip;
	
	@Column(name="MAC_ADDR")
	private String macAddr;
	
	@Column(name="LOGIN_TIME")
	private Timestamp loginTime;
	
	@Column(name="JSESSION_ID")
	private String jsessionid;
	
	@Column(name="TOKEN")
	private String token;
	
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getMacAddr() {
		return macAddr;
	}
	public void setMacAddr(String macAddr) {
		this.macAddr = macAddr;
	}
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
