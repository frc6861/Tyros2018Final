package org.usfirst.frc.team6861.robot.commands;

import org.usfirst.frc.team6861.robot.OI;
import org.usfirst.frc.team6861.robot.subsystems.Conveyor;
import org.usfirst.frc.team6861.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ConveyorIntakeForward extends Command {
	private Conveyor conveyor;
	private DigitalInput conveyorSensor;
	private Intake intake;
	
	
    public ConveyorIntakeForward(OI m_oi) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	this.conveyor=m_oi.getConveyor();
    	this.intake=m_oi.getIntake();
    	this.conveyorSensor = m_oi.getConveyorSensor();
    	requires(conveyor);
    	requires(intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (conveyorSensor.get()) {
    			conveyor.driveConveyor(0.5);
    			intake.driveIntake(0.8);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	conveyor.driveConveyor(0);
    	intake.driveIntake(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	conveyor.driveConveyor(0);
    	intake.driveIntake(0);
    }
}
