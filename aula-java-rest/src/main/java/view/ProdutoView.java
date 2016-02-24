package view;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import model.Categoria;
import model.Produto;

@XmlRootElement
public class ProdutoView extends View<Produto> {

	public ProdutoView() {
		super(Produto.class);
	}
	
	public ProdutoView(Produto produto) {
		super(produto);
	}
	
	@XmlElement
	public Long getId() {
		return entity.getId();
	}
	
	@XmlElement
	public String getDescricao() {
		return entity.getDescricao();
	}
	
	@XmlElement
	public BigDecimal getValor() {
		return entity.getValor();
	}
	
	@XmlElement
	public String getValidade() {
		return new SimpleDateFormat("dd/MM/yyyy").format(entity.getValidade());
	}
	
	@XmlElement
	public Long getCategoria() {
		Categoria c = entity.getCategoria();
		return c == null ? null : c.getId();
	}
	
}
