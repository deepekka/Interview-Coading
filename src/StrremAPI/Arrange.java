package StrremAPI;

import java.util.stream.Stream;

public class Arrange {

	public static void main(String[] args) {
		String[]s= {"deep","amar","vivek","arif","zzz","aaaa"};
		Stream<String> ss = Stream.of(s);
		ss.sorted().forEach(e->System.out.println(e));
	}
}
