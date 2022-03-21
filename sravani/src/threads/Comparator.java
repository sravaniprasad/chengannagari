package threads;

import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie>
		{
		   
			private double rating;
		    private String name;
		    private String review;
			
		  
		    public int compareTo(Movie m)
		    {
		    	if(this.getRating()>m.getRating()) {
		    		return 1;
		    		}
		    		else {
		    			return -1;
		    	      }
		    }
		    
		    public Movie(String nm, double rt, String string) {
				
		    	this.name = nm;
		        this.rating = rt;
		        this.review = string;
			}

			public double getRating() 
		    { return rating; 
		      }
		    public String getName()   
		    {  return name; 
		      }
		    public String getReview()     
		    {  return review; 
		    }
		}
		 
		
		public class Comparator {
		
		    public static void main(String[] args)
		    {
		        ArrayList<Movie> list = new ArrayList<Movie>();
		        list.add(new Movie("sravani  ", 8.3, "      good"));
		        list.add(new Movie("sravanthi", 6.7, "      bad"));
		        list.add(new Movie("deepa    ", 7.8, "      average"));
		        list.add(new Movie("sweety   " , 9.4,"      excellent"));
//		          System.out.println(list+"\n");
//		        Collections.sort(list);
		 
		        System.out.println("Movies after sorting : ");
		       
		        	System.out.println("========================================================");
		        	System.out.println("p.name\t\tp.rating\tp.review");
		        	System.out.println("========================================================");
		        	 for (Movie movie: list)
				        {
		            System.out.println(movie.getName() + "      " +movie.getRating() + "      " +movie.getReview());
		        }
		    }
		}
	