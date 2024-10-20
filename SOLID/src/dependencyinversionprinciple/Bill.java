package dependencyinversionprinciple;

import java.util.Date;

public class Bill {
	public String code; // Representa un número de 5 dígitos
	public Date date;
	public float initialAmount;
	public float totalVAT;
	public float totalDeduction;
	public float billTotal;
	public int deductionPercentage;

// Método que calcula el total de la factura
	public void billTotalCalc() {
// Calculamos la deducción
		Deduction d = new Deduction();
		totalDeduction = d.calc(initialAmount, deductionPercentage);
// Calculamos el IVA
		VAT v = new VAT();
		totalVAT = v.cal(initialAmount);
// Calculamos el total
		billTotal = (initialAmount - totalDeduction) + totalVAT;
	}
}
