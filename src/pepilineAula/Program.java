package pepilineAula;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

		Stream<Integer> stream1 = list.stream().map(x -> x * 10);//operação intermediária
		System.out.println("Stream 1: " + Arrays.toString(stream1.toArray()));//operação terminal
	}

}