/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fu.demolive;

/**
 *
 * @author Hieu
 */
// Ta viet cai class de cung cap atien ich cho noi khac xai
// khi ta cung cap tien ich cho noi khac xa, do lai luc ta khong can nho cai gi
// cho reing ta, ham static giup lam dieu nay
public class DemoLIve {
	//n! = 1.2.3.4.5.6.7... n
	//Quy uoc: 0! = 1! = 1
	//20! la vua khop kieu long, kieu long toi da 18 con so 0
	//neu dua vao 1 so am, 21 giai thua, ta eo tinh, ta dap vao mat 1 cai ngoai le
	public static long getFactorial(int n) {
		if (n < 0 || n > 20)
			throw new IllegalArgumentException("Invalid argument. n must be between 0 an 20");
		// ham dung lien eo can return
		
		// xuong day la n= 0.. 20 roi
		if (n == 0 || n == 1)
			return 1;
		
		//xuong den day, n = 2 ..20 roi
		//choi for hoac de quy -recursion
		long product = 1;
		for (int i = 0; i < n; i++) {
			product *= i;
		}
		return product;
		

		
	}
	
}
