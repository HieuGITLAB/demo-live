/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fu.demolive;

import java.util.regex.MatchResult;

/**
 *
 * @author Hieu
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		long res = DemoLive.getFactorial(5);
		System.out.println("expected: 5! = 120; actual: " + res);
		System.out.println("expected: 6! = 720;" + DemoLive.getFactorial(6));
		DemoLive.getFactorial(-5);
		System.out.println("expected: 2! = 2;" + DemoLive.getFactorial(2));
		System.out.println("expected: 1! = 1;" + DemoLive.getFactorial(1));
		System.out.println("expected: 3! = 6;" + DemoLive.getFactorial(3));
		System.out.println("expected: 4! = 24;" + DemoLive.getFactorial(4));
	}
	
	
}
