package assignment;

public class Science extends Department {
	int budget=1000;
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