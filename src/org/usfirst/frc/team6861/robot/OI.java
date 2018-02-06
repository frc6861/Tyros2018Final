/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
	
package org.usfirst.frc.team6861.robot;

//import org.usfirst.frc.team6861.robot.commands.ToggleMotorDirection;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private  Joystick stick;
	private CameraServer camera;
	private AnalogInput ai0;
	private AnalogInput ai1;
	private AnalogInput ai2;
	private AnalogInput ai3;
	private JoystickButton button7;
	private JoystickButton button9;
	public static boolean reverseMotor=false;
	// private PWMSpeedController spark1;
	
	
	//public PWMSpeedController getSpark1() {
	//	return spark1;
	//}

	//public void setSpark1(PWMSpeedController spark1) {
	//	this.spark1 = spark1;
	//}

	public JoystickButton getButton1() {
		return button7;
	}

	public void setButton1(JoystickButton button1) {
		this.button7 = button1;
	}

	public OI() {
		 stick = new Joystick(0);
		 button7=new JoystickButton(stick,7);
		 button9=new JoystickButton(stick,9);
		 //button7.whenPressed(new ToggleMotorDirection(reverseMotor));
		 //button9.whenPressed(new ToggleMotorDirection(reverseMotor));
		 CameraServer.getInstance().startAutomaticCapture();
	}

	public AnalogInput getAi1() {
		return ai1;
	}

	public boolean isReverseMotor() {
		return reverseMotor;
	}

	public void setReverseMotor(boolean reverseMotor) {
		this.reverseMotor = reverseMotor;
	}

	public void setAi1(AnalogInput ai1) {
		this.ai1 = ai1;
	}

	public AnalogInput getAi2() {
		return ai2;
	}

	public void setAi2(AnalogInput ai2) {
		this.ai2 = ai2;
	}

	public AnalogInput getAi3() {
		return ai3;
	}

	public void setAi3(AnalogInput ai3) {
		this.ai3 = ai3;
	}

	public Joystick getStick() {
		return stick;
	}

	public void setStick(Joystick stick) {
		this.stick = stick;
	}

	public CameraServer getCamera() {
		return camera;
	}

	public void setCamera(CameraServer camera) {
		this.camera = camera;
	}

	public AnalogInput getAi0() {
		return ai0;
	}

	public void setAi(AnalogInput ai0) {
		this.ai0 = ai0;
	}
	
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);
	
	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
