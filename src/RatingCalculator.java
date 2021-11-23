import java.util.ArrayList;
import java.util.List;

public class RatingCalculator {

	public static void main(String[] args) {
		System.out.println("start");
		
		//inputs
		String moody="A3";
		String sp="A";
		String fitch="A+";
		
		int num_moody=0;
		int num_sp=0;
		int num_fitch=0;
		
		
		for(FinancialRatingsDataset f:FinancialRatingsDataset.values()) {
			if(f.getMoody().equals(moody)){
				num_moody=Integer.parseInt(f.getNumericRating());
				break;
			}
		}
		
		for(FinancialRatingsDataset f:FinancialRatingsDataset.values()) {
			if(f.getSp().equals(sp)){
				num_sp=Integer.parseInt(f.getNumericRating());
				break;
			}
		}
		
		for(FinancialRatingsDataset f:FinancialRatingsDataset.values()) {
			if(f.getFitch().equals(fitch)){
				num_fitch=Integer.parseInt(f.getNumericRating());
				break;
			}
		}
		
		List<Integer> numArray=new ArrayList<Integer>();
		numArray.add(num_moody);
		numArray.add(num_sp);
		numArray.add(num_fitch);
		
		//median
		System.out.println(MedianCalculator.findMedian(numArray));
		
		
	}

}
