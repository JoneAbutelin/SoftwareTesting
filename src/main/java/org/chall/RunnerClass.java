package org.chall;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunnerClass {
    @Test
    public void runAllTests() {
		Result rc = JUnitCore.runClasses(A.class,B.class);
		System.out.println("Total tc run:" + rc.getRunCount());
		System.out.println("Total run time:" + rc.getRunTime());
		System.out.println("Total failure count :" + rc.getFailureCount());
		System.out.println("Total ignore count :" + rc.getIgnoreCount());
		List<Failure> f = rc.getFailures();
		for (Failure fails : f) {
			System.out.println(fails);
			
		}
	}
}
