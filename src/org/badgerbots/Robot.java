/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.badgerbots;


import edu.wpi.first.wpilibj.*;
import org.badgerbots.lib.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SimpleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends SimpleRobot {
    
    Jaguar rightm;
    Encoder righte;
    Joystick joy;
    PIDController p;
    Timer timer;
    
    public Robot() {
        rightm = new Jaguar(1);
        righte = new Encoder(1, 2);
        timer = new Timer();
        righte.setReverseDirection(false);
        joy = new Joystick (1);
        rightm.setSafetyEnabled(false);
        righte.setDistancePerPulse(.020827728435666666666666666666);
        righte.setPIDSourceParameter(Encoder.PIDSourceParameter.kRate);
        righte.start();
        p = new PIDController(0.1, 0.0, 0.0, righte, rightm);
        p.enable();
    }
    /**
     * This function is called once each time the robot enters autonomous mode.
     */
    public void autonomous() {
        p.setSetpoint(50);
        timer.start();
        System.out.println("Setpoint | \t Error | \t Result |\t motor |\t Encoder");
        while (timer.get()<20)
        {
            System.out.println(righte.getRate());
 
            System.out.println(p.getSetpoint() + " |\t" +  p.getError() + " |\t" +  p.get()  + " |\t  " + righte.get() + "|\t" + righte.getRate());
        }
        System.out.println("reached end of loop");
        p.disable();
        while (isAutonomous())
        {
            Timer.delay(1/1000);
        }
    }

    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() 
    {
      while (isOperatorControl())  
      {
        rightm.set(joy.getX());
        System.out.println(righte.getRate());
      }
    }
    
    /**
     * This function is called once each time the robot enters test mode.
     */
    public void test() {
    
    }
}
