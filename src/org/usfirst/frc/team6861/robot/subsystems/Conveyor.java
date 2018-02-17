package org.usfirst.frc.team6861.robot.subsystems;

import org.usfirst.frc.team6861.robot.OI;
import org.usfirst.frc.team6861.robot.commands.ChangeRampDirection;
import org.usfirst.frc.team6861.robot.commands.ConveyorIntakeForward;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Conveyor extends Subsystem {
	Spark conveyorLeft;
	Spark conveyorRight;
	OI m_oi;
     //Put methods for controlling this subsystem
    // here. Call these from Commands.
	public Conveyor(OI m_oi) {
		conveyorLeft = new Spark(4);
		conveyorRight = new Spark(6);
	
	}

    public void initDefaultCommand() {
    	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void driveConveyor(double speed) {
    	conveyorLeft.set(-speed);
    	conveyorRight.set(speed);
    }
}

