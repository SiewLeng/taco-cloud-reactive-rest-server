package tacos.services;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import tacos.entities.Ingredient;

public interface IngredientService {
	
	public Mono<Ingredient> save(Ingredient ingredient);
	
	public Flux<Ingredient> getAllIngredients();
	
	public Mono<Ingredient> getIngredientById(Long id);

}
