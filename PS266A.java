import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PS266A {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	String sizee = s.nextLine();
    	String type = s.nextLine();
    	List<String> content = new ArrayList<String>();
    	for (int i = 0;i<type.split("").length;i++) {
    		content.add(i,type.split("")[i]);
    	}
    	int x = 0;
    	String[] tryees = {"R","G","B"};
		int o = 0;
		int out = 0;
    	while(x < 3) {
    		String trr = tryees[x];
    		for (int i = 0;i<content.size()-1;i++) {
    			if (content.get(i).equals(trr)) {
    				if(content.get(i+1).equals(trr)) {
    					o+=1;
    				}
    			}
    		}
    		x++;
    	}
		out+= (o);
    	System.out.println(out);
    }
}
