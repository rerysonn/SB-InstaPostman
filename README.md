# InstaPostman

Este é um projeto criado em Java usando o framework Spring Boot e o banco de dados MongoDB. O objetivo principal deste projeto é gerenciar entidades de usuários, postagens e comentários, permitindo operações de CRUD (Criar, Ler, Atualizar e Deletar) apenas para a entidade de usuários. Além disso, oferece recursos para localizar postagens e comentários específicos.

### Funcionalidades Principais

O projeto oferece as seguintes funcionalidades principais:

1. **Gerenciamento de Usuários**:
   - Cadastro de novos usuários.
   - Atualização de informações de usuários existentes.
   - Recuperação de informações de usuários por ID.
   - Exclusão de usuários.

2. **Localização de Postagens e Comentários**:
   - Pesquisa por postagens ou comentários que correspondam a critérios específicos, como texto em postagens e comentários, ou datas de postagens e comentários dentro de um intervalo específico.

### Configuração do Projeto

Antes de iniciar o projeto, certifique-se de ter as seguintes ferramentas e dependências instaladas:

- Java SDK
- Spring Boot
- MongoDB
- Mongo Compass (para visualizar as instâncias do MongoDB)
- Postman

### Banco de Dados Relacionados a Agregados - Conceito
Em bancos de dados relacionados a agregados, os dados são modelados de forma a agrupar informações relacionadas em uma única unidade, chamada de "agregado". Essa abordagem é particularmente útil para estruturar dados em um formato que reflita a semântica natural dos objetos do mundo real e suas relações. Cada agregado contém uma raiz e uma ou mais entidades associadas, encapsulando o acesso e a manipulação de dados.

No MongoDB, um banco de dados NoSQL orientado a documentos, os agregados são frequentemente representados como documentos JSON aninhados. Considere um exemplo simples de um sistema de blog onde temos postagens e comentários.

### Executando o Projeto

1. Clone este repositório para o seu ambiente local.
2. Configure a conexão com o banco de dados MongoDB no arquivo de configuração `application.properties`.
3. Compile e execute o projeto.
4. Use o Postman ou outra ferramenta de API para interagir com as funcionalidades da aplicação.

### Modelo conceitual
![image](https://github.com/rerysonn/workshop-springboot-mongodb/assets/119504068/16bd51e4-48ad-437d-ac2e-56c0a7b051eb)


### Contribuições

Se você deseja contribuir para este projeto, siga os seguintes passos:

1. Crie um fork deste repositório.
2. Faça as alterações desejadas no seu fork.
3. Envie um pull request com uma descrição clara das suas alterações.

### Contato

Para qualquer dúvida ou sugestão, entre em contato conosco pelo: 
- Email: rerysonfarinha1@gmail.com
- Linkedin: www.linkedin.com/in/reryson-farinha

