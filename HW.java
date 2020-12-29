
public class HW {
	/*
	* Standard Deviation Calculate
	* Last-Modified Date : 29/12/2020
	* Morad Abdelrasheed Mokhtar Ali
	*/

	public static void main(String[] args) {
		
		// init
		
		double out = 0;
		double[] values = {5,6,7,8,9};
		
		// Mean
		
		double mean = 0;
		for(int i = 0;i<values.length;i++) {
			mean = mean + values[i];
		}
		mean = mean / values.length;
		
		// Numerator
		
		for(int i = 0;i<values.length;i++) {
			values[i] = Math.pow(values[i] - mean, 2);
		}
		double numerator = 0;
		for(int i = 0;i<values.length;i++) {
			numerator = numerator + values[i];
		}
		
		// Calculation
		
		out = Math.sqrt(
				numerator / values.length
				);
		
		// Print
		
		System.out.println("Standard Deviation : "+out+" = " + ("sqrt("+numerator+"/"+values.length+")")
				+"\n"+"Mean : "+mean);
	}

}
