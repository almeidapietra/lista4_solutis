# Projeto Solutis Dev Trail - Sistema de Animais

Este projeto é uma atividade do Solutis Dev Trail, focada na criação de um sistema de gerenciamento de animais com diferentes comportamentos e características. Utiliza conceitos de programação orientada a objetos em Java.

## Estrutura do Projeto

O projeto é dividido em pacotes para melhor organização:

- **`main`**: Contém a classe principal que executa o programa.
- **`interfaces`**: Contém a interface `AnimalIF` com métodos comuns a todos os animais.
- **`animais`**: Contém classes abstratas para diferentes tipos de animais.
  - **`terrestres`**: Animais que vivem no solo (e.g., cachorro, gato).
  - **`marinho`**: Animais que vivem na água (e.g., peixe).
  - **`voadores`**: Animais que voam (e.g., pombo).

## Pacotes e Classes

- **`interfaces`**
  - `AnimalIF`: Interface com métodos `comer`, `moverse`, `dormir`.

- **`animais`**
  - `AnimalAB`: Classe abstrata com atributos e métodos comuns a todos os animais.
  - `AnimalMarinhoAB`: Classe abstrata para animais marinhos.
  - `AnimalVoadorAB`: Classe abstrata para animais que voam.
  - `AnimalTerrestreAB`: Classe abstrata para animais terrestres.

- **`animais/terrestres`**
  - `Cachorro`: Implementa comportamento de um cachorro.
  - `Gato`: Implementa comportamento de um gato.
  - `Elefante`: Implementa comportamento de um elefante.
  - `Leão`: Implementa comportamento de um leão.

- **`animais/marinho`**
  - `Peixe`: Implementa comportamento de um peixe.

- **`animais/voadores`**
  - `Pombo`: Implementa comportamento de um pombo.


 **Pré-requisitos:**
   - JDK 11 ou superior.
   - IntelliJ IDEA ou outro IDE Java.

---------------------------------------------
