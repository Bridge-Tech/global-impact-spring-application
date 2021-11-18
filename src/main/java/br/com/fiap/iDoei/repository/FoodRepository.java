package br.com.fiap.iDoei.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.iDoei.model.Food;
import br.com.fiap.iDoei.model.Person;

public interface FoodRepository extends JpaRepository<Food,Long>{

	List<Food> findByisSelected(Boolean isSelected);

}
