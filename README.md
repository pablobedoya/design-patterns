# Padrões de Projeto
Repositório de estudos sobre o catálogo de padrões de projetos definido no livro Design Patterns: Elements of Reusable Object-Oriented Software, escrito pela Gang of Four (GoF).

## Padrões Criacionais

| Padrão           | Descrição                                                                                                                                        | Status    |
|------------------|--------------------------------------------------------------------------------------------------------------------------------------------------|-----------|
| Abstract Factory | Fornece uma interface para criação de famílias de objetos relacionados ou dependentes sem especificar suas classes concretas                     | :pencil2: |
| Builder          | Separa a construção de um objeto complexo da sua representação, de modo que o mesmo processo de construção possa criar diferentes representações | :pencil2: |
| Factory Method   | Define uma interface para criar um objeto, mas deixa as subclasses decidirem qual classe a ser instanciada                                       | :pencil2: |
| Prototype        | Especifica os tipos de objetos a serem criados usando uma instância prototípica e criar novos objetos copiando esse protótipo                    | :pencil2: |
| Singleton        | Garante que uma classe tenha somente uma instância e fornece um ponto global de acesso para ela                                                  | :pencil2: |

## Padrões Estruturais

| Padrão    | Descrição                                                                                                      | Status    |
|-----------|----------------------------------------------------------------------------------------------------------------|-----------|
| Adapter   | Converte a interface de uma classe em outra interface esperada pelos clientes                                  | :pencil2: |
| Bridge    | Separa uma abstração da sua implementação, de modo que as duas possam variar independentemente                 | :pencil2: |
| Composite | Compõe objetos em estrutura de árvore para representar hierarquias do tipo partes-todo                         | :pencil2: |
| Decorator | Atribui responsabilidades adicionais a um objeto dinamicamente                                                 | :pencil2: |
| Facade    | Fornece uma interface unificada para um conjunto de interfaces em um subsistema                                | :pencil2: |
| Flyweight | Usa compartilhamento para suportar grandes quantidades de objetos, de granularidade fina, de maneira eficiente | :pencil2: |
| Proxy     | Fornece um substituto ou espaço reservado para que outro objeto controle o seu acesso                          | :pencil2: |

## Padrões Comportamentais

| Padrão                  | Descrição                                                                                                                                                                   | Status    |
|-------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------|
| Chain of Responsibility | Evita o acoplamento do remetente de uma solicitação ao seu destinatário, dando a mais de um objeto a chance de tratar a solicitação                                         | :pencil2: |
| Command                 | Encapsula uma solicitação como um objeto, permitindo, assim, parametrizar clientes com diferentes solicitações de fila ou log e suporte a operações que podem ser desfeitas | :pencil2: |
| Interpreter             | Dada uma linguagem, define uma representação para sua gramática juntamente com um interpretador que usa a representação para interpretar sentenças nessa linguagem          | :pencil2: |
| Iterator                | Fornece uma maneira de acessar sequencialmente os elementos de uma agregação de objetos sem expor sua representação subjacente                                              | :pencil2: |
| Mediator                | Define um objeto que encapsula a forma como um conjunto de objetos interage                                                                                                 | :pencil2: |
| Memento                 | Sem violar o encapsulamento, captura e externaliza um estado interno de um objeto, de modo que o mesmo possa posteriormente ser restaurado para este estado                 | :pencil2: |
| Observer                | Define uma dependência um-para-muitos entre objetos, de modo que, quando um objeto muda de estado, todos os seus dependentes são automaticamente notificados e atualizados  | :pencil2: |
| State                   | Permite que um objeto altere seu comportamento quando seu estado interno muda                                                                                               | :pencil2: |
| Strategy                | Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis                                                                                        | :pencil2: |
| Template Method         | Define o esqueleto de um algoritmo em uma operação, postergando a definição de alguns passos para subclasses                                                                | :pencil2: |
| Visitor                 | Representa uma operação a ser executada sobre os elementos da estrutura de um objeto                                                                                        | :pencil2: |
