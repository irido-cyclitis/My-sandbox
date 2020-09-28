    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Scanner;
     
    public class PS116A {
    	public static void main(String[] args) {
    		ArrayList<Integer> enters = new ArrayList<Integer>();
    		ArrayList<Integer> exits = new ArrayList<Integer>();
    		ArrayList<Integer> passlog = new ArrayList<Integer>();
    		Scanner s = new Scanner(System.in);
    		String stops = s.nextLine();
    		for(int i = 0;i<Integer.parseInt(stops);i++) {
    			String in = s.nextLine();
    			enters.add(Integer.parseInt(in.split(" ")[1]));
    			exits.add(Integer.parseInt(in.split(" ")[0]));
    		}
    		int passengers = 0;
    		for(int i = 0;i<Integer.parseInt(stops);i++) {
    			passengers = passengers - exits.get(i);
    			passengers = passengers + enters.get(i);
    			passlog.add(passengers);
    		}
    		Object[] passslog = passlog.toArray();
    		Arrays.sort(passslog);
    		System.out.println(passslog[passslog.length-1]);
    	}
    }
