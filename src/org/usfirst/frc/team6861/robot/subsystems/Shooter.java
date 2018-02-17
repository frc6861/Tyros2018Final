package org.usfirst.frc.team6861.robot.subsystems;

import org.usfirst.frc.team6861.robot.OI;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
	private Spark shooterLeft;
	private Spark shooterRight;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public Shooter() {
		shooterLeft = new Spark(1);
		shooterRight = new Spark(3);
	
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void driveShooter(double speed) {
    	shooterLeft.set(-speed);
    	shooterRight.set(speed);
    	
    } 
}

