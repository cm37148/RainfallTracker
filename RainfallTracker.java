package assignment;
import java.util.Scanner;
public class RainfallTracker {

	private static int [] rain_data;
	private static String[] month = {"January", "February", "Marsch", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	
		    
		    public static void main(String[] args) {
		    	RainfallTracker.addRainfallData();
		    	RainfallTracker.averageRainfall();
		     
		        System.out.println("The average rainfall for the year was "+averageRainfall()+" inches."); 
		        System.out.println("The lowest rainfall recorded for any month was "+lowestRainfallAmount()+" inches");
		        System.out.println("The name of the month with the lowest recorded rainfall was "+lowestRainfallMonth());
		        System.out.println("The highest rainfall recorded for any month was "+highestRainfallAmount()+" inches");
		        System.out.println("The name of the month with the highest recorded rainfall was "+highestRainfallMonth());
		    }
		    /**
		     * This method adds rainfall values to the array. Using a while loop
		     * - present the message, e.g. "Please enter an integer for the rainfall data for January or enter x to stop"
		     * - get the input from the console, if it is "x" then the loop stops and false is returned. Otherwise store the integer value in the array
		     * - end the loop when 12 integers have been added to the array, return true.
		     *  
		     * @return true if a value was given for all 12 months, return false use enter x to stop
		     */
		  
		    public static boolean addRainfallData() {
		    	Scanner in = new Scanner(System.in);
		    	rain_data = new int[12];
		    	int i = 0;
		    	boolean done = false;
		    	while (done == false || i<12) {
		    		System.out.println("Please enter an integer for the rainfall data for " +month[i]+ " or enter x to stop");
		    		String temp = in.next();
		    		if (temp.equalsIgnoreCase("x")) {
		    			return false;
		    			
		    		}
		    		rain_data[i] = Integer.parseInt(temp);
		    		i++;
		    		done = true;
		    	}
		    	
		        return true;
		    }
		    
		    /**
		     * This method computes the average rainfall for the year. Use a for loop
		     * Recall that average is the sum of the array values divided by the number (count) of values.  
		     * @return a double for the computed average
		     */
		    public static double averageRainfall() {
		    	int length = rain_data.length;
		    	double sum = 0;
		    	for (int i=0; i<rain_data.length; i++) {
		    		sum += rain_data[i];
		    	}
		    	double avg = sum/length;
		        return avg;
		    }
		    
		    /**
		     * This method finds the smallest value in the rainfall array
		     * @return the integer of the lowest rainfall in the array  
		     * NOTE: Assume that the values in the array are all unique 
		     */
		    public static int lowestRainfallAmount() {
		    	int min = rain_data[0];
		        int i;
		        for ( i = 1 ; i < rain_data.length ; i++ ) 
		        {
		            if ( rain_data[i] < min ) 
		            {
		                min = rain_data[i];
		               
		            }
		        } 
		       return min;
		    }
		    
		    /**
		     * This method finds the name of the month that matches the smallest value in the rainfall array
		     * @return the name of the month with the lowest rainfall in the array. 
		     * NOTE: Assume that the values in the array are all unique 
		     */
		    public static String lowestRainfallMonth() {
		    	int min = lowestRainfallAmount();
		    	for (int i=0; i<rain_data.length; i++) {
		    		if (rain_data[i] == min) {
		    			return month[i];
		    		}
		    	}
		        return null;
		    }

		    /**
		     * This method finds the largest value in the rainfall array
		     * @return the integer of the largest rainfall in the array  
		     * NOTE: Assume that the values in the array are all unique 
		     */
		    public static int highestRainfallAmount() {
		    	int max = rain_data[0];
		        int i;
		        for ( i = 0 ; i < rain_data.length ; i++ ) 
		        {
		            if (rain_data[i] > max) 
		            {
		                max = rain_data[i];
		            }
		        } 

		        return max;
		    }
		    
		    /**
		     * This method finds the name of the month that matches the largest value in the rainfall array
		     * @return the name of the month with the largest rainfall in the array. 
		     * NOTE: Assume that the values in the array are all unique 
		     */
		    public static String highestRainfallMonth() {
		    	int max = highestRainfallAmount();
		    	for (int i = 0; i<rain_data.length; i++) {
		    		if(rain_data[i] == max) {
		    			return month[i];
		    		}
		    	}
		        return null;
		    }
	
	}