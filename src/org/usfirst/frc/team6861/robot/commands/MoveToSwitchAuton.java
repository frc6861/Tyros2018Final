package org.usfirst.frc.team6861.robot.commands;

import org.usfirst.frc.team6861.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class MoveToSwitchAuton extends TimedCommand {

    private DriveTrain driveTrain;

	public MoveToSwitchAuton(double timeout,DriveTrain driveTrain) {
        super(timeout);
        // Use requires() here to declare subsystem dependencies
        this.driveTrain=driveTrain;
        requires(driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//driveTrain.setMecanumDriveCommand(1, 1, 1, 0);
    	String gameData;
    	gameData = DriverStation.getInstance().getGameSpecificMessage();
    	if(gameData==null)
    		gameData="LLL";
    	if (gameData.charAt(0) == 'R')
    	{
    		while (driveTrain.proximitySensor.get() == true) {
    			driveTrain.setMecanumDriveCommand(-0.23, -0.3, 0, 0);
    			}
    		 }
    	else {
    		while (driveTrain.proximitySensor.get() == true) {
    			driveTrain.setMecanumDriveCommand(0.2, -0.3, 0, 0);
    		}
    	}
    	//need to work
    }

    // Called once after timeout
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
