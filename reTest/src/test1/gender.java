package test1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class gender {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] arr = {"010102-4", "991012-1", "960304-1", "881012-2", "040403-3"};
		

		char[] ary = new char[7];
		for(int i=0; i < ary.length; i++) {
//			if
		}
		
		
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm:ss:S");
		SimpleDateFormat md = new SimpleDateFormat("MMdd");
		
		String a = (md.format(date));
		int m = Integer.parseInt(a);
		
		System.out.println(sdf.format(date));
		
		System.out.println("생년");
		String num = scanner.nextLine();
		int num1 = scanner.nextInt();
//		System.out.println("월일");
//		int num2 = scanner.nextInt();
		
		
		System.out.println("나이 : " + (2020-num1+1) + "살");
		
		char[] arr1 = new char[6];
		for(int i =0; i<arr1.length; i++) {
			if(i < 3) {
				arr1[i] = '0';
			}else {
				arr1[i] = num.charAt(i);
			}
			System.out.print(arr1[i]);
//			System.out.println("입력한 생년월일 : " + arr1[i], "나이 : " + num1);
		}
		
	}

	
	
	
}
