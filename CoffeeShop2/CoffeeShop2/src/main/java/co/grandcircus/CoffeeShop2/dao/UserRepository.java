package co.grandcircus.CoffeeShop2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.CoffeeShop2.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
	
	Users findByEmailAndPassword(String email, String password);

}
