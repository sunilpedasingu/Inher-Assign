package assignment;

public class Language extends Department{
	int budget=2000;
	int minBudget;
	int maxBudget;
	
	public int getBudget() {
		return budget;
	}
	public int getMinBudget() {
		return minBudget=budget;
	}
	public int getMaxBudget() {
		return maxBudget=budget + super.budget;
	}

}
