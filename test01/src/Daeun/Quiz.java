package Daeun;

import java.util.*;

public class Quiz {
	public static void main(String[] args) {
		int n;
		int m;
		/*
		 * ������� �Է°� n�� ���� �������� m���� ����.
		 * 
		 * m���� 1~10^n�� �� �߿��� �������� ����
		 * 1�� �Է½� 1~10
		 * 2�� �Է½� 1~100
		 * 3�� �Է½� 1~1000
		 */ 
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
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
		