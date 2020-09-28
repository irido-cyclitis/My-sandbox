// HashMap made in Vector
import java.lang.reflect.Array;
import java.util.Vector;
public class B {
	Vector<Object> x; // Key
	Vector<Object> y; // Value
	MeSta() {
		this.x = new Vector<>();
		this.y = new Vector<>();
	}
	public void put(Object i0, Object i1) {
		x.add(i0);
		y.add(i1);
	}
	public Object get(Object i0) {
		Object out;
		out = y.get(x.indexOf(i0));
		return out;
	}
}
