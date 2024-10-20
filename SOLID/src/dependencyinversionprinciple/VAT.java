package dependencyinversionprinciple;

public class VAT implements VATInterface{
	public float cal(float initial) {
		return (float) (initial*0.16);
	}

}
