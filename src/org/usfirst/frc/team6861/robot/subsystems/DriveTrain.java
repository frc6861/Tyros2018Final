package org.usfirst.frc.team6861.robot.subsystems;


import org.usfirst.frc.team6861.robot.OI;
import org.usfirst.frc.team6861.robot.commands.DriveWithJoyStick;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//test
/**  
 *
 */
public class DriveTrain extends Subsystem {
	

	private  WPI_TalonSRX leftFront1, rightFront1, leftRear1, rightRear1, leftSlaveFront2, rightSlaveFront2, leftSlaveRear2, rightSlaveRear2;
    private  MecanumDrive mecanumDrive;
    private XboxController gamePad;
    private OI m_oi;
	


	public DriveTrain(OI m_oi) {
    	leftFront1 = new WPI_TalonSRX(1);
    	rightFront1 = new WPI_TalonSRX(3);
    	leftRear1 = new WPI_TalonSRX(2);
    	rightRear1 = new WPI_TalonSRX(4);

    	leftSlaveFront2 = new WPI_TalonSRX(5);
    	rightSlaveFront2 = new WPI_TalonSRX(7);
    	leftSlaveRear2 = new WPI_TalonSRX(6);
    	rightSlaveRear2 = new WPI_TalonSRX(8);

    	leftSlaveFront2.set(ControlMode.Follower, 1);
    	rightSlaveFront2.set(ControlMode.Follower, 3);
    	leftSlaveRear2.set(ControlMode.Follower, 2);
    	rightSlaveRear2.set(ControlMode.Follower, 4);
    	mecanumDrive = new MecanumDrive(leftFront1,leftRear1,rightFront1,rightRear1);
    	gamePad=m_oi.getGamePad();
    	this.m_oi=m_oi;
    	
    }
    

    public OI getM_oi() {
		return m_oi;
	}


	public void setM_oi(OI m_oi) {
		this.m_oi = m_oi;
	}


	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveWithJoyStick(this,gamePad));
        
           }
   
    public void setMecanumDriveCommand(double ySpeed, double xSpeed, double zRotation, double gyroAngle){
    	mecanumDrive.driveCartesian(ySpeed, xSpeed, zRotation);
    	
    }
}