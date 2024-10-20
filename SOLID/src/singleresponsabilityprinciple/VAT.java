package singleresponsabilityprinciple;

public class VAT {
	public float calculateVAT(float initial) {
		return (float) (initial*0.16);
	}

	public float newCalculateVAT(float initialAmount) {
		return (float) (initialAmount*0.21);
	}
}
