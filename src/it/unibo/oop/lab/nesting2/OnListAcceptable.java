package it.unibo.oop.lab.nesting2;

import java.util.List;

public class OnListAcceptable<T> implements Acceptable {
	
	private final List<T> list;
	
	@Override
	public Acceptor<T> acceptor() {
		return null;
	}

}
