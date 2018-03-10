package org.usfirst.frc.team6861.robot.commands;

import org.usfirst.frc.team6861.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class ForwardTowardsSwitch extends TimedCommand {
	private DriveTrain driveTrain;
    public ForwardTowardsSwitch(double timeout, DriveTrain driveTrain) {
    	 super (timeout);
    	this.driveTrain=driveTrain;
    	 requires(driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
			driveTrain.setMecanumDriveCommand(0, -0.3, 0, 0);
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	//return isTimedOut();
    	boolean flag=(!driveTrain.getM_oi().getLeftProximitySensor().get() && !driveTrain.getM_oi().getRightProximitySensor().get());
    	if(!flag)
    			System.out.println("*******************************************"+flag);
    	return flag;
    }
    

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
