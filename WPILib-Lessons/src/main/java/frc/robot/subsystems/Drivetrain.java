/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
  /**
   * Creates a new Drivetrain.
   */
  private CANSparkMax spark_fl = new CANSparkMax(Constants.SPARK_FL, MotorType.kBrushless); 
  private CANSparkMax spark_fr = new CANSparkMax(Constants.SPARK_FR, MotorType.kBrushless);
  private CANSparkMax spark_bl = new CANSparkMax(Constants.SPARK_BL, MotorType.kBrushless);
  private CANSparkMax spark_br = new CANSparkMax(Constants.SPARK_BR, MotorType.kBrushless);
  

  private double DEADZONE = 0.1;

  public void Tank_Drive(double left_command, double right_command, double DAMPENER) {
    right_command = Math.abs(right_command) < DEADZONE ? 0.0 : right_command;
    left_command = Math.abs(left_command) < DEADZONE ? 0.0 : left_command;

    DAMPENER = (DAMPENER + 1)/2;

    right_command *= DAMPENER;
    left_command *= DAMPENER;
    
    spark_fl.set(left_command);
    spark_bl.set(left_command);

    spark_fr.set(-right_command);
    spark_br.set(-right_command);
  }
  public void arcadeDrive(double x_axis, double y_axis, double DAMPENER) {  
    //sets up deadzones
    x_axis = Math.abs(x_axis) < DEADZONE ? 0.0 : x_axis;
    y_axis = Math.abs(y_axis) < DEADZONE ? 0.0 : y_axis;
    
    DAMPENER = (DAMPENER + 1)/2;

    double leftCommand = (y_axis + x_axis) * DAMPENER;
    double rightCommand = (y_axis - x_axis) * DAMPENER;
    /*
    joystick up
    leftcommand = 1 + 0 = 1
    rightcommand = 1 - 0 = 1

    joystick down
    leftcommand = -1 + 0 = -1
    rightcommand = -1 - 0 = -1

    joystick left
    leftcommand = 0 + -1 = -1
    rightcommand = 0 - - 1 = 1

    joystick right
    leftcommand = 0 + 1 = 1
    rightcommand = 0 - 1 = -1

    */
    // right side motor controls
    spark_fr.set(rightCommand);
    spark_br.set(rightCommand);

    //left side motor controls
    spark_fl.set(leftCommand);
    spark_bl.set(leftCommand);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    //ultrasonic.setAutomaticMode(true);
    
  }
}
