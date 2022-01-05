// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Outtake extends SubsystemBase {
  /** Creates a new Outtake. */
  private final WPI_TalonSRX belt = new WPI_TalonSRX(Constants.TALON_BELT);
  private final CANSparkMax outtake = new CANSparkMax(Constants.SPARK_OUTTAKE, MotorType.kBrushless);
  private final double temp = 1.0;
  public void startOuttake(double speed){
    belt.set(speed * temp);
    outtake.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
