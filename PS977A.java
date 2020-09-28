import java.util.Scanner;

public class PS977A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] in = s.nextLine().split(" ");
		int N = Integer.parseInt(in[0]);
		int K = Integer.parseInt(in[1]);
		for(int i = 0;i<K;i++) {
			if(N % 10 == 0) {
				N = N / 10;
			}else {
				N = N - 1;
			}
		}
		System.out.println(N);
	}
}
