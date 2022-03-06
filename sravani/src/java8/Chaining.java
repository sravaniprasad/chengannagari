package java8;

import java.util.function.Function;

public class Chaining {
		
		public static void main(String[] args) 
		{
		// TODO Auto-generated method stub
		 int amount = 4;
		 String n=" name ",n1="sravani";
		 Function<Integer, Integer> sum = add  -> add + add; 
		 
		 Function<Integer, Integer> sq = i -> i * i; 
		 Function<Integer, Integer> div = i -> i / i;
		 
		 System.out.println(sum.apply(amount));
		 System.out.println(sq.apply(amount));
	
		 
		 System.out.println(sum.andThen(sq).apply(amount));
		
		 System.out.println(sum.compose(sq).apply(amount));
		 System.out.println();
		} 
	}

