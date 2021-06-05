package pepilineAula;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

		Stream<Integer> stream1 = list.stream().map(x -> x * 10);// operação intermediária
		System.out.println("Stream 1: " + Arrays.toString(stream1.toArray()));// operação terminal

		int sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum list: " + sum);

		List<Integer> list2 = list.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.collect(Collectors.toList());
		
		System.out.println("List 2: "+Arrays.asList(list2.toArray()));
	}

}