package collections;

import java.util.ArrayList;

public class ArrayLists {
	public static void main(String args[]) {
		ArrayList<String> s1 = new ArrayList<String>();
		sl.add("Hima");
		sl.add("Bhimavaram");
		al.add("Honey");
		System.out.println("Array List elements inserted normally:"+sl);
		sl.add(1,"Kittu");
		sl.add(3,"Banny");
		System.out.println("ArrayList elements inserted based on index:"+sl);
		sl.remove("Banny");
		System.out.println("Array List element removed based on element:"+sl);
		sl.remove(1);
		System.out.println("Array List element removed based on their index:"+sl);
	}
}
