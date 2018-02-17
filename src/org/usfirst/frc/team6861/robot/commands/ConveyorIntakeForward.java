package org.usfirst.frc.team6861.robot.commands;

import org.usfirst.frc.team6861.robot.Robot;
import org.usfirst.frc.team6861.robot.subsystems.Conveyor;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ConveyorIntakeForward extends Command {
	private Conveyor conveyor;
	private DigitalInput conveyorSensor;
	
	
    public ConveyorIntakeForward(Conveyor conveyor) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	this.conveyor=conveyor;
    	
    	
    	requires(conveyor);
    	requires(Robot.intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//while (!conveyor.getConveyorSensor().get()) {
    	conveyor.driveConveyor(1);
    	Robot.intake.driveIntake(1);
    	//}
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	conveyor.driveConveyor(0);
    	Robot.intake.driveIntake(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	conveyor.driveConveyor(0);
    	Robot.intake.driveIntake(0);
    }
}
