import java.util.Collections;
import java.util.List;

public class MedianCalculator {
	
	public static int findMedian(List<Integer> numArray) {
		Collections.sort(numArray);
		int median;
		if (numArray.size() % 2 == 0)
		    median = ((int)numArray.get(numArray.size()/2) + (int)numArray.get(numArray.size()/2 - 1))/2;
		else
		    median = (int) numArray.get(numArray.size()/2);
		return median;
	}
	

}
