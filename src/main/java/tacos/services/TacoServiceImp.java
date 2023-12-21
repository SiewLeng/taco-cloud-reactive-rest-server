package tacos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import tacos.datas.TacoDto;
import tacos.repositories.TacoIngredientRepository;
import tacos.repositories.TacoRepository;
import tacos.tables.Taco;
import tacos.tables.TacoIngredient;

@Service
public class TacoServiceImp implements TacoService {
	
	@Autowired 
	TacoRepository tacoRepository;
	
	@Autowired 
	TacoIngredientRepository tacoIngredientRepository;
	
	@Override
	public Mono<Taco> saveTaco(TacoDto tacoDto) {
		tacoRepository.save(new Taco(tacoDto.getName()))
		.map(taco -> taco.getId())
		.map(tacoId -> {
			for (Long ingredientId : tacoDto.getIngredientIds()) {
				tacoIngredientRepository.save(new TacoIngredient(tacoId, ingredientId)).subscribe();
			}  
			return tacoId;
		}).subscribe();
		return Mono.just(new Taco(tacoDto.getName()));
	}
}
