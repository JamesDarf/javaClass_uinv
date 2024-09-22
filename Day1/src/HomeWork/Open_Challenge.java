package HomeWork;
import java.util.Scanner;

public class Open_Challenge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// input the 철수
		System.out.println("철수 >>");
		String user1 = scanner.nextLine(); // 철수 입력 (가위, 바위, 보)

		// input the 영희
		System.out.println("영희 >>");
		String user2 = scanner.nextLine(); // 영희 입력 (가위, 바위, 보)

		// 무승부 case.
		if (user1.equals(user2)) {
			System.out.println("무승부 입니다.");
		} else { // winner 철수 case.
			if ((user1.equals("가위") && user2.equals("보")) ||
					(user1.equals("바위") && user2.equals("가위")) ||
					(user1.equals("보") && user2.equals("바위"))) {
				System.out.println("철수가 이겼습니다!!!!!!!!!!");
			} else { // else winner 영희.
				System.out.println("영희가 이겼습니다!!!!!!!!!!");
			}
		}
		scanner.close();
	} // main
}

