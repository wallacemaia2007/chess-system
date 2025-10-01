# Chess System ♟️

Sistema de xadrez em Java desenvolvido para jogar partidas completas via terminal.

## Sobre o Projeto

Um jogo de xadrez funcional que roda no console, implementando todas as regras básicas e especiais do xadrez.

## Funcionalidades

- Tabuleiro 8x8 com todas as peças
- Movimentação completa de todas as peças (Peão, Torre, Cavalo, Bispo, Rainha, Rei)
- Regras especiais:
  - Roque (pequeno e grande)
  - En Passant
  - Promoção de peão
- Sistema de check e checkmate
- Controle de turnos entre jogadores
- Interface colorida no terminal
- Lista de peças capturadas

## Como Jogar

1. Execute a classe `Main.java`
2. Digite a posição da peça que deseja mover (ex: `e2`)
3. Digite a posição de destino (ex: `e4`)
4. O jogo alterna entre jogadores WHITE e BLACK

## Tecnologias

- Java 21
- Eclipse IDE

## Estrutura

```
src/
├── application/     # Interface e execução
├── boardGame/       # Lógica geral de tabuleiro
└── chess/          # Lógica específica de xadrez
    └── pieces/     # Implementação de cada peça
```

---

Desenvolvido como projeto de estudo de POO em Java.