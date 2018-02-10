package org.usfirst.frc.team6861.robot.commands;

import org.usfirst.frc.team6861.robot.OI;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ToggleMotorDirection extends Command {
	private boolean toggle;
	private OI m_oi;
	
    public ToggleMotorDirection(boolean toggle,OI m_oi) {
    	this.toggle=toggle;
    	this.m_oi=m_oi;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	m_oi.setReverseMotor(toggle);
    }
    
    

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
