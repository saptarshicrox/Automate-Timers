package com.Automate.automationTimer.utility;

import java.util.Timer;
import java.util.TimerTask;

public class StopWatch {
	
	static int interval;
	static Timer timer;
	public static String countdown(String seconds) {
	   
	    int delay = 1000;
	    int period = 1000;
	    timer = new Timer();
	    interval = Integer.parseInt(seconds);
	    System.out.println(seconds);
	    timer.scheduleAtFixedRate(new TimerTask() {

	        public void run() {
	            System.out.println(setInterval());

	        }
	    }, delay, period);
		return seconds;
	}

	private static final int setInterval() {
	    if (interval == 1)
	        timer.cancel();
	    return --interval;
	}

}
