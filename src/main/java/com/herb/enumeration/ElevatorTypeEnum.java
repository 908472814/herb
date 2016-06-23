package com.herb.enumeration;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

/**
 * 电梯种类枚举
 * @author Administrator
 *
 */
public enum ElevatorTypeEnum {
	ELEVATER(0,"直梯"),ESCALATOR(1,"扶梯");
	
	private int typeCode;
	private String typeName;
	
	private ElevatorTypeEnum(int typeCode, String typeName) {
		this.typeCode = typeCode;
		this.typeName = typeName;
	}

	public int getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(int typeCode) {
		this.typeCode = typeCode;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	public static String toJSONString(){
		Map<Integer, String> tmp = new HashMap<>();
		for (ElevatorTypeEnum c : ElevatorTypeEnum.values()) {  
			tmp.put(c.getTypeCode(), c.getTypeName());
        }  
		return  JSON.toJSONString(tmp);
	}
}
