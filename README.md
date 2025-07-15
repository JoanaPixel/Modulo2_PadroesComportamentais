# Modulo2_PadroesComportamentais
Repositório que contém as atividades "Desafio (Grupo 1 - Observer): Sistema de Notícias Personalizadas", "Desafio (Grupo 2 - Strategy): Cálculo de Plano de Assinatura" e "Desafio (Grupo 3 - Command): Fila de Impressão", da disciplina Arquitetura de Sistemas.

>> Perguntas de Checagem

1. Qual a principal vantagem do padrão Observer em sistemas reativos?
R: A principal vantagem é o desacoplamento entre os emissores e os receptores de eventos. Em sistemas reativos, isso permite que múltiplos componentes (observadores) sejam notificados automaticamente e em tempo real quando o estado de um objeto (o sujeito) muda — sem que ele precise saber quem são esses componentes.
Isso facilita a escalabilidade, a manutenção e a flexibilidade no sistema.

2. Por que o Strategy é melhor que muitos `if`?
R: Porque o Strategy separa cada lógica em sua própria classe, permitindo que o comportamento seja escolhido em tempo de execução sem depender de condicionais longas e difíceis de manter.
Evita código rígido, facilita testes, adição de novos comportamentos e aplicação do princípio Open/Closed (aberto para extensão, fechado para modificação).

3. Dê um exemplo real em que Command seja melhor que apenas chamar métodos diretamente.
R: Um exemplo é um editor de texto com funcionalidade de "Desfazer" (Undo/Redo). Cada ação (escrever, apagar, formatar) pode ser encapsulada como um comando, armazenada em uma pilha, e revertida quando necessário.
Isso só é possível com o padrão Command, pois ele encapsula ações como objetos, permitindo que sejam armazenadas, reexecutadas ou desfeitas.
