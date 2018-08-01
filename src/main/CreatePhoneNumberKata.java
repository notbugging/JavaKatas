package main;

//Kata from: https://www.codewars.com/kata/525f50e3b73515a6db000b83

//Write a function that accepts an array of 10 integers (between 0 and 9), 
//that returns a string of those numbers in the form of a phone number.
//Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
//The returned format must be correct in order to complete this challenge. 


public class CreatePhoneNumberKata {
	public static String createPhoneNumber(int[] numbers) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("(" + numbers[0] + numbers[1] + numbers[2]);
		stringBuilder.append(") " + numbers[3] + numbers[4] + numbers[5]);
		stringBuilder.append("-" + numbers[6] + numbers[7] + numbers[8] + numbers[9]);
		return stringBuilder.toString();
	}
}
