package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtils {

	private static EntityManagerFactory emf;
	
	private static EntityManager em;

	public static void criarConexao() {
		emf = Persistence.createEntityManagerFactory("rest");
	}

	public static EntityManager criarEntityManager() {
		return (em == null || !em.isOpen()) ? em = emf.createEntityManager() : em;
	}

	public static void fechaConexao() {
		if(em != null && em.isOpen()) {
			em.close();
		}
		emf.close();
	}
	
}