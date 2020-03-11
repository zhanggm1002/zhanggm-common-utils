package com.zhanggm.common.utils.test;

import java.util.List;

import org.junit.Test;

import com.zhanggm.common.utils.FileUtil;

public class FileTests {
	@Test
	public void readTextFileToList() {
		String fileName = "C:\\Users\\Administrator\\Desktop\\pom.xml";
		List<String> readTextFileToList = FileUtil.readTextFileToList(fileName);
		System.out.println(readTextFileToList);
	}
}
