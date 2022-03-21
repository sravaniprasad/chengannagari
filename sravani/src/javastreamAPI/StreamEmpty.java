package javastreamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEmpty {

	public static void main(String[] args) {
//		List<Integer>s=Arrays.asList(1,2,3,4,5);
//		Long result=  s.stream().collect(Collectors.counting());
//		 System.out.println("Result: "+ result);
//		Stream<String> streamEmpty = Stream.empty();
//		System.out.println(streamEmpty);
		
		Collection<String>collection=Arrays.asList("java","programming");
		Stream<String> streamEmpty = Stream.empty();
		//Stream<String> stream1=collection.stream();
		streamEmpty.forEach(System.out::println);
	}

}
