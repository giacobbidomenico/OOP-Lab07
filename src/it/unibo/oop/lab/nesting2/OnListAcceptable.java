package it.unibo.oop.lab.nesting2;

import java.util.List;

public class OnListAcceptable<T> implements Acceptable<T> {
	
	private final List<T> list;
	
	public OnListAcceptable(final List<T> list){
		this.list = list;
	}
	
	@Override
	public Acceptor<T> acceptor() {
		return null;
	}
}
