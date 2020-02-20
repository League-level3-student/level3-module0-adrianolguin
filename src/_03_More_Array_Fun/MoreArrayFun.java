package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.

	public static void main(String[] args) {
		// 2. Write a method that takes an array of Strings and prints all the Strings
		// in the array.

		// 3. Write a method that takes an array of Strings and prints all the Strings
		// in the array
		// in reverse order.

		// 4. Write a method that takes an array of Strings and prints every other
		// String in the array.

		// 5. Write a method that takes an array of Strings and prints all the Strings
		// in the array
		// in a completely random order. Almost every run of the program should result
		// in a different order.

	}

	void printStringArray(String[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			System.out.println(array[i]);
		}
	}

	void printStringArrayReverse(String[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			System.out.println(array[i]);
		}
	}

	void printStringArrayOther(String[] array) {
		for (int i = 0; i < array.length - 1; i += 2) {
			System.out.println(array[i]);
		}
	}

	void printStringArrayRandom(String[] array) {
	//have a new array of objects
		int counter = 0;
	String[] newPile = new String[array.length];
	//pick a random index
	Random r = new Random();
	for(int x = 0; x < array.length - 1; x++) {
	int random = r.nextInt(array.length - 1);
	for(int i = 0; i < counter; i++) {
	//check if the index object has already been transferred or not
		if(newPile[i].equals(array[random])) {
			
		} else {
			
		}
	//if so then get rid of the object in the new array
	//if not leave it place the object at random index into new array
	}
	}
	//i dont know
	}
}
