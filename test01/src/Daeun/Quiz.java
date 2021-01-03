package Daeun;

import java.util.*;

public class Quiz {
	public static void main(String[] args) {
		int n;
		int m;
		/*
		 * 사용자의 입력값 n에 따라 무작위의 m값을 산출.
		 * 
		 * m값은 1~10^n의 값 중에서 랜덤으로 지정
		 * 1을 입력시 1~10
		 * 2를 입력시 1~100
		 * 3을 입력시 1~1000
		 */ 
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력하세요 : ");
		n = sc.nextInt();
		
		m = (int) (Math.random() * (10^n));
		if(m > 26) {
			while (m >1 || m < 26) {
				m -= 26;
				
			}
		}
		char i = (char)m;
		System.out.print(i);
			}
		}
		