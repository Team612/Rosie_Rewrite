// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.PistonClass;
public class PistonForward extends CommandBase {
  /** Creates a new PistonForward. */
 private final PistonClass m_piston;
 private int Counter = 0;

  public PistonForward(PistonClass Piston) {
    m_piston = Piston;
    addRequirements(Piston);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
   
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_piston.Piston_Forward();
    

    


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
