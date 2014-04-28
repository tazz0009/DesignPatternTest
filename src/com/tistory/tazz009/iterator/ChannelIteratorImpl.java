package com.tistory.tazz009.iterator;

import java.util.List;

public class ChannelIteratorImpl implements ChannelIterator {

	private ChannelTypeEnum type;
	private List<Channel> channels;
	private int position;
	
	public ChannelIteratorImpl() {
	}
	
	public ChannelIteratorImpl(ChannelTypeEnum type, List<Channel> channels) {
		super();
		this.type = type;
		this.channels = channels;
	}

	@Override
	public boolean hasNext() {
		while (position < channels.size()) {
			Channel c = channels.get(position);
			if (c.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
				return true;
			} else {
				position++;
			}
		}
		return false;
	}

	@Override
	public Channel next() {
		Channel c = channels.get(position);
		position++;
		return c;
	}

}
