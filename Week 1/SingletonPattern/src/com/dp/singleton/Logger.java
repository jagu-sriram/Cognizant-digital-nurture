package com.dp.singleton;

public class Logger
{
	private static Logger instance;
	private Logger(){

	}

	public static Logger getInstance() {
		if(instance==null) {
			synchronized(Logger.class) {
				if(instance==null) {
					instance=new Logger();
				}
			}
		}
		return instance;
	}

	public void log(String msg) {
		System.out.println("Log: "+msg);
	}

}

