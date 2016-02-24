package controller;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import model.Model;
import view.View;

public class WSGenerico<T extends Model<?>, E extends View<T>> {
	
	private Class<E> viewClass;
	
	public WSGenerico(Class<E> viewClass) {
		this.viewClass = viewClass;
	}
	
	public List<E> getViews(List<T> models) {
		List<E> views = new ArrayList<>();
		for(T model : models) {
			try {
				Constructor<E> constructor = viewClass.getConstructor(model.getClass());
				E entity = constructor.newInstance(model);
				views.add(entity);
			} catch (InstantiationException 
					| IllegalAccessException 
					| NoSuchMethodException
					| SecurityException 
					| IllegalArgumentException 
					| InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		return views;
	}
	
}
