//Develop a java class with a method saveEvenNumbers(int N) 
//using ArrayList to store even numbers from 2 to N, where N is a 
//integer which is passed as a parameter to the method 
//saveEvenNumbers().
package assignmentCollection;

import java.util.LinkedList;

public class LinkedListQ1 {
		// TODO Auto-generated method stub
		 LinkedList<Integer> list = new LinkedList<Integer>();
			
			LinkedList<Integer> saveEvenNumbers(int N) {
            list = new LinkedList<Integer>();
				
				
				for (int i = 2; i <= N; i++) {
					if (i % 2 == 0) list.add(i);
				}
				
				return list;
			}
			public LinkedList<Integer> printEvenNumbers() {
				LinkedList<Integer> newList = new LinkedList<Integer>();
			
			
				
				for (int item : list) {
					newList.add(item * 2);
					System.out.println(item * 2);
				}
				
				return newList;
			}

			public static void main(String[] args) {
				ArraylistQ1 a = new ArraylistQ1();
				a.saveEvenNumbers(20);
				a.printEvenNumbers();
				

			}

		}


