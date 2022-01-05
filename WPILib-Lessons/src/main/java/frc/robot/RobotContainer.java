// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.DefaultDrive;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.RunGreenIndexer;
import frc.robot.commands.ForwardIntake;
import frc.robot.commands.ReverseIntake;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.GreenIndexer;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.RunOuttake;
import frc.robot.commands.StartIntakePiston;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Outtake;
import frc.robot.subsystems.testIntake;
import frc.robot.controls.ControlMap;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);



  private final Drivetrain m_drivetrain = new Drivetrain();
  private final DefaultDrive m_default = new DefaultDrive(m_drivetrain);

  //subsystems
  private final Intake m_intake = new Intake();
  private final testIntake m_test_intake = new testIntake();

  private final GreenIndexer m_green_index = new GreenIndexer();
  private final Outtake m_outtake = new Outtake();

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    configureButtonBindings();
    configureDefaultCommands();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    ControlMap.RUN_INTAKE_PISTON.toggleWhenPressed(new StartIntakePiston(m_intake));
    ControlMap.GREEN_INDEXER.toggleWhenPressed(new RunGreenIndexer(m_green_index));
    ControlMap.RUN_OUTTAKE.toggleWhenPressed(new RunOuttake(m_outtake));
    ControlMap.FORWARD_INTAKE.whileHeld(new ForwardIntake(m_test_intake));
    ControlMap.REVERSE_INTAKE.whileHeld(new ReverseIntake(m_test_intake));

   }

  private void configureDefaultCommands(){
    m_drivetrain.setDefaultCommand(m_default);
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
