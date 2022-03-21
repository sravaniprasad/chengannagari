package javastreamAPI;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Sorted {
   public static void main(String[] args) {
//		
//		        List<String> list = Arrays.asList("Sravani", "deepa", "sara", "vinny", "lovely");
//
	   List<Integer> list1 = Arrays.asList(-9, -18, 0, 25, 4);
	   System.out.println("==================printing as alist===============================");
	   list1.stream().forEach(a->System.out.println(a));
	   System.out.println("===================printing sorted reverseorder==============================");
		        list1.stream().sorted(Comparator.reverseOrder()).forEach(x->System.out.println(x));
		        System.out.println("================printing sorted order=================================");
		        list1.stream().sorted().forEach(a->System.out.println(a));
		        //System.out.println("The sorted stream is : ");
		        String[] array = { "GFG", "Geeks", "for",
                        "GeeksforGeeks", "GeeksQuiz" };
//
//     System.out.println("The sorted stream is :");
         System.out.println("=============sorted.comparable.method===============");
     Stream.of(array).sorted((str1, str2)-> Character.compare(str1 .charAt(str1.length() - 1), str2.charAt(str2.length() - 1))).
                  forEach(a->System.out.println(a));
     
     List<String> list2 = Arrays.asList("John", "Mark", "Robert", "Lucas", "Brandon");
     System.out.println("=====================sorted.string.collectors=============");
     List<String> sortedList = list2.stream().sorted(Collections.reverseOrder()) .collect(Collectors.toList());
    // List<Integer> answer = list1.stream().map(x -> x*x).collect(Collectors.toList());
     System.out.println(sortedList);

     
		        
		        
		    }
}
