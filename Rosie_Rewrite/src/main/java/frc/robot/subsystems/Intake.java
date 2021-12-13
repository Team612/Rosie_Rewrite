// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
  /** Creates a new Intake. */
  
  //intake objects
  private WPI_TalonSRX talon_intake = new WPI_TalonSRX(Constants.talon_intake);
  private DoubleSolenoid solenoid_intake = new DoubleSolenoid(Constants.pcm_2, Constants.intake_forward, Constants.intake_reverse);
  
  //belt objects
  private final WPI_TalonSRX talon_upperbelt = new WPI_TalonSRX(Constants.belt_upper);
  private final WPI_TalonSRX talon_lowerbelt = new WPI_TalonSRX(Constants.belt_lower);
    
  public void extendIntake(){
    solenoid_intake.set(Value.kForward);
  }

  public void retractIntake(){
    solenoid_intake.set(Value.kReverse);
  }

  public void setIntake(double speed){
    talon_intake.set(speed);
  }
  
  public void setBelt(double belt_speed){
    talon_upperbelt.set(belt_speed);
    talon_lowerbelt.set(belt_speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
