package dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Produto;

public class ProdutoDAO extends DAO<Produto> {

	public ProdutoDAO() {
		super(Produto.class);
	}

	@Override
	public Produto find(Object id) {
		return Produto.builder().descricao("coca-cola").id(1L).validade(new Date()).valor(new BigDecimal("5435.9")).build();
	}
	
	@Override
	public List<Produto> findAll() {
		List<Produto> ps = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			ps.add(find(null));
		}
		return ps;
	}
	
}
