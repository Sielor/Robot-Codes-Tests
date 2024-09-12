// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.PneumaticSubsystemConstants;

public class PneumaticSubsystem extends SubsystemBase {
  //The subsystem uses a single double solenoid to control the pneumatic system
  private static DoubleSolenoid m_DoubleSolenoid;
  //Singleton instance
  private static PneumaticSubsystem instance;

  /** Creates a new PneumaticSubsystem. */
  private PneumaticSubsystem() {
    m_DoubleSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, PneumaticSubsystemConstants.kForwardPortChannel, PneumaticSubsystemConstants.kReversePortChannel);
    m_DoubleSolenoid.set(Value.kForward);
  }

  //Singleton Implementation
  public static PneumaticSubsystem getInstance(){
    if (instance == null)
      instance = new PneumaticSubsystem();
    return instance;
  }

  //The method will return the state of the pneumatic subsystem
  //if the value is forward then it will return true, otherwise false
  public static boolean getState(){
    if (m_DoubleSolenoid.get() == Value.kForward)
      return true;
    return false;
  }

  //The method will toggle the value of the solenoid
  //for example: if the value is kForward it will change to kReverse
  public void changeState(){
    m_DoubleSolenoid.toggle();
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
