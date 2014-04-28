package com.tistory.tazz009.iterator;

/**
 * ChannelCollection interface defines the contract for our collection class implementation. 
 * @author User
 *
 */
public interface ChannelCollection {

	public void addChannel(Channel c);
	
	public void removeChannel(Channel c);
	
	public ChannelIterator iterator(ChannelTypeEnum type);
	
}
