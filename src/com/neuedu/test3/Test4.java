package com.neuedu.test3;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 155;
		//90-100��
		//80-89��
		//70-79��
		//60-69����
		//60���²�����
		
		if(score<0||score>100)
		{
			System.out.println("���벻�Ϸ�");
			return;//��������
		}
		switch( score /10)
		{
		case 10:
		case 9:
			System.out.println("��");
			break;
		case 8:
			System.out.println("��");
			break;
		case 7:
			System.out.println("��");
			break;
		case 6:
			System.out.println("����");
			break;
		default :
			System.out.println("������");
			break;
		}
		

		
		
	}

}
