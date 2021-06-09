package com.bees.utilities;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotUtility 
{
	public static void downKey() throws Exception
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	}
	
	public static void upKey() throws Exception
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_UP);
	}
}
