package com.neuedu.test3;

public class Test5 {
public static void main(String[] args) {
	      
	//1+2+��������+100���
	      int x=1;
	      int sum=0;
	      while(x<=100)
	      {   sum+=x;
	          x++;
          }
	    System.out.println("sum="+sum);
	
	//��׳�
	    int sum1=1;
	    int i=8;
	    while(i>=1)
	    {
	    	sum1*=i;
	    	i--;
	    }
	    System.out.println("sum1="+sum1);		
	
	    
	 //1+1/2+1/3-1/4+.....1/100
	    
	    double sum2=0;
	    double x1=1;
	    while(x1<=100)
	    {
	    	sum2+=1/x1;
	    	x1++;
	    	
	    }
	    System.out.println(sum2);
	    
	    
	  //4%��Ϣ��10000������
   	 double sum3=10000;
   	 int i1=0;
   	 
   	 //i�ǿ���ѭ�������ģ�����ѭ������
   	 while(i1<3)
   	 {   
   		 
   		 sum3*=(1+0.04);//10000������ϵ�һ�����Ϣ
   		 i1++;
   	 }
   	  
   	System.out.println(sum3);  
	    
	    
	    
	    
	    
	    
  }
}
