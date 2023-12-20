package tacos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import tacos.entities.Ingredient;
import tacos.services.IngredientService;

@RestController
@RequestMapping(path="/api/ingredients", consumes="application/json", produces="application/json")
public class IngredientController {
	
	@Autowired
	IngredientService ingredientService;
	
	@PostMapping(path="")
	public ResponseEntity<Mono<Ingredient>> createIngredient(@RequestBody Ingredient ingredient) {
		Mono<Ingredient> ingredientCreated = ingredientService.save(ingredient);
		return new ResponseEntity<>(ingredientCreated, HttpStatus.CREATED);
	} 
	
	@GetMapping(path="/{id}")
	public ResponseEntity<Mono<Ingredient>> findIngredientByid(@PathVariable(name="id") String id) {
		Mono<Ingredient> ingredient = ingredientService.getIngredientById(Long.parseLong(id));
		return new ResponseEntity<>(ingredient, HttpStatus.OK);
	}
	
	@GetMapping(path="")
	public ResponseEntity<Flux<Ingredient>> getAllIngredients() {
		Flux<Ingredient> ingredients = ingredientService.getAllIngredients();
		return new ResponseEntity<>(ingredients, HttpStatus.OK);
	}
}
