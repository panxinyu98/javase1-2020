package com.neuedu.test3;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//�������������Լ��
		int m=8;
		int n=12;
		int result=1;
		int min=m<n?m:n;
		for(int i=1;i<min;i++)
		{
			if(m%i==0&&n%i==0)
			{
				result=i;
			}
				
		}
		
		System.out.println(m+"��"+n+"�����Լ����"+ result);
	}

}
