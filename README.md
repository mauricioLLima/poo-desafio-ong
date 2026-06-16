# Sistema de Gestão de ONG

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos.

## Objetivo

Aplicar os pilares da POO: Encapsulamento, Herança e Composição.

## Estrutura

- `MembroONG.java` — superclasse com encapsulamento
- `Voluntario.java` — subclasse com herança e @Override
- `Doador.java` — subclasse com herança e @Override
- `ProjetoSocial.java` — composição (TEM-UM Voluntario)
- `SistemaMain.java` — classe de teste com o método main

## Como executar

```bash
javac *.java
java SistemaMain
```