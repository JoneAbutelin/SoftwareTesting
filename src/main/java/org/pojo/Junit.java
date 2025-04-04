package org.pojo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit {
	@Test
	public void Test1() {
		System.out.println("TC1");
	}

	@Test
	public void Test3() {
		System.out.println("TC3");

	}

	@Test
	public void Test4() {
		System.out.println("TC4");

	}

	@After
	public void Test() {
		System.out.println("Done");

	}

	@Test
	public void Test2() {
		System.out.println("TC2");

	}

	@BeforeClass
	public static void LaunchBrowser() {
		System.out.println("Launch browser");
	}

	@AfterClass
	public static void closeBrowser() {
		System.out.println("Close");
	}
}
