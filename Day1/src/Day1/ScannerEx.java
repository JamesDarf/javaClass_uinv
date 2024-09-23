package Day1;
import java.util.*;

public class ScannerEx {
	public static void main(String[] args)
	{
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
		Scanner scanner = new Scanner(System.in);

		String name = scanner.next();
		String city = scanner.next();
		int age = scanner.nextInt();
		double weight = scanner.nextDouble();
		boolean single = scanner.nextBoolean();

		System.out.println(name+'\n'+city+'\n'+age+'\n'+weight+'\n'+single);

		scanner.close();

	}
}
