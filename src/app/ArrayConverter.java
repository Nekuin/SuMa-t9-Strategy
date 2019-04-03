package app;

import java.util.List;

public class ArrayConverter implements ListConverter {

	@Override
	public <E> String convertList(List<E> list) {
		Object[] arr = list.toArray();
		StringBuilder sb = new StringBuilder();
		//offset by 1 so the first row doesn't look like 0 1 2
		for(int i = 1; i < arr.length+1; i++) {
			sb.append(arr[i-1] + " ");
			if(i % 2 == 0) {
				sb.append("\n");
			}
		}
		return sb.toString();
	}

}
