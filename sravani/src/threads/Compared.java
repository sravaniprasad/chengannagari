package threads;


		import java.io.*;
		import java.util.*;
		 
		// A class 'Movie' that implements Comparable
		class Movies implements Comparable<Movies>
		{
		     double rating;
		     String name;
		     int year;
		 
		   
		    public Movies(String nm, double rt, int yr)
		    {
		        this.name = nm;
		        this.rating = rt;
		        this.year = yr;
		    }
		    public int compareTo(Movies m)
		    {
		        return this.year - m.year;
		    }
		 
		 
		   
		    public double getRating() 
		    { return rating; 
		    }
		    public String getName()  
		    {  return name; 
		    }
		    public int getYear()     
		    {  return year;  
		    }
		}
		 
		
		class Compared
		{
		    public static void main(String[] args)
		    {
		        ArrayList<Movies> list = new ArrayList<Movies>();
		        
		        
		        list.add(new Movies("Force Awakens      ", 8.3, 2015));
		        list.add(new Movies("Star Wars          ", 8.7, 1977));
		        list.add(new Movies("Empire Strikes Back", 8.8, 1980));
		        list.add(new Movies("Return of the Jedi ", 8.4, 1983));
		 
		        Collections.sort(list);
		 
		        System.out.println("Movies after sorting : ");
		        System.out.println("======================================================");
		        System.out.println("movies\t\t rating\t  year\t\t");
		        System.out.println("======================================================");
		        for (Movies movie: list)
		        {
		            System.out.println(movie.getName() + " " +
		                               movie.getRating() + " " +
		                               movie.getYear());
		        }
		    }
		
	}


