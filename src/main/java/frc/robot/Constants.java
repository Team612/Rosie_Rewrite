// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    // PCM Ports
    //public static final int PCM_1 = 0;
    public static final int PCM_2 = 1;

    //solenoid drive
    //public static int[] SOLENOID_DRIVE = {0,1};// PCM 2

    // Solenoid port arrays (forward, reverse)
    //public static final int[] SOLENOID_WALL = {5,4};// PCM 2
    public static final int[] SOLENOID_CLIMB = {4,5};// PCM 2
    //public static final int[] SOLENOID_SECOND = {6, 7};
    public static final int SOLENOID_SUPPORT = 6;
    //climb
    /*public static final int[] SOLENOID_ENGAGE_CLIMB = {7,6};// PCM 2
    public static final int[] SOLENOID_TOGGLE_HOOK = {0,1};// PCM 1

    //color piston 
    public static final int[] COLOR_PISTON = {2,3}; //PCM 1

    //intake talon ports
    public static final int TALON_INTAKE = 4;
    public static final int TALON_BELT = 7;
    public static final int TALON_GREEN_WHEEL = 6;
    public static final int SPARK_OUTTAKE = 19; //this is a joke

    //Drive Sparks
     public static int SPARK_FR = 2;
     public static int SPARK_FL = 12;
     public static int SPARK_BR = 3;
     public static int SPARK_BL = 1; */
}
