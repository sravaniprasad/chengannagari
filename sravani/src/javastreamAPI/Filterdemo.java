package javastreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.*;
import java.util.stream.*;
public class Filterdemo {
	public static void main(String args[]) {
		
		 List<String> id = Arrays.asList("Objects","Classes","Methods");
	      //creating a String list
	      // map method
	     
	      List<String> res = id.stream().filter(x->x.startsWith("M")).collect(Collectors.toList());
	      System.out.println(res);
	     
    }
		
	}


