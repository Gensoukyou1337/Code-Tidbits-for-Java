package com.gensoukyou1337.palindromecheck;

/*
 * A program to check whether a number is a palindrome and,
 * if it isn't, adds its reversed [in terms of digits] number.
 * This would loop until the number IS a palindrome.
 */
//If I had known about the StringBuilder library, I would've saved myself a load of trouble!

public class Main
{
	public static boolean checkPalindrome(int numCheck)
	{
		String numParse = Integer.toString(numCheck);
		if(numParse.equals(new StringBuilder(Integer.toString(numCheck)).reverse().toString())) {return true;} //If the string is equal to is reverse, return true.
		else{return false;}//Otherwise, return false.
	}
	
	public static int produceReverseNum(int numRef)
	{
		return Integer.parseInt(new StringBuilder(Integer.toString(numRef)).reverse().toString());
	}
	
	public static void main(String[] args)
	{
		int numPalin = 4140;
		while(checkPalindrome(numPalin) == false)
		{
			numPalin += produceReverseNum(numPalin);
		}
		System.out.println(numPalin);
	}

}
