package tacos.repositories;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import tacos.entities.TacoIngredient;

@Repository
public interface TacoIngredientRepository extends R2dbcRepository<TacoIngredient, Long> {

}
