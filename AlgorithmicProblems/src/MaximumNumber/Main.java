package MaximumNumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main (String[] args) throws java.lang.Exception {
		
		String line;
		int max = Integer.MIN_VALUE;
 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		int numberOfChildren = Integer.parseInt(reader.readLine());
		while (numberOfChildren-- != 0 && (line = reader.readLine()) != null) {
			String [] sticks = line.split(" ");
			for(int i = 1; i <= Integer.parseInt(sticks[0]); i++)
				if (max < Integer.parseInt(sticks[i]))
				    max = Integer.parseInt(sticks[i]);
		}
		System.out.println(max);
	}
}

