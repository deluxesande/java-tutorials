import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) throws Exception {
		// ! Set
		Set<Integer> sl = new HashSet<Integer>();

		sl.add(3);
		sl.add(45);
		sl.add(35);

		boolean sx = sl.contains(34);
		// System.out.println(sl);
		// System.out.println(sx);

		// ! Tree Set
		Set<Integer> t = new TreeSet<Integer>();

		t.add(3);
		t.add(45);
		t.add(35);

		boolean x = t.contains(34);
		// System.out.println(t);
		// System.out.println(x);

		// ! Array List
		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(30);
		arr.add(32);
		arr.add(33);
		arr.add(34);
		arr.add(31);

		System.out.println(arr.get(0));

		System.out.println(arr.subList(0, 2));
	}
}
