// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj.motorcontrol.*;
/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends TimedRobot {
 PWMVictorSPX left_m1 = new PWMVictorSPX(0);
 PWMVictorSPX left_m2 = new PWMVictorSPX(1);
 PWMVictorSPX right_m1 = new PWMVictorSPX(2);
 PWMVictorSPX right_m2 = new PWMVictorSPX(3);
 MotorController left_side = new MotorController(right_m1, right_m2);
 MotorController right_side = new MotorController (right_m1, right_m2);

 PWMVictorSPX arm_m = new PWMVictorSPX(4);

 MotorController m_myRobot;
 Joystick m_leftstick;
 Joystick m_rightstick;

JoystickButton gameButton1;
JoystickButton gameButton2;
JoystickButton gameButton3;
JoystickButton gameButton4;
JoystickButton gameButton5;
JoystickButton gameButton6;
JoystickButton gameButton7;
JoystickButton gameButton8;
JoystickButton gameButton9;
JoystickButton gameButton10;
JoystickButton gameButton12;

@Override
public void robotInit() {
  m_myRobot = new MotorController((left_side));
  m_myRobot = new MotorController((right_side));
  m_leftstick = new Joystick(0);
  m_rightstick = new Joystick(1);

  gameButton1 = new JoystickButton(m_leftstick, 1);
  gameButton2 = new JoystickButton(m_leftstick, 2);
  gameButton3 = new JoystickButton(m_leftstick, 3);
  gameButton4 = new JoystickButton(m_leftstick, 4);
  gameButton5 = new JoystickButton(m_leftstick, 5);
  gameButton6 = new JoystickButton(m_leftstick, 6);
  gameButton7 = new JoystickButton(m_leftstick, 7);
  gameButton8 = new JoystickButton(m_leftstick, 8);
  gameButton9 = new JoystickButton(m_leftstick, 9);
  gameButton10 = new JoystickButton(m_leftstick, 10);
  gameButton12 = new JoystickButton(m_leftstick, 12);

}

  @Override
  public void teleopPeriodic() {
  m_myRobot.tankDrive(m_leftstick.getY(),m_rightstick.getY());

  if (gameButton1.getAsBoolean()) {
    arm_m.set(0.3);
} else if (gameButton2.getAsBoolean()) {
    arm_m.set(-0.3);
} else {
    arm_m.set(0);







 }
  }
}
