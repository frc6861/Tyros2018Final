package org.usfirst.frc.team6861.robot.commands;

import org.usfirst.frc.team6861.robot.OI;
import org.usfirst.frc.team6861.robot.subsystems.Conveyor;
import org.usfirst.frc.team6861.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Dispense extends Command {
	private Shooter shooter;
	private Conveyor conveyor;
	private OI m_oi;
    public Dispense(OI m_oi) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	this.shooter=m_oi.getShooter();
    	this.m_oi = m_oi;
    	this.conveyor=m_oi.getConveyor();
    	requires(shooter);
    	requires(conveyor);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	conveyor.driveConveyor(1);
    	shooter.driveShooter(0.35);
    	
    } 

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	conveyor.driveConveyor(0);
    	shooter.driveShooter(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	shooter.driveShooter(0);
    	conveyor.driveConveyor(0);
    }
}
