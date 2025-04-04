package org.flip;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

/*import cucumber.api.java.After;
import cucumber.api.java.Before;*/


public class HookClassEx extends BaseClass{
	@Before(order = 2)
	public void preCondition() {
      launchBrowser();
      System.out.println("started");
	}
	@Before(order = 3, value ="@Fb")
	public void preCondition1() {
		System.out.println("launched scenario");
	}

	@Before(order = 1)
	public void preCondition2() {
		System.out.println("Start");
	}

	@After(order=10)
	public void postConditionss() {
		System.out.println("Close");
	}
	@After(order=4)
	public void postCondition() {
    closeBrowser();
	}
	

}
