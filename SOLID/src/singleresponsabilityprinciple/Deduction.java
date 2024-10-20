package singleresponsabilityprinciple;

public class Deduction {
	public float calculateDeduction(float initial, int percentage) {		
		return (initial*percentage)/100;
	}

	public float newCalculateDeduction(float initialAmount, int deductionPercentage) {
		
		if(initialAmount>35600)
			return (float) ((initialAmount*(deductionPercentage+4.5))/100);
		else
			return (initialAmount*deductionPercentage)/100;
			
	}
}
