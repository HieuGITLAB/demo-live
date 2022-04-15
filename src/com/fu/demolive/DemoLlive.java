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
public class DemoLlive {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		long res = DemoLIve.getFactorial(5);
		System.out.println("expected: 5! = 120; actual: " + res);
		System.out.println("expected: 6! = 720;" + DemoLIve.getFactorial(6));
		DemoLIve.getFactorial(-5);
	}
	
	
}
