package tacos.services;

import java.util.List;

import reactor.core.publisher.Mono;
import tacos.entities.Taco;

public interface TacoService {
	
	public Mono<Taco> saveTaco(Long id, String name, List<Long> ingredientIds);
	
}
