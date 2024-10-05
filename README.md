# Projeto API Rest - Luís Gustavo Maia

## Detalhamento do Time

Este projeto foi desenvolvido integralmente por **Luís Gustavo Maia** 

### Entidades e Endpoints

- **Ator**
  - GET /ator
  - POST /ator
  - PUT /ator/{id}
  - DELETE /ator/{id}
  - Criou o AtorService, AtorRepository e o model Ator anotado com `@Entity`.

- **Cinematografia**
  - `GET /cinematografias`
  - `GET /cinematografias/{id}`
  - `GET /cinematografias/filme/{filmeId}`
  - `POST /cinematografias`
  - Inclui os métodos no `CinematografiaService`, `CinematografiaRepository` e a entidade `Cinematografia` anotada com `@Entity`.

- **Crítica**
  - `GET /criticas`
  - `GET /criticas/{id}`
  - `GET /criticas/filme/{filmeId}`
  - `POST /criticas`
  - Inclui os métodos no `CriticaService`, `CriticaRepository` e a entidade `Critica` anotada com `@Entity`.

- **Diretor**
  - GET /diretor
  - POST /diretor
  - PUT /diretor/{id}
  - DELETE /diretor/{id}
  - Também criou o DiretorService, DiretorRepository e o model Diretor anotado com `@Entity`.

- **Filme**
  - `GET /filmes`
  - `GET /filmes/{id}`
  - `POST /filmes`
  - `PUT /filmes/{id}`
  - `DELETE /filmes/{id}`
  - Inclui os métodos no `FilmeService`, `FilmeRepository` e a entidade `Filme` anotada com `@Entity`.

- **Produtor**
  - `GET /produtores`
  - `GET /produtores/{id}`
  - `GET /produtores/buscar/{nome}`
  - `POST /produtores`
  - Inclui os métodos no `ProdutorService`, `ProdutorRepository` e a entidade `Produtor` anotada com `@Entity`.

- **Trilha Sonora**
  - `GET /trilhas`
  - `GET /trilhas/{id}`
  - `GET /trilhas/compositor/{compositor}`
  - `POST /trilhas`
  - Inclui os métodos no `TrilhaSonoraService`, `TrilhaSonoraRepository` e a entidade `TrilhaSonora` anotada com `@Entity`.

- **Gênero**
  - `GET /genero`
  - `GET /genero/{id}`
  - `POST /genero`
  - `PUT /genero/{id}`
  - `DELETE /genero/{id}`

  Também criou o `GeneroService`, `GeneroRepository` e o model `Genero` anotado com `@Entity`.
