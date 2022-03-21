package javastreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.*;
import java.util.stream.*;

		public class Filtersandcollections {

		    public static void main(String[] args)
		    {

//		        ArrayList<Integer> al = new ArrayList<Integer>();
//		        ArrayList<String> a = new ArrayList<String>();

//		        al.add(2);
//		        al.add(6);
//		        al.add(9);
//		        al.add(4);    
//		        al.add(20);
//		        a.add("this is a string");//we can also print string
//		        System.out.println("Printing the collection : "+ al +a);
//		        System.out.println();
//		        List<Integer> ls= al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
//		       
//		        String[] arr = new String[]{"a", "b", "c"};
//		        
		 
		        // Print the collection after stream operation
		        // as stored in List object
		       // System.out.println( "Printing the List after stream operation : "  + ls);
		       
		        	      List<Integer> list1 = Arrays.asList(11,22,44,21); //creating an integer list
		        	      List<String> id = Arrays.asList("Objects","Classes","Methods");
		        	      //creating a String list
		        	      // map method
		        	      List<Integer> ans = list1.stream().map(x -> x*x).collect(Collectors.toList());
		        	      System.out.println(ans);
		        	      // filter method
		        	      List<String> res = id.stream().filter(x->x.startsWith("M")).collect(Collectors.toList());
		        	      System.out.println(res);
		    }
		}

