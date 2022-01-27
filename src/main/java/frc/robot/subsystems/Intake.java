// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import frc.robot.Constants;


public class Intake extends SubsystemBase {
    /** Creates a new ExampleSubsystem. */
    //intake and wall solenoids
    private final DoubleSolenoid solenoid_climb = new DoubleSolenoid(Constants.PCM_2, Constants.SOLENOID_INTAKE[0], Constants.SOLENOID_INTAKE[1]);
    private final DoubleSolenoid solenoid_second = new DoubleSolenoid(Constants.PCM_2, Constands.SOLENOID_SECOND[0], Constands.SOLENOID_SECOND[1]);
    //solenoid climb 
    //private final DoubleSolenoid solenoid_engage_climb = new DoubleSolenoid(Constants.PCM_2, Constants.SOLENOID_ENGAGE_CLIMB[0], Constants.SOLENOID_ENGAGE_CLIMB[1]);
    //private final DoubleSolenoid solenoid_toggle_hook = new DoubleSolenoid(Constants.PCM_1, Constants.SOLENOID_TOGGLE_HOOK[0], Constants.SOLENOID_TOGGLE_HOOK[1]);

    //Solenoid drive
    //private final DoubleSolenoid solenoid_drive = new DoubleSolenoid(Constants.PCM_2, Constants.SOLENOID_DRIVE[0], Constants.SOLENOID_DRIVE[1]);

    //Solenoid Color Piston stuff
    //private final DoubleSolenoid solenoid_color = new DoubleSolenoid(Constants.PCM_1, Constants.COLOR_PISTON[0], Constants.COLOR_PISTON[1]);

    public void forwardClimb(){
        solenoid_climb.set(Value.kForward);
        /*solenoid_engage_climb.set(Value.kReverse);
        solenoid_toggle_hook.set(Value.kReverse);
        solenoid_drive.set(Value.kReverse);
        solenoid_color.set(Value.kReverse);*/
    }

    public void reverseClimb(){
        solenoid_climb.set(Value.kReverse);
        /*solenoid_engage_climb.set(Value.kReverse);
        solenoid_toggle_hook.set(Value.kReverse);
        solenoid_drive.set(Value.kReverse);
        solenoid_color.set(Value.kReverse);*/
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
