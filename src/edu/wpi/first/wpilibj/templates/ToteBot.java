/*-------------------------------------------------------------------------------*/
/* Copyright (c) Darth Xero 2015. All Rights Reserved.                           */
/* Open Source Software - may be modified and shared by the Sith Empire. The code*/
/* must be accompanied by the Sith Empire BSD license file in the root directory */
/* of the project.                                                               */
/*-------------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.RobotDrive;

public class ToteBot extends IterativeRobot {

    private RobotDrive drive;
    private Joystick controller1;
    private SpeedController one, two;
    
public void robotInit() {
        JoystickInit();
        SpeedControllerInit();
        RobotDriveInit();
        

    }

    public void JoystickInit(){
        controller1 = new Joystick(1);
       
        
    }
    public void RobotDriveInit(){
        drive = new RobotDrive(one, two);
        drive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
    }
    public void SpeedControllerInit(){
        one = new Victor(1);
        two = new Victor(2);
      
    }
 
    public void autonomousPeriodic() {

    }

    public void teleopPeriodic() {
     drive.arcadeDrive(controller1);
    }
  
    public void testPeriodic() {
    
    }
    
}