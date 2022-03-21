package javastreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapmethod {

	public static void main(String[] args) {
		 // map method
		 List<Integer> list1 = Arrays.asList(11,22,44,21);
	      List<Integer> answer = list1.stream().map(x -> x*x).collect(Collectors.toList());
	      System.out.println(answer);
	      
	  
	}

}
