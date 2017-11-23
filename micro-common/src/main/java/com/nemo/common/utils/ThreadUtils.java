package com.nemo.common.utils;

public class ThreadUtils {
	public static void printstacktrace() {
		StackTraceElement[] steArr = Thread.currentThread().getStackTrace();
		for (StackTraceElement ste : steArr) {
			System.out.println(ste.getClassName() + "." + ste.getMethodName() + "(" + ste.getLineNumber() + ")");
		}
	}
}
