// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot.subsystems;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/** Add your docs here. */
public class PistonClass extends SubsystemBase {

   private DoubleSolenoid piston_intake = new DoubleSolenoid(Constants.pcm_2, Constants.forward, Constants.backward);

   public void Piston_Forward(){
    piston_intake.set(Value.kForward);
   }
  
   public void Piston_Backward(){
       piston_intake.set(Value.kReverse);
   }
    }

