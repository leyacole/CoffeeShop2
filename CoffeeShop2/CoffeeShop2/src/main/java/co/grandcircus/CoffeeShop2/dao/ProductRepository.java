package co.grandcircus.CoffeeShop2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.CoffeeShop2.entity.Products;

public interface ProductRepository extends JpaRepository<Products, Long> {

	
}
