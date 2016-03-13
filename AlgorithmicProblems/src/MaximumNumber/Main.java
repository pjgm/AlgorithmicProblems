package MaximumNumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main (String[] args) throws java.lang.Exception {
		
		String line;
		int max = Integer.MIN_VALUE;
 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 		reader.readLine();
		while ((line = reader.readLine()) != null) {
			String [] val_array = line.split(" ");
			for(int i = 1; i < val_array.length; i++)
				if (max < Integer.parseInt(val_array[i]))
				    max = Integer.parseInt(val_array[i]);
		}
		System.out.println(max);	
	}
}

