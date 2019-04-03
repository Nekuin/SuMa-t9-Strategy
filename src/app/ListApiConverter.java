package app;

import java.util.List;

public class ListApiConverter implements ListConverter {

	@Override
	public <E> String convertList(List<E> list) {
		StringBuilder sb = new StringBuilder();
		//offset by 1 so the first row doesn't look like 0 1 2 3
		for(int i = 1; i < list.size()+1; i++) {
			sb.append(list.get(i-1) + " ");
			if(i % 3 == 0) {
				sb.append("\n");
			}
		}
		return sb.toString();
	}

}
