import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PS281A {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	String in = s.nextLine();
    	String h = String.valueOf(in.charAt(0));
    	in = in.replaceFirst(h,h.toUpperCase());
    	System.out.println(in);
    }
}
