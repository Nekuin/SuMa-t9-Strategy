package app;

import java.util.ArrayList;
import java.util.List;

public class StrategyMain {

	public static void main(String[] args) {
		Converter c = new Converter();
		List<Integer> ints = new ArrayList<>();
		for(int i = 0; i < 50; i++) {
			ints.add(i);
		}
		
		ListConverter arc = new ArrayConverter();
		ListConverter itc = new IteratorConverter();
		ListConverter lapc = new ListApiConverter();
		c.useConverter(itc);
		System.out.println("itc: \n" + c.convert(ints));
		System.out.println("\n\n\n");
		c.useConverter(arc);
		System.out.println("arc: \n" + c.convert(ints));
		System.out.println("\n\n\n");
		c.useConverter(lapc);
		System.out.println("lapc: \n" + c.convert(ints));
	}

}
