package com.neuedu.test;

public class Testlianxi {
	public static void main(String[] args) {
		
		//1.��֪a,b�������ͱ�����д����a,b���������е�ֵ�����ĳ���	
 int a=1;
 int b=2;
 int c;
    c=a;
	a=b;
	b=c;
	System.out.println(a);
	System.out.println(b);
	//2.����һ��0��1000�����������λ���ĺͣ�����345�Ľ����3+4+5��12ע���ֽ����ּȿ����ȳ���ģҲ������ģ�����
    //�ȳ���ģ n/λ��%10
	
	int m=345;
    int sum;
        sum=(m/100)+(m/10%10)+(m%10);
	
         System.out.println(sum);
	

//3.�����¶Ⱥ������¶Ȼ���ת�����ӻ��϶ȱ�����϶���ֻҪ��ȥ32������5�ٳ���9�����ˣ������϶�ת�ɻ��϶ȣ�ֱ�ӳ���9������5���ټ���32���С�

      double s=32.5;
      double h=s*9/5+32;
      System.out.println(h);
      
      double s1=(h-32)*5/9;
      System.out.println(s1);
    		  
         
         
         
         
         
         
         
         
         
         
         
         
         
         

//4.����һ������Ĵ�д��ĸA~Z��ת��ΪСд��ĸ��
char c1='A';
char c2=(char)(c1+32);

System.out.println(c2);








	
	
	
	
	
	
	
	}
	
}
