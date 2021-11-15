package it.unibo.oop.lab.nesting2;

import java.util.Iterator;
import java.util.List;

public class OnListAcceptable<T> implements Acceptable<T> {
	
	private final List<T> list;
	
	public OnListAcceptable(final List<T> list){
		this.list = list;
	}
	
	@Override
	public Acceptor<T> acceptor() {
		return new Acceptor<T>() {
			private final Iterator<T> iter = list.iterator();
			
			@Override
			public void accept(T newElement) throws ElementNotAcceptedException {
				
				if((!iter.hasNext()) || (!newElement.equals(iter.next()))) {
					throw new ElementNotAcceptedException(newElement);
				}
				
			}

			@Override
			public void end() throws EndNotAcceptedException {
				
				if(iter.hasNext()) {
					throw new EndNotAcceptedException();
				}
				
			}
			
		};
	}
}
