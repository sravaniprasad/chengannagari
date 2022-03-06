package java8;

import java.util.function.Predicate;

public class PredicateDemo  {
public boolean test(Integer t) {

	if(t>0) {
		return true;
	}
	else {
		return false;
	}
}
public static void main(String args[]) {
	//Predicate<Integer> p=new PredicateDemo();
	Predicate<Integer> p=t->(t>0);
	//Predicate<Integer> p1=t->(t<0);
	System.out.println(p.test(6));          // 6>0 t
	System.out.println(p.test(-6));
	System.out.println(p.test(-6));
	
	
	
}

}






































