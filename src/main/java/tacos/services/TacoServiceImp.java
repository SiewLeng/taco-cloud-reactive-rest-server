package tacos.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;
import tacos.entities.Taco;
import tacos.entities.TacoIngredient;
import tacos.repositories.TacoIngredientRepository;
import tacos.repositories.TacoRepository;

@Service
public class TacoServiceImp implements TacoService {
	
	@Autowired 
	TacoRepository tacoRepository;
	TacoIngredientRepository tacoIngredientRepository;
	
	@Override
	public Mono<Taco> saveTaco(Long id, String name, List<Long> ingredientIds) {
		Mono<Taco> taco = tacoRepository.save(new Taco(id, name));
		List<TacoIngredient> tacoIngredients = new ArrayList<TacoIngredient>();
		for (Long item: ingredientIds) {
			tacoIngredients.add(new TacoIngredient(id, item));
		}
		tacoIngredientRepository.saveAll(tacoIngredients);
		return taco;
	}

}
