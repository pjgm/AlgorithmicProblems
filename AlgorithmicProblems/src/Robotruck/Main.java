package Robotruck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int maximumCapacity = Integer.parseInt(reader.readLine());
		int numberOfPackages = Integer.parseInt(reader.readLine());
		Factory factory = new Factory(maximumCapacity, numberOfPackages);
		for (int i = 0; i < numberOfPackages; i++) {
			String[] packages = reader.readLine().split(" ");
			int destX = Integer.parseInt(packages[0]);
			int destY = Integer.parseInt(packages[1]);
			int weight = Integer.parseInt(packages[2]);
			factory.addPackage(i, destX, destY, weight);
		}
		System.out.println();
	}
}
