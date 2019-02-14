/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2412.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
 
 
public class RobotMap {
	public static int[] motorIDs = new int[] {
			//layout
			/*    front    */
			/* left  right */
			    2,     0,
			    3,     1, 
			/*     back    */
	};
	private static MotorType brushless; 
	//fix motors
	
	public static CANSparkMax[] talons = new CANSparkMax[]{
			new CANSparkMax(motorIDs[0], brushless),
			new CANSparkMax(motorIDs[1], brushless),
			new CANSparkMax(motorIDs[2], brushless),
			new CANSparkMax(motorIDs[3], brushless)
			
	};
	
	public static SpeedControllerGroup leftSide = new SpeedControllerGroup(talons[2], talons[3]);
	public static SpeedControllerGroup rightSide = new SpeedControllerGroup(talons[0], talons[1]);
	
	public static DifferentialDrive drive = new DifferentialDrive(leftSide, rightSide);
	public static Joystick stick = new Joystick(0);
}
