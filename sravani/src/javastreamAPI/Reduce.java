package javastreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {

	public static void main(String[] args) {
//		T reduce(T identity, BinaryOperator<T> accumulator);
//         Where, identity is initial value 
//		of type T and accumulator is a 
//		function for combining two values.
		 List<String> words = Arrays.asList("sravani", "sravanthi", "deepa","sweety", "navyaanandh");
                 
		 Optional<String> names = words.stream().reduce((word1, word2)-> word1.length()> word2.length()?word1 : word2);
		 names.ifPresent(a->System.out.println(a));
		
		
		
	}
	

}
