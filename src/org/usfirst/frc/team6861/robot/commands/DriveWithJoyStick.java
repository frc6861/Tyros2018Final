package org.usfirst.frc.team6861.robot.commands;

import org.usfirst.frc.team6861.robot.Robot;
import org.usfirst.frc.team6861.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMSpeedController;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveWithJoyStick extends Command {
	private DriveTrain driveTrain;
	private Joystick stick;
    public DriveWithJoyStick(DriveTrain driveTrain,Joystick stick) {
    this.driveTrain=driveTrain;
    this.stick=stick;
    requires(driveTrain);
    //Spark spark1 = new Spark(0);
    
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	driveTrain.setMecanumDriveCommand(stick.getX(), -stick.getY(), 0.75 * stick.getZ(), 0);
    }

    //  Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}