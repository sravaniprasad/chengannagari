package javastreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		for (Integer element : list) {
//		    System.out.print(element + " ");
//		}
		
		List list1 = Arrays.asList(1,3,5,7);
	//	list1.stream().forEach((k) -> {System.out.print(k + " ");});
		list1.stream().forEach(System.out::println);
	}

}
