import java.util.Scanner;

public class Calendar {
 
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	
	public static void main(String[] args) {
		
		System.out.println(ANSI_CYAN + "Welcome to calendar! \n\n"
				+ "If you want to set the current date"
				+ " please type 'set' \notherwise leave blank and hit enter." + ANSI_RESET);
		
		Scanner aM = new Scanner(System.in);
		String autoManual = aM.nextLine();
		
       	if (currentOrSet(autoManual)) setDate(); else caller();
       	
        aM.close();
			
		}
	
	private static void setDate(){
		
		try{
			
			System.out.println(ANSI_YELLOW + "Please type the date - format "
					+ "[ddmmyyyy]!" + ANSI_RESET);
		    Scanner date = new Scanner(System.in);
   		    String dateStr = date.nextLine();
         	Integer d, m, y;
	        d = Integer.parseInt(dateStr.substring(0,2));
	        m = Integer.parseInt(dateStr.substring(2,4));
	        y = Integer.parseInt(dateStr.substring(4,8));
            Calendar.calendar(d, m, y);
 	        date.close();

   		    }
		
		catch (Exception err){
			
			System.out.println(ANSI_RED + "Wrong input - Please use the "
					+ "format ddmmyyyy!" + ANSI_RESET);
			
		}
   		    		
	}
	
	private static Boolean currentOrSet(String autoManual){
		
		String pos = "set";
		boolean posAns;
		posAns = pos.equalsIgnoreCase(autoManual);
		
		if(posAns) return true;	else return false;
		
	}
	

	private static void caller(){
		
		int yy;
		int dd;
		int mm;
		
		CurrentDate cd = new CurrentDate();
        String[] currentdate = cd.currentDate();
        yy = Integer.parseInt(currentdate[0]);
        mm = Integer.parseInt(currentdate[1]);
        dd = Integer.parseInt(currentdate[2]);
            
        Calendar.calendar(dd,mm, yy);
             
		}
		
	
	private static void calendar(int d, int m, int y){
				
    	int numberOfDays = d;
    	int numberOfMonth = m;
    	int numberOfYear = y;
					
    	try{

            if (numberOfMonth > 12){
    			
    			ArrayIndexOutOfBoundsException err2 = new ArrayIndexOutOfBoundsException();
    			System.out.println(ANSI_RED + "Wrong input [exceeded "
    					+ "year's months]" + ANSI_RESET);
                throw err2;
                
    		}
            
    		LeapYear selectedYear = new LeapYear();
    		boolean sely = selectedYear.countleap(numberOfYear);
    		DaysInMonth daysinmonth_temp = new DaysInMonth();
    		Months selectedMonth = new Months();
    		String selectedMonthStr = selectedMonth.getMonth(numberOfMonth);
    		int daysInSelectedMonth = daysinmonth_temp.daysperMonth(numberOfMonth,sely);
    		
      		if (numberOfDays < daysInSelectedMonth){
        		
      			System.out.println(ANSI_YELLOW + "The date is: " 
      					+ ANSI_WHITE + d + " " + m + " " + y +
      					ANSI_YELLOW + " [dd-mm-yyyy]");
        		System.out.println(ANSI_YELLOW + "The selected month [" 
      					+ ANSI_WHITE + selectedMonthStr + ANSI_YELLOW
        			+ "] " + "has " + daysInSelectedMonth + " days.");
        		System.out.println(ANSI_BLUE + "Is " 
        			+ ANSI_WHITE + numberOfYear + ANSI_BLUE + " a leap year ? "
        				+ ANSI_YELLOW + sely);
    		}
      		
      		else{
      			
      			ArrayIndexOutOfBoundsException err = new ArrayIndexOutOfBoundsException();
    			System.out.println(ANSI_RED + "Wrong input [exceeded month's days]"
    					+ ANSI_RESET);
    			throw err;
    			
      		}
      		
    		}
    		
    		catch(ArrayIndexOutOfBoundsException Error){
    			
    			System.out.println(ANSI_RED + "Please check your input parameters!");
    			
    		}    		
    }
}
