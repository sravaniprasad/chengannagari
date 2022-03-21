package javastreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class OwnDemo {

	public static void main(String[] args) {
		
		
		
	  //create a stream from sources
		Collection<String>collection=Arrays.asList("java","programming");
		Stream<String> stream1=collection.stream();
		stream1.forEach(System.out::println);

		
		
		List<String>list=Arrays.asList("welcome","to","my","organization");
		Stream<String> stream2=list.stream();
		stream2.forEach(System.out::println);
		
		
		Set<String>set=new HashSet<>(list);
		Stream<String> stream3=set.stream();
		stream3.forEach(System.out::println);
		
		String[] Array= {"a","b","c"};
		Stream<String> stream4=Arrays.stream(Array);
		stream4.forEach(System.out::println);

		//creating a stream of an array
				Stream<String>stream=Stream.of("a","b","c");
				stream.forEach(System.out::println);
		
		

	}

}
