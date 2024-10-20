package dependencyinversionprinciple;

public class Deduction implements DeductionInterface{
	public float calc(float initial, int percentage) {		
		return (initial*percentage)/100;
	}
}
