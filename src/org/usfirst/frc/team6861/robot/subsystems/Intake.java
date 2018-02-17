package org.usfirst.frc.team6861.robot.subsystems;

import org.usfirst.frc.team6861.robot.OI;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {
	Spark intakeLeft;
	Spark intakeRight;
	OI oi;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public Intake(OI m_oi) {
		intakeLeft = new Spark(2);
		intakeRight = new Spark(5);
	
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void driveIntake(double speed) {
    	intakeLeft.set(speed);
    	intakeRight.set(-speed);
    }
}

