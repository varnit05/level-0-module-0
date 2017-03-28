package org.jointheleague.level_0.robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot Bob = new Robot("vic");
		Bob.setSpeed(10);
		// Bob.penDown();
		Bob.turn(130);
		Bob.move(300);
		Bob.turn(-80);
		Bob.move(300);
		Robot Jeff = new Robot("vic");
		Jeff.setSpeed(10);

		// 3. Put the robot's pen down
		Jeff.penDown();
		// 6. Make the robot move as fast as possible
		// 5. Do everything below here 4 times
		for (int i = 0; i < 4; i++) {
			Jeff.move(20);

			// 2. Move your robot 200 pixels
			Jeff.move(450);
			// 4. Turn the robot 90 degrees to the right (90 degrees)
			Jeff.turn(90);
			for (int i = 0; i < 4; i++) {
			}

		}
		Jeff.move(20);
		// 3. Put the robot's pen down
		Jeff.penDown();
		// 6. Make the robot move as fast as possible
		// 5. Do everything below here 4 times
		for (int i = 0; i < 4; i++) {
			Jeff.move(20);

			// 2. Move your robot 200 pixels
			Jeff.move(450);
			// 4. Turn the robot 90 degrees to the right (90 degrees)
			Jeff.turn(90);
			for (int i = 0; i < 4; i++) {
			}
		}
	}

}
