package java8;

import java.util.function.Predicate;

public class Interfacepredicate
{
 public static void main(String[] args) 
  {                                                                             
// int[] num = { 1, 2, 3,4, 6, 5,7,8,9};          
//Predicate<Integer> even = x -> x % 2 == 0;            
// Predicate<Integer> numbers = y -> y >5;                          
// for (int i=1;i<num.length+1;i++)                                             
//    {                                                                       
//         if (numbers.and(even).test(i))  
//	 //if(odd.or(even).test(i))
//      {
//         System.out.println(i);
//      }
	 Predicate<String> name = Predicate.isEqual("Mumbai");
	 System.out.println(name.test("Mumbai"));
	 
	 
	 Predicate<String> name1 = Predicate.isEqual("Mumbai");
	 System.out.println(name1.test("pune"));

      }
    }
  
	 