package com.herb.enumeration;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

public enum DragModeEnum {
	AC(0,"交流"),DC(1,"直流");
	private int modeCode;
	private String modeName;
	private DragModeEnum(int modeCode, String modeName) {
		this.modeCode = modeCode;
		this.modeName = modeName;
	}
	
	public int getModeCode() {
		return modeCode;
	}

	public void setModeCode(int modeCode) {
		this.modeCode = modeCode;
	}

	public String getModeName() {
		return modeName;
	}

	public void setModeName(String modeName) {
		this.modeName = modeName;
	}

	public static String toJSONString(){
		Map<Integer, String> tmp = new HashMap<>();
		for (ElevatorTypeEnum c : ElevatorTypeEnum.values()) {  
			tmp.put(c.getTypeCode(), c.getTypeName());
        }  
		return  JSON.toJSONString(tmp);
	}
}
