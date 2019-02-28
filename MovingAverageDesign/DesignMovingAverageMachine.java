/* Design Problem: Design a class to calculate moving average of last N numbers in a stream of 
 * real numbers.
 */

import java.util.Scanner;

class MovingAverage {
	private double mAverage;
	private int seen;
	MovingAverage() {
		mAverage = 0;
		seen = 0;
	}

	public double getMovingAverage() {
		return mAverage;
	}

	public void updateMovingAverage(double input) {
		mAverage = ( mAverage * seen + input) / (seen + 1);
		seen += 1;
	}

	public int totalSeen() {
		return seen;
	}
}

public class DesignMovingAverageMachine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MovingAverage machine = new MovingAverage();

		// Continuous stream of inputs
		while (true) {
			Double input = sc.nextDouble();
			machine.updateMovingAverage(input);
			System.out.println("Current average: " + machine.getMovingAverage());
		}
	}
}