package javastreamAPI;

import java.util.Arrays;
import java.util.List;

public class Match {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(97, 101, 67, 15, 23);
	    boolean res = numList.stream().anyMatch(n -> n%2==1 );
	    System.out.println(res);

	}

}
