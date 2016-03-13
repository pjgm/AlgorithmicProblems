package WalkingAroundWisely;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] line = reader.readLine().split(" ");
		int numberOfTests = Integer.parseInt(line[0]);
		long[] result = new long[numberOfTests];
		for (int j = numberOfTests; j > 0; j--) {
			line = reader.readLine().split(" ");
			int numRoads = Integer.parseInt(line[0]);
			CityGrid cg = new CityGrid(numRoads);
			line = reader.readLine().split(" ");
			cg.setStartPoint(Integer.parseInt(line[0]), Integer.parseInt(line[1]));
			line = reader.readLine().split(" ");
			cg.setEndPoint(Integer.parseInt(line[0]), Integer.parseInt(line[1]));
			line = reader.readLine().split(" ");
			int blockedRoadsSize = Integer.parseInt(line[0]);
			for (int i = blockedRoadsSize; i > 0; i--) {
				line = reader.readLine().split(" ");
				cg.setWorkPlace(Integer.parseInt(line[0]) - 1, Integer.parseInt(line[1]) - 1, line[2].charAt(0));
			}
			result[j-1] = cg.numberOfPaths();
		}
		for (int i = result.length - 1; i>=0 ; i--)
			System.out.println(result[i]);
	}
}
