package tacos.services;

import reactor.core.publisher.Mono;
import tacos.datas.TacoDto;
import tacos.tables.Taco;

public interface TacoService {
	
	public Mono<Taco> saveTaco(TacoDto tacoDto);
	
}
