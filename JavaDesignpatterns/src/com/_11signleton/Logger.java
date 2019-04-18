package com._11signleton;

public class Logger {//when ever an obj is created by default the constructor is called 
   //although we are not able to see in our eys but has a constructor here bellow
	
	private static Logger logger;
	
	private Logger() {//this the constructor which the same name as class name.by default each class has a no argumts constructor
		    
		//but when ever we create obj of it will execute this particular method and creat the obj of logger
	    //So with out a constructor we cant create obj of a class , if you make it private it will not be accessed by obj.
		
	}
	public static Logger getInstance() {//we have a get instance method to check if it is null, then it creates an obj of logger assign it to it.
		 
		if(logger == null) {
			logger = new Logger();
		}
		return logger;
	}
}
