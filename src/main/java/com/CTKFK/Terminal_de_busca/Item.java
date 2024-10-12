package com.CTKFK.Terminal_de_busca;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * A classe Item representa um item com um identificador, nome e preço.
 * 
 * <p>Esta classe é uma entidade JPA que mapeia para uma tabela de banco de dados.
 * Cada instância da classe Item corresponde a uma linha na tabela.</p>
 * 
 * <p>Os atributos da classe incluem:</p>
 * <ul>
 *   <li>id: O identificador único do item, gerado automaticamente pelo banco de dados.</li>
 *   <li>name: O nome do item.</li>
 *   <li>price: O preço do item.</li>
 * </ul>
 * 
 * <p>A classe fornece métodos getter e setter para acessar e modificar os atributos.</p>
 * 
 * <p>Anotações:</p>
 * <ul>
 *   <li>@Entity: Indica que a classe é uma entidade JPA.</li>
 *   <li>@Id: Especifica o identificador da entidade.</li>
 *   <li>@GeneratedValue: Define a estratégia de geração do valor do identificador.</li>
 * </ul>
 */
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
