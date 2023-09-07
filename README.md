# Projeto Exemplo com Arquitetura Hexagonal

Este é um projeto exemplo que demonstra o uso da arquitetura hexagonal em uma aplicação Java utilizando o framework Spring, 
banco de dados MongoDB e o sistema de mensagens assíncrono Kafka.

## Descrição

Este projeto tem como objetivo exemplificar a implementação de uma aplicação utilizando a arquitetura hexagonal. 
A arquitetura hexagonal, também conhecida como arquitetura de portas e adaptadores, é um padrão de arquitetura de software que visa 
separar as preocupações e facilitar a manutenção e testabilidade do código.

## Tecnologias Utilizadas

- Java
- Spring Framework
- MongoDB
- Apache Kafka

## Estrutura do Projeto

A estrutura do projeto é organizada em módulos para facilitar a separação das responsabilidades e a implementação da arquitetura hexagonal. Os principais módulos são:

- **application**: Contém os casos de uso da aplicação que representam os serviços que a aplicação oferece.
- **domain**: Define os objetos de domínio e as interfaces dos repositórios.
- **infra**: Implementa os detalhes de infraestrutura como o acesso ao banco de dados MongoDB e o sistema de mensagens Kafka.
- **web**: Contém os controladores e a configuração da API REST.

## Configuração

Antes de iniciar o projeto, certifique-se de ter o Java 17 e o MongoDB instalados em sua máquina. Também é necessário configurar um servidor Kafka.
