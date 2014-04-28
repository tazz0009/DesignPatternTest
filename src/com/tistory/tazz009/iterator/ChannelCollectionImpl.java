package com.tistory.tazz009.iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {
	
	private List<Channel> channelList;

	public ChannelCollectionImpl() {
		this.channelList = new ArrayList<Channel>();
	}
	
	@Override
	public void addChannel(Channel c) {
		this.channelList.add(c);
	}

	@Override
	public void removeChannel(Channel c) {
		this.channelList.remove(c);
	}

	@Override
	public ChannelIterator iterator(ChannelTypeEnum type) {
		return new ChannelIteratorImpl(type, this.channelList);
	}

}
