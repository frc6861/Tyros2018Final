package org.usfirst.frc.team6861.robot.commands;

import org.usfirst.frc.team6861.robot.OI;
import org.usfirst.frc.team6861.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class ForwardTowardsSwitch extends Command {
	private DriveTrain driveTrain;
	private boolean twoProx;
	private OI m_oi;
	private DigitalInput rightSensor;
	private DigitalInput leftSensor;
    public ForwardTowardsSwitch( DriveTrain driveTrain, OI m_oi) {
    	 //super (timeout);
    	this.driveTrain=driveTrain;
    	 requires(driveTrain);
    	 rightSensor = m_oi.getRightSensor();
     	leftSensor = m_oi.getLeftSensor();
     	twoProx = false;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	twoProx = false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
			driveTrain.setMecanumDriveCommand(0, -0.3, 0, 0);
			if (!rightSensor.get() && !leftSensor.get()){
				twoProx = true;
				}
			}

    // Make this return true when this Command no longer needs to run execute()
    //protected boolean isFinished() {
    	//return (driveTrain.getProximitySensor().get());
    	//return false;
    	//}
    protected boolean isFinished() {
		return twoProx;
		
	}
    

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }

	
	
}
