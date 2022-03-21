package javastreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Food{
	int itemno;
	String itemname;
	int price;
	
	Food(int itemno,String itemname,int price){
		this.itemno=itemno;
		this.itemname=itemname;
		this.price=price;
	}
	
}
public class AggregateFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Food i1=new Food(1,"roti",120);
		Food i2=new Food(1,"chapati",110);
		Food i3=new Food(1,"pau baaji",100);
		Food i4=new Food(1,"chicken",123);
		Food i5  =new Food(1,"vegetable rice",70);
		
		List<Food>foodlist=new ArrayList<>();
		foodlist.add(i1);
		foodlist.add(i2);
		foodlist.add(i3);
		foodlist.add(i4);
		foodlist.add(i5);
//		creating stream
//		Collection<String>collection=Arrays.asList("roti","chapati","paubaaji","chicken","vegetable rice");
//		Stream<String>Food=collection.stream();
//		Food.forEach(System.out::println);
		
		
		//calculate total amount of food
	
	int SumOfPrice=foodlist.stream().collect(Collectors.summingInt(id->id.price));
   System.out.println( SumOfPrice);	
   
   //calculating max food
  Food min= foodlist.stream().min((a,b)->a.price>b.price?1:-1).get();
   System.out.println(min.price);
   
   
   //calculating max food
   Food max= foodlist.stream().max((a,b)->a.price>b.price?1:-1).get();
   System.out.println(max.price);
   //calculating count
   double countPrice=foodlist.stream().filter(a->a.price>120).count();
   System.out.println(countPrice);
   

	}
	

}
