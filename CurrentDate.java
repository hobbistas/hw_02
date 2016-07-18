import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class CurrentDate {

	public String[] currentDate(){
    
		return cDate();
		
	}
	
			
		private static String[] cDate(){
			
			LocalDateTime timePoint = LocalDateTime.now();
			LocalDate datetemp = timePoint.toLocalDate();
			String datedate = datetemp.toString();
			char[] date = datedate.toCharArray();
			char[] dateyear = Arrays.copyOfRange(date, 0, 4);
			char[] datemonth = Arrays.copyOfRange(date, 5, 7);
			char[] dateday = Arrays.copyOfRange(date, 8, 10);
	        String dateyearStr = String.valueOf(dateyear);
	        String datemonthStr = String.valueOf(datemonth);
	        String datedayStr = String.valueOf(dateday);
	        //System.out.println(dateyearStr);
		    //System.out.println(datemonthStr);
		    //System.out.println(datedayStr);
			
			String[] stringAr = new String[3];
			stringAr[0] = dateyearStr;
			stringAr[1] = datemonthStr;
			stringAr[2] = datedayStr;
			
			return stringAr;
		
	}


}
