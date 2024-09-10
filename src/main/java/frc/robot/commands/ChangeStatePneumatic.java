// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.PneumaticSubsystem;

public class ChangeStatePneumatic extends Command {

  PneumaticSubsystem m_PneumaticSubsystem;

  /** Creates a new ChangeStatePneumatic. */
  public ChangeStatePneumatic(PneumaticSubsystem pneumaticSubsystem) {
    m_PneumaticSubsystem = pneumaticSubsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_PneumaticSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_PneumaticSubsystem.changeState();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
