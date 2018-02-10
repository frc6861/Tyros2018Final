/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
	
package org.usfirst.frc.team6861.robot;

import org.usfirst.frc.team6861.robot.commands.ToggleMotorDirection;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private  XboxController gamePad;
	private JoystickButton button7;
	private JoystickButton button9;
	private boolean reverseMotor=false;
	private DigitalInput proximitySensor;
	private CameraServer camera;
	

	public DigitalInput getProximitySensor() {
		return proximitySensor;
	}


	public void setProximitySensor(DigitalInput proximitySensor) {
		this.proximitySensor = proximitySensor;
	}


	public OI() {
		 gamePad = new XboxController(0);
		 //button7=new JoystickButton(stick,7);
		// button9=new JoystickButton(stick,9);
		// button7.whenPressed(new ToggleMotorDirection(reverseMotor,this));
		 //button9.whenPressed(new ToggleMotorDirection(!reverseMotor,this));
		 proximitySensor = new DigitalInput(0);
		 CameraServer.getInstance().startAutomaticCapture();
	}

	
	public XboxController getGamePad() {
		return gamePad;
	}


	public void setGamePad(XboxController gamePad) {
		this.gamePad = gamePad;
	}


	public boolean isReverseMotor() {
		return reverseMotor;
	}

	public void setReverseMotor(boolean reverseMotor) {
		this.reverseMotor = reverseMotor;
	}

	//public Joystick getStick() {
	//	return stick;
	//}

	//public void setStick(Joystick stick) {
	//	this.stick = stick;
	//}


	public CameraServer getCamera() {
		return camera;
	}


	public void setCamera(CameraServer camera) {
		this.camera = camera;
	}

	
}
