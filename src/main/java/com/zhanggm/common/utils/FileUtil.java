package com.zhanggm.common.utils;

public class FileUtil {
	
	public String getExtName(String str) {
		if(StringUtil.isNull(str)) {
			return null;
		}
		return str.substring(str.indexOf("."));
	}
}
