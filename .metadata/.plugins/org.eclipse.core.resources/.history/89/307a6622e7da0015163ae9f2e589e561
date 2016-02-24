package controller;

import java.util.ArrayList;
import java.util.List;

import model.Model;
import view.View;

public class WSGenerico<T extends Model<?>, E extends View<T>> {
	
	private Class<E> clazz;
	
	public WSGenerico(Class<E> clazz) {
		this.clazz = clazz;
	}
	
	public List<E> getViews(List<T> models) {
		List<E> views = new ArrayList<>();
		for(T m : models) {
			try {
				E e = clazz.newInstance();
				e.setEntity(m);
				views.add(e);
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return views;
	}
	
}
