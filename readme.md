## Sumário

- [Resumo do Projeto](#resumo-do-projeto)
- [Documentação do Projeto Terminal de Busca](#documentação-do-projeto-terminal-de-busca)
    - [TerminalDeBuscaApplication](#terminaldebuscaapplication)
    - [Item](#item)
    - [ItemRepository](#itemrepository)
    - [ItemController](#itemcontroller)
    - [TerminalDeBuscaApplicationTests](#terminaldebuscaapplicationtests)

## Resumo do Projeto

O projeto Terminal de Busca é uma aplicação Spring Boot que permite a gestão de itens através de uma interface RESTful. Ele inclui funcionalidades para criar, ler, atualizar e deletar itens, que são armazenados em um banco de dados. A aplicação é composta por várias classes principais, incluindo a classe de inicialização, entidades JPA, repositórios e controladores. Além disso, há uma classe de testes para garantir que o contexto da aplicação seja carregado corretamente.

## <span style="color:blue">Documentação do Projeto Terminal de Busca</span>

![Imagem do Terminal](Imagemterminal2.jpg)

### <span style="color:green">TerminalDeBuscaApplication</span>

**Descrição:**  
A classe principal que inicia a aplicação Spring Boot.

**Método Principal:**  
Contém o método `main`, ponto de entrada da aplicação.

**Anotações:**
- `@SpringBootApplication`: Indica uma aplicação Spring Boot.

### <span style="color:green">Item</span>

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

### <span style="color:green">ItemRepository</span>

**Descrição:**  
Interface que estende JpaRepository para operações CRUD na entidade Item.

**Métodos Herdados:**
- `save`
- `findAll`
- `findById`
- `delete`

### <span style="color:green">ItemController</span>

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

### <span style="color:green">TerminalDeBuscaApplicationTests</span>

**Descrição:**  
Classe de teste que verifica se o contexto da aplicação carrega corretamente.

**Método de Teste:**
- `contextLoads`: Testa se o contexto carrega sem problemas.

**Anotações:**
- `@SpringBootTest`: Indica uma classe de teste Spring Boot.
- `@Test`: Indica um caso de teste.
