
public class booleanOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	boolean isHotOutside = true;
	boolean isWeekday = false;
	boolean hasMoneyInPocket = true;
	
	double costOfMilk = 3.99;
	double moneyInWallet = 15.00;
	int thirstLevel = 8;
	
	// should buy ice cream if it is hot and i've got money. 
	// will go swimmming if it is hot outside and it is not a weekday
	// is a good day - if it is hot, money in the pocket, and it is not a weekday
	
	boolean shouldByIcecream = isHotOutside && hasMoneyInPocket;
		
		if (shouldByIcecream) {
			System.out.println("I should bye Icecream.");
		}
		
	boolean willGoSwimming = isHotOutside &! isWeekday; 
		
		if (willGoSwimming) {
			System.out.println("Let us go swimming today!");
		}
		
	boolean isAGoodDay = isHotOutside && hasMoneyInPocket &! isWeekday; 
		
		if (isAGoodDay) {
			System.out.println("Today is a good day.");
		}
		
	boolean willBuyMilk = isHotOutside && (thirstLevel >= 3) && (moneyInWallet >= (2 * costOfMilk)); 
			
		if (willBuyMilk) {
			System.out.println("I will buy milk");	
		}
	
	}

}
