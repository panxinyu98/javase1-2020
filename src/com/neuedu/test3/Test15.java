package com.neuedu.test3;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�������������Լ��
		//����������ʼ���������ĵ�һ�����������Լ��
				int m=8;
				int n=12;
				int result=1;
				
				int min=m<n?m:n;
				
				for(int i=min;i>=1;i--)
				{
					if(m%i==0&&n%i==0)
					{
						result=i;
						break;
					}
						
				}
				
				System.out.println(m+"��"+n+" �����Լ����"+ result);
			}

	}


