
public class LeapYear {
	
	public Boolean countleap(int num){
				
		boolean leapleap = leapYear(num);
		return leapleap;
	
	}
	
	private Boolean leapYear(int num){
		
		int selectedYear = num;
		boolean leap = false;
		
		try{
				
			if (((selectedYear % 4 == 0) && (selectedYear % 100 != 0)) || 
			(selectedYear % 100 == 0)) leap = true;
			
			else leap = false;
			
	    }
		
		catch (Exception error){
			
		}
		
		return leap;

    }
}

