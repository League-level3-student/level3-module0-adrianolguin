package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].setX((i * 150) + 100);
			robots[i].setY(550);
			robots[i].setAngle(0);
			robots[i].setSpeed(10000000);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random r = new Random();
		while (robots[0].getY() > 0 && robots[1].getY() > 0 && robots[2].getY() > 0 && robots[3].getY() > 0
				&& robots[4].getY() > 0) {
			for (int i = 0; i < robots.length; i++) {
				int randomNum = r.nextInt(50);
				robots[i].move(randomNum);
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		for (int i = 0; i < robots.length; i++) {
			if(robots[i].getY() < 1) {
				System.out.println("Robot Number " + (i + 1) + " is the winner");
			}
		}
		
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}
}
