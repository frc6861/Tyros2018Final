package org.usfirst.frc.team6861.robot.commands;

import org.usfirst.frc.team6861.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ForwardTowardsSwitch extends Command {
	 private DriveTrain driveTrain;
    public ForwardTowardsSwitch() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	this.driveTrain=driveTrain;
        requires(driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	while (driveTrain.getProximitySensor().get() == true) {
			driveTrain.setMecanumDriveCommand(0.47, 0.55, 0, 0);
		}
    }

    // Make this return true when this Command no longer needs to run execute()
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
