package com.neuedu.test3;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//100������꣬����4%�����¸�Ϣ��ÿ�¸�������Ϣ��ȡ12����Ϣ֮��Ҫȫ��ȡ���������ж���һ��0.3%�������ܸ�����
		double sum=1000000;
	 	double	sum1=sum;
		/*int i=0;
		 while(i<3)
	   	 {   
	   		 
	   		 sum*=(1+0.04);
	   		 i++;
	   	 }
	   	  
		 sum=(sum-1000000)/36;
	   	System.out.println("����Ϣ"+sum);

	 
	   		 
	   		 sum1*=(1+0.003);
	   		 sum1=sum1-sum*12;
	
	    
	    System.out.println("��Ϣ"+sum1);
	   	
	   	  */
	 	
	 	for(int i=0;i<3;i++)
	 	{
	 		sum=sum*(1+0.04);
	 	}
	 	sum=(sum-sum1)/36;
		System.out.println("����Ϣ"+sum);
		
		
		sum1*=(1+0.003);
		sum1=sum1-sum*12;
		System.out.println("��Ϣ"+sum1);	
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
		   
		
	}

}
