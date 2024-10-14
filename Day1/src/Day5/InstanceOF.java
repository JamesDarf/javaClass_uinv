package Day5;

class Individual {}  // Person -> Individual
class Learner extends Individual {}  // Student -> Learner
class Researcher extends Individual {}
class Professor extends Researcher {}

public class InstanceOF {
	static void print(Individual p) {
		if (p instanceof Professor)
			System.out.println("Professor");
		else if (p instanceof Researcher)
			System.out.println("Researcher");
		else if (p instanceof Learner)
			System.out.println("Learner");
		else if (p instanceof Individual)
			System.out.println("Individual");
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.print("new Learner() -> \t"); print(new Learner());
		System.out.print("new Researcher() -> \t"); print(new Researcher());
		System.out.print("new Professor() -> \t"); print(new Professor());
	}
}
