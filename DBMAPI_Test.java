import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;

public class DBMAPI_Test {
	static int READs = 100000; // 100k
	static int SIZE = READs;
	static ArrayList<String> DATA = new ArrayList<String>();
	static ArrayList<String> DATAA = new ArrayList<String>();
	public static void main(String[] args) {
		File file = new File("./Results.csv");
		PrintStream stream;
		try {
			stream = new PrintStream(file);
			System.setOut(stream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Tester(new HashMap<Integer,Integer>(),DATA);
		Tester(new ConcurrentHashMap<Integer,Integer>(),DATAA);
		System.out.println("HashMap,ConcurrentHashMap");
		for(int i = 0;i<500;i++) {
			int random =  ThreadLocalRandom.current().nextInt(0, SIZE + 1);
			System.out.println(DATA.get(random)+","+DATAA.get(random));
		}
	}
	public static void Tester(Map<Integer,Integer> x, ArrayList<String> y) {
		for(int i = 0;i<100;i++) {
		Write(x);
		Read(x,y);
		}
	}
	public static void Read(Map<Integer,Integer> x,ArrayList<String> y) {
		for(int i = 0;i<READs;i++) {
			int random =  ThreadLocalRandom.current().nextInt(0, SIZE + 1);
			long NFT = System.nanoTime();
			x.get(random);
			long T = System.nanoTime() - NFT;
		    y.add(String.valueOf(T));
		}
		// System.out.println(x.getClass()+" | READ | "+TimeUnit.NANOSECONDS.toMillis(T)+" ms");
	}
	public static void Write(Map<Integer,Integer> x) {
		long NFT = System.nanoTime();
		for(int i = 0;i<SIZE;i++) {
			x.put(i,i);
		}
		long T = System.nanoTime() - NFT;
		// System.out.println(x.getClass()+" | WRITE | "+TimeUnit.NANOSECONDS.toMillis(T)+" ms");
	}
}
