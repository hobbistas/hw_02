
public class Months {

	public String getMonth(int val){
		
		String monthsStr = months(val);
		return monthsStr;
		
	}
	
    private String months(int val){
		
		int sel = val -1;
		String[] monthsNames = { "January", "February", "March", "April", 
				"May", "June", "July", "August", "September", "October", 
				"November", "December"};
		
		try{
    	
		}
		
		catch (ArrayIndexOutOfBoundsException err){
			
			//System.out.println("Select between 1 - 12 !!!");
			
		}
		
			return monthsNames[sel];

		}
	

}
