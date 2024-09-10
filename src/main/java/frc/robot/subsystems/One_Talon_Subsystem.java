// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.One_Talon_Subsystem_Constants;

public class One_Talon_Subsystem extends SubsystemBase {
  /** Creates a new One_Talon_Subsystem. */
  private Talon m_motor;
  //Singleton instance
  private static One_Talon_Subsystem instance;

  private One_Talon_Subsystem() {
    m_motor = new Talon(One_Talon_Subsystem_Constants.kMotorPort);
  }

  //Singletom Implementation
  public static One_Talon_Subsystem getInstance() {
    if (instance == null)
      instance = new One_Talon_Subsystem();
    return instance;
  }

  public void setSpeed(double speed){
    //incase a constraint is needed:
    speed = speed > One_Talon_Subsystem_Constants.kHighConstraint ? One_Talon_Subsystem_Constants.kHighConstraint : speed;
    speed = speed < One_Talon_Subsystem_Constants.kLowConstraint ? One_Talon_Subsystem_Constants.kLowConstraint : speed;
    m_motor.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
