package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.subsystems.DriveBaseSubsystem;

import edu.wpi.first.wpilibj.command.Command;

public class CommandBase extends Command {

	DriveBaseSubsystem driveBaseSubsystem = new DriveBaseSubsystem();
	
	public CommandBase() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
