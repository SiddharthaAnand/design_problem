import java.util.Scanner;

class LastNAverage {
	double average;
	int size;
	int current;
	double[] array;
	boolean full;

	LastNAverage(int n) {
		average = 0;
		size = n;
		current = 0;
		array = new double[n];
		full = false;
	}

	public void printStore() {
		System.out.println();
		for (int idx = 0; idx < size; idx++) {
			System.out.print(array[idx] + " ");
		}
		System.out.println();
	}
	public double getAverage() {
		return average;
	}

	public void store(double val) {
		
		if (full) {
			average = ((average * size - array[current]) + val) / size;
		}
		else {
			average = ((average * current - array[current]) + val) / (current + 1);
		}
		array[current] = val;
		if ((current + 1) == size) {
			current = (current + 1) % size;
			full = true;
		}
		else {
			current = current + 1;
		}
	}
}

public class AverageController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of N: ");
		int n = sc.nextInt();

		LastNAverage avg = new LastNAverage(n);
		while (true) {
			System.out.print("Enter 1/2/3 for insert/getAverage/printStorage " );
			int val = sc.nextInt();
			switch (val) {
				case 1:
					double inp = sc.nextDouble();
					avg.store(inp);
					break;
				case 2:
					System.out.println("Last N elements average: " + avg.getAverage());
					break;
				case 3:
					avg.printStore();
				default:
					break;
			}
		}
	}


}