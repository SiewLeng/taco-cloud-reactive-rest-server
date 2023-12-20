package tacos.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name="tacos")
public class Taco {
	
	@Id
	private Long id;

	private String name;
	
	private Date createdAt;
	
	public Taco() {
		this.id = null;
		this.name = null;
		this.createdAt = null;
	}
	
	public Taco(Long id, String name) {
		this.id = id;
		this.name = name;
		this.setCreatedAt();
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

	public Date getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt() {
		this.createdAt = new Date();
	}
	
}
