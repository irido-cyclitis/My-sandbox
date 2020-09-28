    import java.util.*;
    import java.io.*;
     
    public class PS546A {
    	public static void main(String[] args) {
    		try {
    		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    		String[] inputs = BR.readLine().split(" ");
    		int CostOfTheFirstBanana = Integer.parseInt(inputs[0]);
    		int InitialDollarsHasSoldier = Integer.parseInt(inputs[1]);
    		int NumOfBananas = Integer.parseInt(inputs[2]);
    		int TotalPrice = 0;
    		for (int i = 1;i<NumOfBananas+1;i++) {
    			TotalPrice+=i * CostOfTheFirstBanana;
    		}
    		if(InitialDollarsHasSoldier>=TotalPrice) {
    			System.out.println("0");
    		}else {
    			System.out.println(TotalPrice-InitialDollarsHasSoldier);
    		}
    		}catch(Exception e) {
    			
    		}
    	}
    }
