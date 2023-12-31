package tacos.tables;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name="tacos")
public class Taco {
	
	@Id
	private Long id;

	private String name;
	
	public Taco() {
		this.id = null;
		this.name = null;
	}
	
	public Taco(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
