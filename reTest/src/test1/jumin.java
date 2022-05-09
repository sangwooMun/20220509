package test1;

import java.util.Calendar;
import java.util.Scanner;

public class jumin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 주민 번호 받기
		System.out.println("생년월일");
		String jm = scanner.nextLine();
		// substring(a, b) : 문자열의 a번째 문자부터 b-1번째 까지의 문자를 뽑아낸다.
		Calendar calender = Calendar.getInstance();
		int year = calender.get(Calendar.YEAR);
		System.out.println(year);
		System.out.print("입력한 생년월일 : " + jm.substring(0, 2) + jm.substring(2, 4) + jm.substring(4, 6) + ", ");
		System.out.println("나이 : " + (year - 2000 - Integer.parseInt(jm.substring(0, 2)) - 1 + "살"));


	}

}
