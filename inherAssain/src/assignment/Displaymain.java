package assignment;

public class Displaymain {

	public static void main(String[] args) {
		
		Language l=new Language();
		l.x();
		System.out.println("Maximum budget of Language Depo :" +l.getMaxBudget());
		System.out.println("Minimum budget of Language Depo :" +l.getMinBudget());
		
		Science s=new Science();
		System.out.println("Minimum budget of Science Depo :" + s.getMinBudget());
		System.out.println("Minimum budget of Science Depo :" + s.getMaxBudget());
		
		Math m=new Math();		
		System.out.println("Minimum budget of Math Depo :" + m.getMinBudget());
		System.out.println("Maximum budget of Math Depo :" + m.getMaxBudget());
			 
	}

}