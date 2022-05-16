package day02;

import java.util.Scanner;

public class Ex01 {
	public static void main(String []args) {
		
//		final String KOREA="대한민국";
//		System.out.println(KOREA);
//		
//		String KOREA="북한";
//		System.out.println(KOREA);
		
//		Scanner scan= new Scanner(System.in);
//		
//		System.out.println("이름을 입력해주세요");
//		String name= scan.next();
//		
//		System.out.println(name + "님의 나이를 입력해주세요");
//		int age=scan.nextInt();
//		
//		System.out.println("이름 : "+name+"\n나이 :" +age);
		
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("당신의 이름은 무엇입니까??");
		String name=scan.next();
		
		System.out.println("국어 점수 입력 :");
		double kor=scan.nextDouble();
		System.out.println("영어 점수 입력 :");
		double eng=scan.nextDouble();
		System.out.println("수학 점수 입력 :");
		double math=scan.nextDouble();
		
		double sum=kor+eng+math;
		
		System.out.println("===================");
		System.out.println("이름 :" + name);
		System.out.println("===================");
		System.out.println("국어 :" +kor);
		System.out.println("영어 :" +eng);
		System.out.println("수학 :" +math);
		System.out.println("===================");
		System.out.println("합계 :"+sum);
		System.out.println("===================");
		
	}
}












