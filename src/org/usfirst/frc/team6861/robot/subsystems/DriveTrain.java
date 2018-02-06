package org.usfirst.frc.team6861.robot.subsystems;


import org.usfirst.frc.team6861.robot.OI;
import org.usfirst.frc.team6861.robot.commands.DriveWithJoyStick;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//test
/**
 *
 */
public class DriveTrain extends Subsystem {
	
	private  WPI_TalonSRX leftFront1;
    private  WPI_TalonSRX rightFront1;
    private  WPI_TalonSRX leftRear1;
    private  WPI_TalonSRX rightRear1;
    private  WPI_TalonSRX leftFront2;
    private  WPI_TalonSRX rightFront2;
    private  WPI_TalonSRX leftRear2;
    private  WPI_TalonSRX rightRear2;
    private  MecanumDrive mecanumDrive;
	private Joystick joystick;
    // Put  methods for controlling this subsystem
    // here. Call these from Commands.
    public DriveTrain(OI m_oi) {
    	leftFront1 = new WPI_TalonSRX(1);
    	rightFront1 = new WPI_TalonSRX(3);
    	leftRear1 = new WPI_TalonSRX(2);
    	rightRear1 = new WPI_TalonSRX(4);
    	leftFront2 = new WPI_TalonSRX(1);
    	rightFront2 = new WPI_TalonSRX(3);
    	leftRear2 = new WPI_TalonSRX(2);
    	rightRear2 = new WPI_TalonSRX(4);
    	mecanumDrive = new MecanumDrive(leftFront1,leftRear1,rightFront1,rightRear1);
    	joystick=m_oi.getStick();
    	
    }
    

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveWithJoyStick(this,joystick));
           }
   
    public void setMecanumDriveCommand(double ySpeed, double xSpeed, double zRotation, double gyroAngle){
    	mecanumDrive.driveCartesian(ySpeed, xSpeed, zRotation);
    	SmartDashboard.putNumber("Joystick X value", joystick.getX());
    	SmartDashboard.putNumber("Joystick Y value", joystick.getY());
    	SmartDashboard.putNumber("Joystick Z value", joystick.getZ());
    }
}