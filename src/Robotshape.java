
import java.awt.Color;
import java.util.ArrayList;

import org.jointheleague.graphical.robot.Robot;

public class Robotshape {
	Robot r;
	ArrayList<Integer> sidespershapes;
	public static String robotImg;

	public Robotshape(String robotImg, ArrayList<Integer> sides) {
		r = new Robot();
		sidespershapes = sides;
		this.robotImg = robotImg;
		r.changeRobot(
				"https://i.kym-cdn.com/entries/icons/original/000/018/489/nick-young-confused-face-300x256-nqlyaa.jpg");

	}

	public static void main(String[] args) {
		ArrayList<Integer> sides = new ArrayList<Integer>();
		sides.add(3);
		sides.add(4);
		Robotshape rob = new Robotshape(robotImg, sides);
		rob.draw();
	}

	void getrobotImg() {

	}

	void setrobotImg(String robotImg) {
		r.changeRobot(
				"https://i.kym-cdn.com/entries/icons/original/000/018/489/nick-young-confused-face-300x256-nqlyaa.jpg");

	}

	void draw() {
		for (int i = 0; i < sidespershapes.size(); i++) {
			int num = sidespershapes.get(i);
			for (int j = 0; j < num; j++) {
				r.setPenColor(Color.BLUE);
				r.penDown();
				r.move(100);
				r.turn(360 / num);
			}
		}

	}
}