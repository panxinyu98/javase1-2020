package com.neuedu.test;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             char a='a';
             char b='��';
             char c='\uBBBB';
             char d='\t';
             char f='\'';
             char g='\\';
             /*
              * \r �ص�����
              * \n ����
              * 
              * \b�ո�
              * 0-9�� ʮ���� 48
              * A-Z:ʮ����65
              * a-z��ʮ����97
              * 
              * 
              * */
             
             System.out.println(a);
             System.out.println(c);
             System.out.println(d);
             System.out.println(b);
             System.out.println(f);
             System.out.println(g);
             
             
             System.out.println("escape\\bchar");
             System.out.println("escape\\tchar");
             System.out.println("escape\\rchar");
             System.out.println("escape\\nchar");
             System.out.println("\\����б����\\");
             System.out.println("\'���ڵ�������\'");
             System.out.println("'��û�е�����'");
             System.out.println("\"����˫������\"");
             System.out.println("��û��˫����");

             boolean flag=true;
             boolean flag2=false;
             
             
             
             
             

	}

}
