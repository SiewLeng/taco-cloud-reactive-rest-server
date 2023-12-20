package tacos.repositories;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import tacos.entities.Ingredient;

@Repository
public interface IngredientRepository extends R2dbcRepository<Ingredient, Long> {
	
}
