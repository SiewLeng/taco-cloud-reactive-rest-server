package tacos.datas;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class TacoDto {
	
	private String name;
	
	private List<Long> ingredientIds;
	
	public TacoDto() {
		this.name = null;
		this.ingredientIds = new ArrayList<>();
	}
	
	public TacoDto(String name, List<Long> ingredientIds) {
		this.name = name;
		this.ingredientIds = ingredientIds;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Long> getIngredientIds() {
		return ingredientIds;
	}

	public void setIngredientIds(List<Long> ingredientIds) {
		this.ingredientIds = ingredientIds;
	}
	
}
