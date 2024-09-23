
package Day1;
import java.util.Scanner;

public class Switch_ScannerEx2 {

	public static void main(String[] args)
	{
		char grade;
		Scanner scanner = new Scanner(System.in);

		System.out.println("점수를 입력해주세요. (1 - 100)");
		int score = scanner.nextInt();

		switch(score/10) {
			case 10, 9 :
				grade = 'A';
				break;
			case 8 :
				grade = 'B';
				break;
			case 7 :
				grade = 'C';
				break;
			default :
				grade = 'F';
				break;
		}

		System.out.println("학점은 " + grade + "입니다.");
		scanner.close();
	}
}
