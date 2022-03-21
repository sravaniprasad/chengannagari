package javastreamAPI;

import java.util.Optional;

public class Optionaldemo {

	public static void main(String[] args) {
		// create a Optional
       Optional<Integer> op= Optional.of(65674);
		 //Optional<Integer> op= Optional.empty();
		 Optional<Integer> op1= Optional.ofNullable(null);
       
       // print value
       System.out.println("Optional: "+ op1);
		 op.ifPresentOrElse(
		            (value)
		                -> {
		                	System.out.println("Value is present, its: " + value); }, () -> { System.out.println("Value is empty"); });
		
       
  
        // get the Stream
        System.out.println("Getting the Stream:");
        op.stream().forEach(a->System.out.println(a));
        
	}

}
