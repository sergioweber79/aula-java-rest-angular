package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public interface Model<T> {

	T getId();
	
}
