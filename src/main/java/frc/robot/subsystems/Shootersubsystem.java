// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ShooterConstants;

public class Shootersubsystem extends SubsystemBase {
  PWMSparkMax ShooterMotor = new PWMSparkMax(ShooterConstants.ShooterMotoroutput);
  /** Creates a new Shootersubsystem. */
  public Shootersubsystem() {}

  public void runShooter(double m_speed){
    ShooterMotor.set(m_speed);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
