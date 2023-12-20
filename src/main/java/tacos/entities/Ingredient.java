package tacos.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name="ingredients")
public class Ingredient {
	
	@Id
	private Long id;
	
	private String name;

	private Type type;
	
	public enum Type {
		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
	}
	
	public Ingredient() {
		this.id = null;
		this.name = null;
		this.setType(null);
	}

	public Ingredient(String name, Type type) {
		this.name = name;
		this.type = type;
	}
	
	public Long getId() {
		return id;
	}

	public void setName(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
