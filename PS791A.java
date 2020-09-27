import java.util.Scanner;

public class PS791A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String in = s.nextLine();
		int LimakWeight = Integer.parseInt(in.split(" ")[0]);
		int BobWeight = Integer.parseInt(in.split(" ")[1]);
		int years = 0;
		while(LimakWeight<=BobWeight) {
			years++;
			LimakWeight = LimakWeight * 3;
			BobWeight = BobWeight * 2;
		}
		System.out.println(years);
	}
}
