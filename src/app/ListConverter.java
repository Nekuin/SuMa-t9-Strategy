package app;

import java.util.List;

public interface ListConverter {
	public <E> String convertList(List<E> list);
}
