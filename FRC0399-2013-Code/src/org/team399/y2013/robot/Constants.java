/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team399.y2013.robot;

/**
 *
 * @author Jeremy
 */
public class Constants {
    
    public static final int DRIVER_USB = 1;
    public static final int OPERATOR_USB = 2;
    
    //Motor Controller ports
    public static final int DRIVE_LEFT_A  = 0;
    public static final int DRIVE_LEFT_B  = 0;
    public static final int DRIVE_RIGHT_A = 0;
    public static final int DRIVE_RIGHT_B = 0;
    
    public static final int FEEDER_MOTOR = 0;
    public static final int KICKER_PORT  = 0;
    
    public static final int INTAKE_MOTOR  = 0;
    public static final int INTAKE_SENSOR = 0;
    
    public static final int SHOOTER_A_ID = 2;
    public static final int SHOOTER_B_ID = 3;
    public static final int SHOOTER_C_ID = 4;
    public static final byte SHOOTER_SYNC_GROUP = 2;
    
    public static final double SHOOTER_KT = 1.0;
    public static final double SHOOTER_KO = 1.0;
    
    public static final double SHOOTER_KV         = 1608.0;
    public static final double SHOOTER_GEAR_RATIO = 0.44642857142;
    
    public static final int ARM_ID = 5;
    
    public static final double ARM_P = 0.0;
    public static final double ARM_I = 0.0;
    public static final double ARM_D = 0.0;
    public static final double ARM_LOWER_LIM = 0.0;
    public static final double ARM_UPPER_LIM = 0.0;
    
    public static double STOW_UP     = 0.0;
    public static double INTAKE_LOAD = 0.0;
    public static double HUMAN_LOAD  = 0.0;
    public static double HIGH_SHOT   = 0.0;
    public static double MID_SHOT    = 0.0;
    public static double LOW_SHOT    = 0.0;
    public static double STOW_DOWN   = 0.0;
    
    
    
    public static final double ARM_MANUAL_INPUT_SCALAR = .005;
    
}