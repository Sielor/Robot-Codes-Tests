// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.One_Talon_Subsystem;

public class One_Talon_Subsystem_Move extends Command {
  /** Creates a new One_Talon_Subsystem_Move. */
  private One_Talon_Subsystem m_One_Talon_Subsystem;
  public One_Talon_Subsystem_Move(One_Talon_Subsystem one_Talon_Subsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_One_Talon_Subsystem = one_Talon_Subsystem;
    addRequirements(m_One_Talon_Subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    //enter your speed calculation if needed
    double speed = 0.5;
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
