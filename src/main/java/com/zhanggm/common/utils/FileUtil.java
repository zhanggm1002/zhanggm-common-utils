package com.zhanggm.common.utils;
/**
 * @ClassName:  FileUtil   
 * @Description: 文件工具类  
 * @date:   2020年1月3日 上午9:06:40
 */
public class FileUtil {
	
	public String getExtName(String str) {
		if(StringUtil.isNull(str)) {
			return null;
		}
		return str.substring(str.indexOf("."));
	}
}
