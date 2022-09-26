// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Pneumatics;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Pneumatics;

public class EnableCompressor extends CommandBase {
  /** Creates a new EnableCompressor. */
  Pneumatics pneumatics = Pneumatics.getInstance();
  public EnableCompressor() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(pneumatics);

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    pneumatics.enableCompressor(true);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
