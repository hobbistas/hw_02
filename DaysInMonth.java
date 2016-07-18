
public class DaysInMonth {
    
	
	public Integer daysperMonth(int mval, boolean yval){
		
		Integer intdays = calcD(mval,yval);
		return intdays;
		
	}
	
	
	private Integer calcD(int mval,boolean yval){
		
		int val = mval - 1;
		boolean leap = yval;
		int[] months = new int [12];
				
		try{
		
			for (int ii = 1; ii < months.length + 1; ii++){
			Double fillTable = (28 + ( ii + Math.floor ( ii / 8 ) ) % 2 +
					2 % ii + 2 * Math.floor ( 1 / ii ) );
			months[ii-1] = fillTable.intValue();

			}
		
		if (leap == true) months[1] = 29;
		
		}
		
		catch (ArrayIndexOutOfBoundsException arrayError){
			
		     //System.out.println("Out of bounds!");	
		}
		
		return months[val];
			
	}
}
