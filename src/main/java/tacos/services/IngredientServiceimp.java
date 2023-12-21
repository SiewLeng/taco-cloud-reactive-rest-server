package tacos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import tacos.repositories.IngredientRepository;
import tacos.tables.Ingredient;

@Service
public class IngredientServiceImp implements IngredientService {
	
	@Autowired
	IngredientRepository ingredientRepository;
	
	@Override
	public Mono<Ingredient> save(Ingredient ingredient) {
		return ingredientRepository.save(ingredient);
	}
	
	@Override
	public Flux<Ingredient> getAllIngredients() {
		return ingredientRepository.findAll();
	}
	
	@Override
	public Mono<Ingredient> getIngredientById(Long id) {
		return ingredientRepository.findById(id);
	}
	
}
