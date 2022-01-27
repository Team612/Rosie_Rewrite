// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Climb extends SubsystemBase {
  /** Creates a new Climb. */
  //climb solenoids
  private final DoubleSolenoid solenoid_climb = new DoubleSolenoid(Constants.PCM_2, Constants.SOLENOID_CLIMB[0], Constants.SOLENOID_CLIMB[1]);
  private final DoubleSolenoid solenoid_second = new DoubleSolenoid(Constants.PCM_2, Constants.SOLENOID_SECOND[0], Constants.SOLENOID_SECOND[1]);
    
  public void forwardClimb(){
      solenoid_climb.set(Value.kForward);
  }

  public void reverseClimb(){
      solenoid_climb.set(Value.kReverse);
  }
  public void forwardSupport(){
      solenoid_second.set(Value.kForward);
  }
  public void reverseSupport(){
      solenoid_second.set(Value.kReverse);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
