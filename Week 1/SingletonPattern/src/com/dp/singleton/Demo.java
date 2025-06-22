package com.dp.singleton;

public class Demo {

	public static void main(String[] args) {
		Logger logger1=Logger.getInstance();
		logger1.log("Starting the application");
		Logger logger2=Logger.getInstance();
		logger2.log("Running the application");

		System.out.println(logger1==logger2);
	
	}

}