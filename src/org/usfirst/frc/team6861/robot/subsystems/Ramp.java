package org.usfirst.frc.team6861.robot.subsystems;

import org.usfirst.frc.team6861.robot.OI;
import org.usfirst.frc.team6861.robot.commands.ChangeRampDirection;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Ramp extends Subsystem {
	private Spark spark;
	private OI oi;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public Ramp(OI m_oi) {
		super();
		spark=new Spark(0);
		this.oi=m_oi;
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    	setDefaultCommand(new ChangeRampDirection(this));
    }
   public void  driveSpark() {
	   if(oi.isReverseMotor())
		   spark.set(-0.5);//up
	   else
		   spark.set(0.25);//down
	
	   
   }
}

