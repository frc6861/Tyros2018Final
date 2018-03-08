package org.usfirst.frc.team6861.robot.commands;

import org.usfirst.frc.team6861.robot.OI;
import org.usfirst.frc.team6861.robot.subsystems.Conveyor;
import org.usfirst.frc.team6861.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ConveyorAxis extends Command {
	private DriveTrain driveTrain;
	private OI m_oi;
	private XboxController gamePad;
	private Conveyor conveyor;
    public ConveyorAxis() {
    	this.driveTrain=driveTrain;
    	this.m_oi = m_oi;
        this.gamePad = m_oi.getGamePad();
        this.conveyor=conveyor;
        requires(driveTrain);
        requires(conveyor);
        
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	conveyor.driveConveyor(gamePad.getRawAxis(4));
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
