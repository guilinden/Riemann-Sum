
public class MainToIntegrate {

	public static void main(String[] args) {
		
		double middleSum = Integrate.middleSum(new F1(), 0.0, 2.0, 4);
		System.out.printf("Middle Sum = %.4f", middleSum);
		double leftSum = Integrate.leftSum(new F2(), 0.0, 2, 10000);
		System.out.printf("\nLeft Sum = %.4f", leftSum );
		double rightSum = Integrate.rigthSum(new F3(), 0.0, 3, 10000);
		System.out.printf("\nRight Sum = %.4f", rightSum);
	}

}
