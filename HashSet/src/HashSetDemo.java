import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add("a");
		h.add("b");
		h.add(null);
		h.add(10);
		System.out.println(h.add("b"));
		System.out.println(h.add(null));
		System.out.println(h);
				

	}

}
