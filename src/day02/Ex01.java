package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex01 {
	public static void main(String []args)throws IOException {
		
//		final String KOREA="���ѹα�";
//		System.out.println(KOREA);
//		
//		String KOREA="����";
//		System.out.println(KOREA);
		
//		Scanner scan= new Scanner(System.in);
//		
//		System.out.println("�̸��� �Է����ּ���");
//		String name= scan.next();
//		
//		System.out.println(name + "���� ���̸� �Է����ּ���");
//		int age=scan.nextInt();
//		
//		System.out.println("�̸� : "+name+"\n���� :" +age);
		
		
//		Scanner scan= new Scanner(System.in);
//		
//		System.out.println("����� �̸��� �����Դϱ�??");
//		String name=scan.next();
//		
//		System.out.println("���� ���� �Է� :");
//		double kor=scan.nextDouble();
//		System.out.println("���� ���� �Է� :");
//		double eng=scan.nextDouble();
//		System.out.println("���� ���� �Է� :");
//		double math=scan.nextDouble();
//		
//		double sum=kor+eng+math;
//		
//		System.out.println("===================");
//		System.out.println("�̸� :" + name);
//		System.out.println("===================");
//		System.out.println("���� :" +kor);
//		System.out.println("���� :" +eng);
//		System.out.println("���� :" +math);
//		System.out.println("===================");
//		System.out.println("�հ� :"+sum);
//		System.out.println("===================");
		
		BufferedReader read =new BufferedReader(
		new InputStreamReader(System.in));
		
		System.out.println("���� : 0");
		
		while(true) {
			String maple=read.readLine();
			int exit=Integer.parseInt(read.readLine());
			System.out.println(maple);
			if(exit==0) {
				break;
			}
		}
		
		
		
		
		
		
		
	}
}












