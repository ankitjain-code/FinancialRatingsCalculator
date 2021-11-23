
public enum FinancialRatingsDataset {
	
	R1("Aaa","AAA","AAA","20"),
	R2("Aa1","AA+","AA+","19"),
	R3("Aa2","AA","AA","18"),
	R4("Aa3","AA-","AA-","17"),
	R5("A1","A+","A+","16"),
	R6("A2","A","A","15"),
	R7("A3","A-","A-","14"),
	R8("Baa1","BBB+","BBB+","13"),
	R9("Baa2","BBB","BBB","12"),
	R10("Baa3","BBB-","BBB-","11"),
	R11("Ba1","BB+","BB+","10"),
	R12("Ba2","BB","BB","09"),
	R13("Ba3","BB-","BB-","08"),
	R14("B1","B+","B+","07"),
	R15("B2","B","B","06"),
	R16("B3","B-","B-","05"),
	R17("Caa1","CCC+","CCC","04"),
	R18("Caa2","CCC","","03"),
	R19("Caa3","CCC-","","02"),
	R20("Ca","CC","","01");
	
	
	FinancialRatingsDataset(String moody, String sp, String fitch, String numericRating) {
		this.moody=moody;
		this.sp=sp;
		this.fitch=fitch;
		this.numericRating=numericRating;
	}
	
	private final String moody;
    private final String sp;
    private final String fitch;
    private final String numericRating;
    
    
	public String getMoody() {
		return moody;
	}
	public String getSp() {
		return sp;
	}
	public String getFitch() {
		return fitch;
	}
	public String getNumericRating() {
		return numericRating;
	}

}
