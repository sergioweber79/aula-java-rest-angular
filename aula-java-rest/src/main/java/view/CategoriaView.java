package view;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlValue;

import model.Categoria;

public class CategoriaView extends View<Categoria> {

	public CategoriaView() {
		super(Categoria.class);
	}
	
	public CategoriaView(Categoria categoria) {
		super(categoria);
	}
	
	@XmlValue
	public Long getId() {
		return entity.getId();
	}

	@XmlElement
	public String getDescricao() {
		return entity.getDescricao();
	}
	
}
