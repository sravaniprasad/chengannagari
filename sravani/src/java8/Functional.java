package java8;

import java.util.function.Function;

public class Functional
		{
		public static void main(String[] args) {
			
//		{
//		 Function<String, Integer> fun = s -> s.length();
//		 System.out.println(fun.apply("Hello"));
//		 
//		 Function<String,String> str=s->s.replace('a', 's');
//		 System.out.println(str.apply("sravani"));
//		 
//		
//			
//		 
//        }
//		}


//andThen , Compose
		int number=5;
Function<Integer,Integer>sum=a->a+a;       
Function<Integer,Integer>div=a->a/a;
//System.out.println(sum.apply(number));
//System.out.println(div.apply(number));
                   //10
//System.out.println(sum.andThen(div).apply(number));         
//System.out.println(sum.compose(div).apply(number));

//identifyF
//Function.identity()
		}
}