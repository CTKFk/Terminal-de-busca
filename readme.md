## Documentação do Projeto Terminal de Busca

![Imagem do Terminal](Imagemterminal2.jpg)

### TerminalDeBuscaApplication

**Descrição:**  
A classe principal que inicia a aplicação Spring Boot.

**Método Principal:**  
Contém o método `main`, ponto de entrada da aplicação.

**Anotações:**
- `@SpringBootApplication`: Indica uma aplicação Spring Boot.

### Item

**Descrição:**  
Representa um item com identificador, nome e preço. É uma entidade JPA mapeada para uma tabela de banco de dados.

**Atributos:**
- `id`: Identificador único, gerado automaticamente.
- `name`: Nome do item.
- `price`: Preço do item.

**Métodos:**  
Métodos getter e setter para acessar e modificar os atributos.

**Anotações:**
- `@Entity`: Indica uma entidade JPA.
- `@Id`: Especifica o identificador da entidade.
- `@GeneratedValue`: Define a estratégia de geração do identificador.

### ItemRepository

**Descrição:**  
Interface que estende JpaRepository para operações CRUD na entidade Item.

**Métodos Herdados:**
- `save`
- `findAll`
- `findById`
- `delete`

### ItemController

**Descrição:**  
Controladora que lida com requisições HTTP para a entidade Item, fornecendo endpoints para operações CRUD.

**Endpoints:**
- `GET /api/items`: Retorna todos os itens.
- `GET /api/items/{id}`: Retorna um item pelo identificador.
- `POST /api/items`: Cria um novo item.
- `PUT /api/items/{id}`: Atualiza um item existente.
- `DELETE /api/items/{id}`: Deleta um item pelo identificador.

**Anotações:**
- `@RestController`: Indica um controlador REST.
- `@RequestMapping`: Mapeia requisições HTTP para métodos manipuladores.
- `@Autowired`: Injeta automaticamente a dependência do repositório ItemRepository.

### TerminalDeBuscaApplicationTests

**Descrição:**  
Classe de teste que verifica se o contexto da aplicação carrega corretamente.

**Método de Teste:**
- `contextLoads`: Testa se o contexto carrega sem problemas.

**Anotações:**
- `@SpringBootTest`: Indica uma classe de teste Spring Boot.
- `@Test`: Indica um caso de teste.
