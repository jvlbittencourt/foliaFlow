# Sistema de Gestão de Blocos de Carnaval

## Descrição
Este projeto foi proposto como parte da 1ª avaliação de conhecimento da disciplina de PROGRAMAÇÃO ORIENTADA A OBJETOS, do curso de SISTEMAS DA COMPUTAÇÃO pela Universidade Federal Fluminense - UFF tem como objetivo implementar um sistema de gestão de blocos de Carnaval. Ele permite o cadastro de blocos de rua, controle de foliões, recomendações baseadas em preferências musicais e cálculo da estimativa de público para cada bloco.

## Funcionalidades
- **Cadastro de Blocos**: Blocos podem ser cadastrados com informações como nome, estilo musical, bairro, data, horário, e mais.
- **Evitar Conflitos de Horários**: O sistema verifica se já existe um bloco no mesmo horário e local, sugerindo um novo horário em caso de conflito.
- **Cadastro de Foliões**: Foliões podem registrar suas preferências musicais, região e favoritos.
- **Avaliações e Favoritos**: Foliões podem avaliar blocos de rua e marcar como favoritos. O sistema usa essas informações para calcular a estimativa de público.
- **Recomendações de Blocos**: O sistema sugere blocos com base nas preferências musicais e localização do folião.
- **Estimativa de Público**: O sistema calcula a estimativa de público para cada bloco, considerando avaliações, favoritos e histórico de foliões.

## Como rodar
1. Clone este repositório:
    ```bash
    git clone <url-do-repositório>
    ```
2. Compile o código:
    ```bash
    javac Main.java
    ```
3. Execute o programa:
    ```bash
    java Main
    ```

## Licença
Este projeto é licenciado sob a licença MIT.
