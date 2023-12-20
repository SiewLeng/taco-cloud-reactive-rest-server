package tacos.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name="tacos_ingredients")
public class TacoIngredient {
	
	@Id
	private Long id;
	private Long taco_id;
	private Long ingredient_id;
	
	public TacoIngredient() {
		this.taco_id = null;
		this.ingredient_id = null;
	}
	
	public TacoIngredient(Long tacoId, Long ingredientId) {
		this.taco_id = tacoId;
		this.ingredient_id = ingredientId;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getTacoId() {
		return taco_id;
	}
	
	public void setTacoId(Long tacoId) {
		this.taco_id = tacoId;
	}
	
	public Long getIngredientId() {
		return ingredient_id;
	}
	public void setIngredientId(Long ingredientId) {
		this.ingredient_id = ingredientId;
	}
	
}
