## Documentação do Projeto Terminal de Busca

### TerminalDeBuscaApplication

**Descrição:**  
TerminalDeBuscaApplication é a classe principal que inicia a aplicação Spring Boot.

**Método Principal:**  
Esta classe contém o método `main` que é o ponto de entrada da aplicação.

**Anotações:**
- `@SpringBootApplication`: Indica que esta é uma aplicação Spring Boot.

### Item

**Descrição:**  
A classe Item representa um item com um identificador, nome e preço. Esta classe é uma entidade JPA que mapeia para uma tabela de banco de dados. Cada instância da classe Item corresponde a uma linha na tabela.

**Atributos:**
- `id`: O identificador único do item, gerado automaticamente pelo banco de dados.
- `name`: O nome do item.
- `price`: O preço do item.

**Métodos:**  
A classe fornece métodos getter e setter para acessar e modificar os atributos.

**Anotações:**
- `@Entity`: Indica que a classe é uma entidade JPA.
- `@Id`: Especifica o identificador da entidade.
- `@GeneratedValue`: Define a estratégia de geração do valor do identificador.

### ItemRepository

**Descrição:**  
ItemRepository é uma interface que estende JpaRepository para fornecer operações CRUD para a entidade Item.

**Métodos Herdados:**
- `save`
- `findAll`
- `findById`
- `delete`

### ItemController

**Descrição:**  
ItemController é uma classe controladora que lida com requisições HTTP para a entidade Item. Esta classe fornece endpoints para operações CRUD na entidade Item.

**Endpoints:**
- `GET /api/items`: Retorna todos os itens.
- `GET /api/items/{id}`: Retorna um item pelo seu identificador.
- `POST /api/items`: Cria um novo item.
- `PUT /api/items/{id}`: Atualiza um item existente.
- `DELETE /api/items/{id}`: Deleta um item pelo seu identificador.

**Anotações:**
- `@RestController`: Indica que esta classe é um controlador REST.
- `@RequestMapping`: Mapeia requisições HTTP para métodos manipuladores.
- `@Autowired`: Injeta automaticamente a dependência do repositório ItemRepository.

### TerminalDeBuscaApplicationTests

**Descrição:**  
TerminalDeBuscaApplicationTests é uma classe de teste que verifica se o contexto da aplicação carrega corretamente.

**Método de Teste:**
- `contextLoads`: Testa se o contexto da aplicação carrega sem problemas.

**Anotações:**
- `@SpringBootTest`: Indica que esta é uma classe de teste Spring Boot.
- `@Test`: Indica que o método é um caso de teste.
