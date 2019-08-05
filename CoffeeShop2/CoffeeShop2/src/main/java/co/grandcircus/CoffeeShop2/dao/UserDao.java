package co.grandcircus.CoffeeShop2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.CoffeeShop2.entity.Users;


@Repository
@Transactional
public class UserDao {
	
	@PersistenceContext
	EntityManager em;
	
	public List<Users> findAll() {
	
	 List<Users> user = em.createQuery("FROM users", Users.class)
			.getResultList();
		return user;
	}

	public void create(Users user) {
		 em.persist(user);
		 System.out.println("UserDAO");
	}
	
	public void update(Users user) {  //edit
		em.merge(user);
		
	}
	
		
	public void delete(Long id) {
		Users user = em.getReference(Users.class, id);
		em.remove(user);
	}

}
