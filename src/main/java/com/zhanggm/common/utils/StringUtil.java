package com.zhanggm.common.utils;

public class StringUtil {
	
	public static boolean isNull(String str) {
		if(str==null || "".equals(str)) {
			return false;
		}
		return true;
	}
	
	public static boolean isNotNull(String str) {
		return !isNull(str);
	}

}
