# TV.java

Programa em Java, executado no terminal, que simula o controle de **5 televisões** de uma casa. É possível ligar e desligar, ajustar o volume, trocar de canal e alternar entre as TVs, cada uma mantendo sua própria configuração.

Projeto desenvolvido na faculdade de Engenharia de Software da Universidade Católica de Salvador, como parte do meu aprendizado em Java e programação orientada a objetos.

## Funcionalidades

- **5 TVs independentes**: sala, quarto, cozinha, banheiro e piscina
- **Ligar e desligar** a TV
- **Aumentar e diminuir o volume** de 1 em 1, dentro do limite de 0 a 100
- **Trocar de canal** (canais disponíveis: 1, 3, 5, 7 e 11)
- **Alternar entre as TVs**, mantendo canal, volume e status de cada uma
- A TV só aceita mudanças de volume e de canal **quando está ligada**
- Exibição do canal, volume e status da TV atual a cada ação

## Tecnologias

- Java (sem bibliotecas externas)

## Como executar

1. Clone o repositório:
```bash
   git clone https://github.com/GustavoAlbergaria/TV.java.git
```
2. Entre na pasta do projeto:
```bash
   cd TV.java
```
3. Compile e execute:
```bash
   javac TV.java
   java TV
```

Também é possível abrir o projeto no IntelliJ, VS Code ou Eclipse e executar a classe `TV`.

## Exemplo de uso

```
canal 1
volume 0
status 0
TV da sala

Menu da Televisão

[1] Ligar/desligar
[2] diminuir volume em 1
[3] aumentar volume em 1
[4] trocar de canal
[5] trocar de Televisão
```

Para trocar de TV, escolha a opção 5 e depois o número do cômodo:

```
Escolha entre:

[1] Tv da sala
[2] Tv do quarto
[3] Tv do cozinha
[4] Tv do banheiro
[5] Tv do piscina
```

## Como o código funciona

A classe `TV` representa uma televisão, com os atributos `status`, `volume` e `canal` e os métodos `ligar_desligar()`, `aumentar_volume()`, `diminuir_volume()`, `trocar_canal()` e `infoTv()`. O `main` cria **cinco objetos** dessa mesma classe, um para cada cômodo, e usa a variável `tvAtual` para controlar qual deles está sendo manipulado. Por isso, mudar o volume da TV da sala não afeta a TV do quarto.

## O que aprendi

- Conceitos básicos de **programação orientada a objetos**: classe, atributos, métodos e **várias instâncias** da mesma classe com estados independentes
- Uso de **referências a objetos** (`tvAtual`) para alternar entre instâncias
- **Menus interativos** com `Scanner`, `switch` e laço `while`
- Aplicação de **regras de negócio** em métodos (limites de volume, canais válidos, TV precisa estar ligada)

## Melhorias futuras

- Adicionar uma opção para **encerrar o programa** (hoje o menu roda em laço infinito)
- Mostrar uma **mensagem pedindo o número do canal** e avisar quando o canal for inválido
- Tratar entradas que não sejam números
- Permitir ajustar o volume para um valor específico e guardar a lista de canais em um array

## Autor

**Gustavo Albergaria**
Estudante de Engenharia de Software na Universidade Católica de Salvador

[LinkedIn](https://www.linkedin.com/in/gustavo-albergaria-b98583403/) | [GitHub](https://github.com/GustavoAlbergaria)
