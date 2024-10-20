package singleresponsabilityprinciple;

import java.util.Date;

public class Bill {
	public String code; // Representa un n�mero de 5 d�gitos
	public Date date;
	public float InitialAmount;
	public float totalVAT;
	public float totalDeduction;
	public float billTotal;
	public int deductionPercentage;

// M�todo que calcula el total de la factura
	public void billTotalCalc() {
// Calculamos la deducci�n
		totalDeduction = (InitialAmount * deductionPercentage) / 100;
// Calculamos el IVA
		totalVAT = (float) (InitialAmount * 0.16);
// Calculamos el total
		billTotal = (InitialAmount - totalDeduction) + totalVAT;
	}

	public void newBillTotalCalc() {
		// Calculamos la deducci�n
		if (InitialAmount > 35600)
			totalDeduction = (float) ((InitialAmount * (deductionPercentage + 4.5)) / 100);
		else
			totalDeduction = (InitialAmount * deductionPercentage) / 100;

		// Calculamos el IVA
		totalVAT = (float) (InitialAmount * 0.21);
		
		// Calculamos el total
		if (Integer.parseInt(code) < 10)
			billTotal = InitialAmount - totalDeduction;
		else
			billTotal = (InitialAmount - totalDeduction) + totalVAT;
	}

	// M�todo que calcula el total de la factura
	public void billTotalCalcRefactorizado() {
		// Calculamos la deducci�n
		totalDeduction = new Deduction().calculateDeduction(InitialAmount, deductionPercentage);
		// Calculamos el IVA
		totalVAT = new VAT().calculateVAT(InitialAmount);
		// Calculamos el total
		billTotal = new Total().calculateTotal(InitialAmount, totalDeduction, totalVAT);
	}

	public void newBillTotalCalcRedactorizado() {
		// Calculamos la deducci�n
		totalDeduction = new Deduction().newCalculateDeduction(InitialAmount, deductionPercentage);
		// Calculamos el IVA
		totalVAT = new VAT().newCalculateVAT(InitialAmount);
		// Calculamos el total
		billTotal = new Total().newCalculateTotal(code, InitialAmount, totalDeduction, totalVAT);
	}

}
