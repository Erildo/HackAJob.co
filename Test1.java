import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	private static Scanner input;
	public static int run(int[] student_list) {
		int single_student_number=-1;
		Arrays.sort(student_list);
		for(int i = 1; i < student_list.length; i++) {
		    if(student_list[i] != student_list[i - 1]) {
//		        System.out.println("Duplicate: " + student_list[i]);
		        single_student_number=student_list[i];
		    }
		}
		return single_student_number;
	}
	public static void main(String[] args) {

		input = new Scanner(System.in);
		Test1 t=new Test1();

		System.out.println("How many numbers do you want to enter?");
		int num = input.nextInt();

		int student_list[] = new int[num];
		System.out.println("Vendosni disa vlera");
		for (int i = 0 ; i < student_list.length; i++ ) {
			student_list[i] = input.nextInt();
		}
		Test1.run(student_list);

	}

}


