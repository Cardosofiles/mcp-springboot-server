# MCP Spring Boot Server

Este projeto é um servidor backend desenvolvido com [Spring Boot](https://spring.io/projects/spring-boot), projetado para fornecer APIs RESTful para gerenciamento de dados e integração com sistemas externos.

## Funcionalidades

- APIs REST para manipulação de entidades do domínio
- Integração com banco de dados relacional via Spring Data JPA
- Configuração de segurança e autenticação (Spring Security)
- Gerenciamento de dependências com Maven
- Suporte a testes automatizados

## Tecnologias Utilizadas

<div align="center">
	<code><img width="50" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/git.png" alt="Git" title="Git"/></code>
	<code><img width="50" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/java.png" alt="Java" title="Java"/></code>
	<code><img width="50" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/spring_boot.png" alt="Spring Boot" title="Spring Boot"/></code>
	<code><img width="50" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/maven.png" alt="Maven" title="Maven"/></code>
	<code><img width="50" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/postgresql.png" alt="PostgreSQL" title="PostgreSQL"/></code>
	<code><img width="50" src="https://raw.githubusercontent.com/marwin1991/profile-technology-icons/refs/heads/main/icons/docker.png" alt="Docker" title="Docker"/></code>
</div>

## Estrutura do Projeto

```
mcp-springboot-server/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── ... (código-fonte Java)
│   │   └── resources/
│   │       ├── application.properties (configurações)
│   │       └── ... (outros recursos)
│   └── test/
│       └── java/
│           └── ... (testes automatizados)
├── pom.xml (arquivo de dependências Maven)
└── README.md
```

## Como rodar o projeto

1. **Pré-requisitos:**

   - Java 17 ou superior
   - Maven 3.8+

2. **Clonar o repositório:**

   ```bash
   git clone <url-do-repositorio>
   cd mcp-springboot-server
   ```

3. **Configurar variáveis de ambiente (se necessário):**

   - Edite o arquivo `src/main/resources/application.properties` para ajustar configurações de banco de dados e portas.

4. **Build e execução:**

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

5. **Acessar a API:**
   - Por padrão, o servidor roda em `http://localhost:8080`

## Executando os testes

```bash
mvn test
```

## Contribuindo

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b minha-feature`)
3. Commit suas alterações (`git commit -am 'Adiciona nova feature'`)
4. Faça push para a branch (`git push origin minha-feature`)
5. Abra um Pull Request

---

<div align="center">
  <strong>Desenvolvido com ❤️ usando Spring Boot.</strong>
</div>

---

## 📫 Contato

<div align="center">

<a href="mailto:cardosofiles@outlook.com">
  <img src="https://img.shields.io/badge/Email-0078D4?style=for-the-badge&logo=microsoftoutlook&logoColor=white" alt="Email"/>
</a>
<a href="https://www.linkedin.com/in/joaobatista-dev/" target="_blank">
  <img src="https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn"/>
</a>
<a href="https://github.com/Cardosofiles" target="_blank">
  <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" alt="GitHub"/>
</a>
<a href="https://cardosofiles.dev/" target="_blank">
  <img src="https://img.shields.io/badge/Portfólio-222222?style=for-the-badge&logo=about.me&logoColor=white" alt="Portfólio"/>
</a>

</div>
