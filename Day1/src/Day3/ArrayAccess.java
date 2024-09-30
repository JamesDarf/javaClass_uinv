package Day3;
import java.util.Scanner;


public class ArrayAccess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int intArr[] = new int[5];
		int max = 0;
		System.out.println("짝수 5개를 입력하시오.");
		for(int i = 0; i <= 4; i++) {
			intArr[i] = scanner.nextInt();
			if(intArr[i]>max)
				max = intArr[i];
		}
		System.out.println("가장 큰 수는" + max + "입니다. ");
		scanner.close();
	}

}
