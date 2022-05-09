package test1;

import java.util.Scanner;

public class gender {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] arr = { "010102-4", "991012-1", "960304-1", "881012-2", "040403-3" };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].substring(7).equals("4")) {
				System.out.println(arr[i].substring(0, 7) + '3');
			}
			if (arr[i].substring(7).equals("1")) {
				System.out.println(arr[i].substring(0, 7) + '2');
			}
			if (arr[i].substring(7).equals("3")) {
				System.out.println(arr[i].substring(0, 7) + '4');
			}
			if (arr[i].substring(7).equals("2")) {
				System.out.println(arr[i].substring(0, 7) + '1');
			}
		}
	}

}
