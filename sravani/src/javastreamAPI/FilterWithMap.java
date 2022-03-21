package javastreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterWithMap {

	public static void main(String[] args) {
		        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		 
		        List<Integer> evenSquare = list.stream().filter(n -> n % 2 == 0) .map(n -> n * n) .collect(Collectors.toList());
		        List<Integer> onlyevenNumbers = list.stream() .filter(n -> n % 2 == 0).collect(Collectors.toList());
	         
	        System.out.println(onlyevenNumbers);
		         
		        System.out.println(evenSquare);
		       // map() returns a stream consisting of the results of applying the given function
		        //to the elements of this stream. In this Java example, we’ll first get even numbers
		        //from a List and then will find square of numbers and will collect in a list.
		    }
		}
