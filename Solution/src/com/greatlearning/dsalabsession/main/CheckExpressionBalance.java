package com.greatlearning.dsalabsession.main;

import com.greatlearning.dsalabsession.service.BalanceChecker;

public class CheckExpressionBalance {
	public static void main(String[] args) {
		String input = "[{()}]";
		BalanceChecker bc = new BalanceChecker();
		boolean check = bc.balanceCheck(input);
		if (check)
		{System.out.println("Balanced");}
		else{
			System.out.println("Unbalanced");
		}
	}
}
