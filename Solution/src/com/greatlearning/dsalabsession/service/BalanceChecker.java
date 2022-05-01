package com.greatlearning.dsalabsession.service;

import java.util.Stack;

public class BalanceChecker {
	public boolean balanceCheck(String s){
		int n = s.length();
		Stack<Character> checker = new Stack<Character>();
		if ( n == 0 ){
			return false;
		}
		else {
			char sinput[] = s.toCharArray();	
			for(int i=0; i< n;i++){
				if (sinput[i] == '(' || sinput[i] == '[' || sinput[i] == '{'){
					checker.push(sinput[i]);
					continue;
				}
				else {
					char pop = checker.pop();
					if (sinput[i] == ')'){
						if (pop != '(')
							return false; 
 					}
					if (sinput[i] == ']'){
						if (pop != '[')
							return false;
 
					}
					if (sinput[i] == '}'){
						if (pop != '{')
							return false; 
 					}
				}
			}
		}			
		return (checker.isEmpty());

	}
}
