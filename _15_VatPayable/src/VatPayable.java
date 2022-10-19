
public class VatPayable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double PriceBeforeVat = 14.5;
		double Vat = 0.23;
		double TotalPrice = PriceBeforeVat + (PriceBeforeVat*Vat);
		
		System.out.println(PriceBeforeVat);
		System.out.println(TotalPrice);
		
		double PriceBeforeVat_1 = 22.5;
		double Vat_1 = 0.21;
		double TotalPrice_1 = PriceBeforeVat_1 + (PriceBeforeVat_1*Vat_1);
		
		System.out.println(PriceBeforeVat_1);
		System.out.println(TotalPrice_1);
		
		

	}

}
