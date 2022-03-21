package threads;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

		

		class Laptop implements Comparable<Laptop>{

		int ram;
		long price; 
		String brand;
		public int getRam() {
			return ram;
		}


		public Laptop(int ram, long price, String brand) {
			
			this.ram = ram;
			this.price = price;
			this.brand = brand;
		}


		public void setRam(int ram) {
			this.ram = ram;
		}
		public long getPrice() {
			return price;
		}
		public void setPrice(long price) {
			this.price = price;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}


		@Override
		public int compareTo(Laptop lap1) {
			if(this.getRam()>lap1.getRam()) {
			return 1;
			}
			else {
				return -1;
		      }
			
		}
		public class Demo {
			

			public  void main(String args[]) {
				List<Laptop> lap=new ArrayList();
				lap.add(new Laptop(8,40000,"dell"));
			    lap.add(new Laptop(16,30000,"hp"));
				lap.add(new Laptop(12,50000,"acer"));
				lap.add(new Laptop(4,40000,"apple"));
				Collections.sort(lap);
				for(Laptop l:lap) {
					System.out.println(l);
				}
			}
		}
		
		}
	