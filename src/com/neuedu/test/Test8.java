package com.neuedu.test;

public class Test8 {
public static void main(String[] args) {
	
	//��ֵ����
	
	int a=100;
	int b=a;
	b+=a;
	b-=a;
	b*=a;
	b/=a;
	System.out.println(b);
	//��ϵ����
	//> >= < <= == !=
	//��ϵ����Ľ����boolean
	
	System.out.println(a>b);//true
	boolean flag =a!=b;//false
	
	
	boolean x=true;
	boolean y=false;
	System.out.println(x&&y);//ȫΪtrue����Ϊtrue
	System.out.println(x||y);//һ��Ϊtrue������true
	System.out.println(!x);
	System.out.println(!y);
	System.out.println(x^y);//��ͬΪfalse����ͬΪtrue
	
	int a1=100;
	int b1=200; 
	int c1=300;
	//��·����
	boolean flag1=a1>b1 && b1++<c1;
	System.out.println(b1);
	
	boolean flag2=a1<b1 || b1++>c1;
	System.out.println(b1);
	
	// &,|����·
	
	int x1=200;
	int y1=300;
	int z1=400;
	
	boolean cc= x1>y1 & y1++<z1 ;
	System.out.println(y1);
	
	System.out.println("---------------------");
	
	//��Ԫ�����
	char sex='f';
	String str =sex =='f'?"Ů":"��";
	System.out.println(str);
	
	int xx=10;
	int yy=20;
	int zz=30;
	int max= xx>yy?xx:yy;
	max= max>=zz?max:zz;

	
	
	System.out.println(max);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
