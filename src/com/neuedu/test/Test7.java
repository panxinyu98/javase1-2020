package com.neuedu.test;

public class Test7 {

	public static void main(String[] args) {
		int a=5;
		int b=2;
		
		double c=(double)(5/2); //2
		
		//a+b�ĺ��ǣ������ַ���ƴ��
		System.out.println("a+b�ĺ���"+(a+b));
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(c);
		//��ӡ�� ���ǰ೤
		String str= "ëë";
		System.out.println(str+"�ǰ೤");
		
		int money=5000;
		System.out.println("����"+money+"Ǯ");
		//�����еĸ���
		System.out.println(5/2);
		System.out.println(5/-2);
		System.out.println(-5/2);
		System.out.println(-5/-2);
		
		
		//ǰ���Ϊ������Ϊ����
		System.out.println(5%2);
		System.out.println(5%-2);
		System.out.println(-5%2);
		System.out.println(-5%-2);
		
		//�����Լ�
		int x=1;
		//���ú��
		//x++;
		//�ȼӺ���
		//++x;
		
		int y=x++;
		
		System.out.println(x);
		System.out.println(y);
		
		int h=1;
		h=h++;//h���䣬��Ч��
		System.out.println(h);
		
		int x1=3;
		int y1=5;
		
		int r1=x1++ + x1*y1;
		//�ַ��������ͱ�����+���� 
		System.out.println("x1="+x1+" y1="+y1 +" r1="+r1);
		
		
		
	}
}
