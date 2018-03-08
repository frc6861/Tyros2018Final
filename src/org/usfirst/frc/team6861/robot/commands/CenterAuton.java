package org.usfirst.frc.team6861.robot.commands;

import org.usfirst.frc.team6861.robot.OI;
import org.usfirst.frc.team6861.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CenterAuton extends CommandGroup {

    public CenterAuton(double timeout,DriveTrain driveTrain, OI m_oi ) {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	
    	addSequential(new MoveToSwitchAuton(timeout, driveTrain));
    	//addSequential(new ForwardTowardsSwitch(1.5, driveTrain));
    	addSequential(new ForwardTowardsSwitch(2, driveTrain));
    	addSequential(new Dispense(m_oi));
    	//addSequential(new ConveyorIntakeForward(m_oi));
    	
    }
}
