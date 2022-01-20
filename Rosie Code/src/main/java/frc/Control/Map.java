// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.Control;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class Map {

  public static Joystick driver = new Joystick(0);

 public static JoystickButton driver_button_A = new JoystickButton(driver, 1);

}
