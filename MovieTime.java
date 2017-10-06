import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MovieTime {
	private static Scanner sc;

	public static void run(int nr_movies, int[] priorities, int[] start_times) {
		Integer[] second = 
				IntStream.range(0, priorities.length)
				.boxed()
				.map(x -> new AbstractMap.SimpleEntry<>(priorities[x], start_times[x]))
				.sorted(Comparator.comparing(SimpleEntry::getKey)).map(SimpleEntry::getValue).toArray(Integer[]::new);
		Arrays.sort(priorities);
		int[] out1 = Arrays.stream(second).mapToInt(Integer::intValue).toArray();

		for (int i = 0; i < priorities.length / 2; i++) {
			int temp = out1[i];
			out1[i] = out1[out1.length - i - 1];
			out1[out1.length - i - 1] = temp;
		}
		for (int i = 0; i <= priorities.length-1 ; i++) {
			for (int j = 0; j <= priorities.length - 1; j++) {
				if (Math.abs(out1[i] - out1[j]) < 2 && i != j) {
					out1[j] = 0;
				}

			}
		}
		// 6 2 3 5 2 7 =>2 2 3 5 6 7
		// 18 10 12 11 17 13 =>17 10 12 11 18 13
		String a = Arrays.toString(out1);
		System.out.println(a);
	}

	public static void main(String[] args) {
		System.out.println("Vendosni gjatesin");
		sc = new Scanner(System.in);
		int nr = sc.nextInt();
		int priorities[] = new int[nr];
		int start_times[] = new int[nr];
		System.out.println("Vendosni prioritet");
		for (int i = 0; i < priorities.length; i++) {
			priorities[i] = sc.nextInt();
		}
		System.out.println("Vendosni filmat");
		for (int i = 0; i < start_times.length; i++) {
			start_times[i] = sc.nextInt();
		}
		run(nr, priorities, start_times);
	}
}
