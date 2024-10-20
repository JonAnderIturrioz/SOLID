package singleresponsabilityprinciple;

public class Total {

	public float calculateTotal(float initialAmount, float totalDeduction, float totalVAT) { 
		return initialAmount - totalDeduction + totalVAT;
	}

	public float newCalculateTotal(String code, float initialAmount, float totalDeduction, float totalVAT) {
		
		if (Integer.parseInt(code) < 10)
			return initialAmount - totalDeduction;
		else
			return initialAmount - totalDeduction + totalVAT;
	}

}
