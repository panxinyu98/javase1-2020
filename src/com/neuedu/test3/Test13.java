package com.neuedu.test3;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//20.��дһ�������ҳ�����200����С��������

		for(int num=200;;num++) 
		{	
        boolean flag=true;//������
         for(int i=2;i<=num-1;i++)
        {       
        	
        	if(num%i==0)
        	{
        		flag=false;//��������
        		//������
        		//System.out.println("��������");
        		break;
        	
        	}
        }
        
        if(flag)//һ����û����
        {	
        //break ����
        //System.out.println("������");
        //�ҵ�����
        System.out.println(num);
        break;
        
        }
	
		}
	}
}
