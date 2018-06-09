package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> fruit = new ArrayList<String>();
		//2. Add five Strings to your list
		fruit.add("Banana");
		fruit.add("kiwi");
		fruit.add("papaya");
		fruit.add("Watermelon");
		fruit.add("raspberry");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i<= fruit.size()-1 ; i++) {
			System.out.println(fruit.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for(String s:fruit) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		for(int i = 1; i <= fruit.size()-1 ; i+=2) {
			System.out.println(fruit.get(i));
		}
		//6. Print all the Strings in reverse order.
		for(int h = fruit.size()-1; h >= 0 ; h--) {
			System.out.println(fruit.get(h));
		}
		//7. Print only the Strings that have the letter 'e' in them.
	for(String x: fruit) {
		for(int a = 0; a < x.length(); a++) {
			if(x.charAt(a)=='e') {
			System.out.println(x);
			break;
			}
		}
	}
	}
}
