/**
 * 
 */
package it.unibo.oop.lab.nesting2;

import java.util.Iterator;
import java.util.List;

/**
 * Implementation of the interface Acceptable
 * 	
 * @param <T>
 */
public class OnListAcceptable<T> implements Acceptable<T> {
	
	private final List<T> list;
	
	/**
     * Builds a new {@link OnListAcceptable}.
     * 
     * @param list
     *            the managed list
     */
	public OnListAcceptable(final List<T> list){
		this.list = list;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Acceptor<T> acceptor() {
		return new Acceptor<T>() {
			private final Iterator<T> iter = list.iterator();
			
			/**
			 *	{@inheritDoc}
			 */
			@Override
			public void accept(T newElement) throws ElementNotAcceptedException {
				
				if((!iter.hasNext()) || (!newElement.equals(iter.next()))) {
					throw new ElementNotAcceptedException(newElement);
				}
				
			}

			/**
			 * {@inheritDoc}
			 */
			@Override
			public void end() throws EndNotAcceptedException {
				
				if(iter.hasNext()) {
					throw new EndNotAcceptedException();
				}
				
			}
			
		};
	}
}