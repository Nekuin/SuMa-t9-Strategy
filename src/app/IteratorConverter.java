package app;

import java.util.Iterator;
import java.util.List;

public class IteratorConverter implements ListConverter {

	@Override
	public <E> String convertList(List<E> list) {
		Iterator<E> itr = list.iterator();
		StringBuilder b = new StringBuilder();
		while(itr.hasNext()) {
			b.append(itr.next().toString() + "\n");
		}
		return b.toString();
	}

}
