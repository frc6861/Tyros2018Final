/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
	
package org.usfirst.frc.team6861.robot;

import org.usfirst.frc.team6861.robot.commands.ConveyorIntakeBackward;
import org.usfirst.frc.team6861.robot.commands.ConveyorIntakeForward;
import org.usfirst.frc.team6861.robot.commands.Shoot;
import org.usfirst.frc.team6861.robot.commands.ToggleMotorDirection;
import org.usfirst.frc.team6861.robot.subsystems.Conveyor;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 *     This class  is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private  XboxController gamePad;
	private JoystickButton buttonY,buttonX,buttonA,buttonB,buttonLB,buttonBack,buttonRB,buttonStart,buttonClickLeft,buttonClickRight;
	private boolean reverseMotor=false;
	private DigitalInput proximitySensor;
	private CameraServer camera;
	private Conveyor conveyor;
	

	public DigitalInput getProximitySensor() {
		return proximitySensor;
	}


	public void setProximitySensor(DigitalInput proximitySensor) {
		this.proximitySensor = proximitySensor;
	}


	public OI() {
		 gamePad = new XboxController(0);
		 buttonA = new JoystickButton(gamePad,1);//shoots
		 buttonB = new JoystickButton(gamePad,2);//no current function
		 buttonX=new JoystickButton(gamePad,3);//this button decreases ramp angle
		 buttonY=new JoystickButton(gamePad,4);//this button increases ramp angle
		 buttonLB = new JoystickButton(gamePad,5);//conveyer belt down and expel cube
		 buttonRB = new JoystickButton(gamePad,6);//conveyer belt up and intake cube
		 buttonBack = new JoystickButton(gamePad,7);//Retract Climb
		 buttonStart = new JoystickButton(gamePad,8);//extend climb	 buttonClickLeft = new JoystickButton(gamePad,9);
		 buttonClickRight = new JoystickButton(gamePad,10);
		 
		 buttonY.whenPressed(new ToggleMotorDirection(reverseMotor,this));
		 buttonX.whenPressed(new ToggleMotorDirection(!reverseMotor,this));
		 proximitySensor = new DigitalInput(0);
		 CameraServer.getInstance().startAutomaticCapture();
		 conveyor=new Conveyor();
		 
	}
	
	public void Init() {
		 buttonRB.whileHeld(new ConveyorIntakeForward(conveyor));
		 buttonLB.whileHeld(new ConveyorIntakeBackward(conveyor));
		 buttonA.whileHeld(new Shoot(this));
		 buttonB.whileHeld(new Shoot(this));
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


	public CameraServer getCamera() {
		return camera;
	}


	public void setCamera(CameraServer camera) {
		this.camera = camera;
	}

	
}
