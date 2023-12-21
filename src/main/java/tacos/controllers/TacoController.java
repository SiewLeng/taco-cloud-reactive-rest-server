package tacos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;
import tacos.datas.TacoDto;
import tacos.services.TacoService;
import tacos.tables.Taco;

@RestController
@RequestMapping(path="/api/tacos", consumes="application/json", produces="application/json")
public class TacoController {
	
	@Autowired
	TacoService tacoService;
	
	@PostMapping("")
	public ResponseEntity<Mono<Taco>> saveTaco(@RequestBody TacoDto tacoDto) {
		System.out.println("tacoDto.ingredientIds" + tacoDto.getIngredientIds());
		Mono<Taco> tacoCreated = tacoService.saveTaco(tacoDto);
		return new ResponseEntity<>(tacoCreated, HttpStatus.OK);
	}
	
}


