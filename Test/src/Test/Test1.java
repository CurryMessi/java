package Test;

import java.util.Arrays;
import java.util.List;

public class Test1 {
	
	public static void main(String[] args) {
		String[] strings=new String[]{"a","b"};
		List<String> asList = Arrays.asList(strings);
		asList.add("C");
		System.err.println(asList.size());
	}
}
