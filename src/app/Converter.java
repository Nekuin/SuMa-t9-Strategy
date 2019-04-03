package app;

import java.util.List;

public class Converter {
	
	private ListConverter converter;
	
	public Converter() {
		
	}
	
	public Converter(ListConverter converter) {
		this.converter = converter;
	}
	
	public void useConverter(ListConverter converter) {
		this.converter = converter;
	}
	
	public <E> String listToString(List<E> list) {
		return converter.convertList(list);
	}

}
