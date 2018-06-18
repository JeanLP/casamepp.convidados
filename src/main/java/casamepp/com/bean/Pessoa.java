package casamepp.com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "pessoa")
public class Pessoa {
	
	@Id
	@Column(name="id")
	private int id;
	
    @Column(name="nome")
    private String nome;

	public int getId() {
		return id;
	}

	public void setId(int i) {
		this.id = i;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}  
    
    

}
