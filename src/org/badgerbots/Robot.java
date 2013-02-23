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
    
    PWM a,b,c,d,e,f,g,h,i,j,k,l,m,n;
    Jaguar rightm;
    Jaguar leftm;
    Jaguar w,x,y,z;
    
    void Robot() {
        a = new PWM(1);
        b = new PWM(2);
        c = new PWM(3);
        d = new PWM(4);
        e = new PWM(5);
        f = new PWM(6);
        g = new PWM(7);
        h = new PWM(8);
        i = new PWM(9);
        j = new PWM(10);
        k = new PWM(11);
        l = new PWM(12);
        m = new PWM(13);
        n = new PWM(14);
        rightm = new Jaguar(1);
        leftm = new Jaguar(2);
        w = new Jaguar(3);
        x = new Jaguar(4);
        y = new Jaguar(5);
        z = new Jaguar(6);
    }
    /**
     * This function is called once each time the robot enters autonomous mode.
     */
    public void autonomous() {
        System.out.println("here");
        a.setRaw(17);
        b.setRaw(34);
        c.setRaw(51);
        d.setRaw(68);
        e.setRaw(85);
        f.setRaw(102);
        g.setRaw(119);
        h.setRaw(136);
        i.setRaw(153);
        j.setRaw(170);
        k.setRaw(187);
        l.setRaw(204);
        m.setRaw(221);
        n.setRaw(238);
        while(true) {
            rightm.set(1);
            leftm.set(1);
        }
    }

    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() {
        a.setRaw(17);
        b.setRaw(34);
        c.setRaw(51);
        d.setRaw(68);
        e.setRaw(85);
        f.setRaw(102);
        g.setRaw(119);
        h.setRaw(136);
        i.setRaw(153);
        j.setRaw(170);
        k.setRaw(187);
        l.setRaw(204);
        m.setRaw(221);
        n.setRaw(238);
        while(true) {
            rightm.set(1);
            leftm.set(1);
            w.set(1);
            x.set(1);
            y.set(1);
            z.set(1);
            System.out.println("here");
        }
    }
    
    /**
     * This function is called once each time the robot enters test mode.
     */
    public void test() {
    
    }
}
