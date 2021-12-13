// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.GreenIndexer;

public class RunGreenIndexer extends CommandBase {
  /** Creates a new RunGreenIndexer. */
  private final GreenIndexer m_forward_index;
  private final double speed = 0.25; //capping speed because we don't want motor to burn out (sorry anshuman lol)

  public RunGreenIndexer(GreenIndexer forward_index) {
    m_forward_index = forward_index;
    addRequirements(forward_index);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_forward_index.setIndex(speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_forward_index.setIndex(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
