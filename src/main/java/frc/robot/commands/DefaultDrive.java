/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;
import frc.robot.controls.ControlMap;

public class DefaultDrive extends CommandBase {
  /**
   * Creates a new DefaultDrive.
   */
  private boolean toggle_drive = false;
  private Drivetrain m_drivetrain;
  public DefaultDrive(Drivetrain drivetrain) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_drivetrain = drivetrain;
    addRequirements(drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    //System.out.println("This code is running I believe");
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_drivetrain.Tank_Drive(ControlMap.driver.getRawAxis(1),ControlMap.driver.getRawAxis(5),1.0);
      //m_drivetrain.arcadeDrive(ControlMap.driver.getRawAxis(1), -(ControlMap.driver.getRawAxis(0)), ControlMap.driver.getRawAxis(3)); // pull it 
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
