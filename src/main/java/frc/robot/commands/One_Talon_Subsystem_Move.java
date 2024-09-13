// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.One_Talon_Subsystem_Constants;
import frc.robot.subsystems.One_Talon_Subsystem;

public class One_Talon_Subsystem_Move extends Command {
  /** Creates a new One_Talon_Subsystem_Move. */
  private One_Talon_Subsystem m_One_Talon_Subsystem;
  private boolean m_IsForward;

  //The isForward boolean wil determine if the motors should move forward
  public One_Talon_Subsystem_Move(boolean isForward) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_One_Talon_Subsystem = One_Talon_Subsystem.getInstance();
    m_IsForward = isForward;
    addRequirements(m_One_Talon_Subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    //enter your speed calculation if needed, otherwise use a constant to define it
    double speed = m_IsForward ? One_Talon_Subsystem_Constants.kTargetSpeed : -One_Talon_Subsystem_Constants.kTargetSpeed;
    m_One_Talon_Subsystem.setSpeed(speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
