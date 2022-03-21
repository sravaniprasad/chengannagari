package javastreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
public class Limit {
	 public static Stream<String> limiting_func(Stream<String> str, int range){
         return str.limit(range);
}

public static void main(String[] args) {
		 List<String> arr = new ArrayList<>();
         
         arr.add("sravani");
         arr.add("deepa");
         arr.add("sravanthi");
         arr.add("maany");
         arr.add("kriti");
          
         Stream<String> str = arr.stream();
           
         // calling function to limit the stream to range 3
         Stream<String> limit = limiting_func(str,3);
         limit.forEach(a->System.out.println(a));
    

	}

}
