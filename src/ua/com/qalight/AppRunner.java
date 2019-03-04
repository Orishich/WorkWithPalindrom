package ua.com.qalight;

import java.util.logging.Logger;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class AppRunner {
	
	public static Integer main(String[] args) {

		Set<Integer> multipliers = new HashSet<>();
		

		int tempResult = 0; 
		for(int min = 1000; min <= 9999; min++) {
			int sum = min;
			StringBuilder clearNum = new StringBuilder(sum);
			StringBuilder revNum = clearNum.reverse();
			if (revNum.equals(clearNum))
				multipliers.add(tempResult);
		}

		return Collections.max(multipliers);
	
	}
	

}


