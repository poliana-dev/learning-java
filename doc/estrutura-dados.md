---
marp: true
paginate: true

---

# Estrutura de dados
A array "simples" também é uma estrutura de dados, pois ela armazena e organiza informações. Porém, o Java possui outras estruturas mais flexiveis e robustas em `java.util`
Alguns exemplos comuns:
- ArrayList: permite duplicatas; acessa por índice
- HashSet: não permite duplicadas
- HashMap: pares de chave e valor; acessa por chave 

***
## ArrayList

Mais flexível que a array "nativa" que já conhecemos.
- É uma coleção ordenada; Pode adicionar duplicatas
- Importe: `import java.util.ArrayList`
- Como criar: `ArrayList<Tipo> cars = new ArrayList<Tipo>();`
- Interface da lista: `List<Tipo> cars = new ArrayList<>();`
    - Mais flexibilidade em trocar o tipo da lista, caso precise.

***
Métodos:

| Tipo  | Descrição |
| :--   | :--       |
| `add(elemento)` ou `add(index, elemento)`| adiciona na lista \ adiciona elemento em uma posição|
| `remove(elemento)` | remove da lista|
| `get(index)` |   retorna o elemento em uma posição |
| `size(index, elemento)` | retorna a quantidade de elementos|
| `set(index, elemento)` | alterar o elemento |
| `clear()` | apagar tudo |

***
###  LinkedList
Essa classe é parecida com a `ArrayList`, mas sua estrutura interna é como um trem com vagões: cada vagão guarda o dado e também uma referência para o próximo e o anterior.

- Diferente do ArrayList, não é baseada em índices de array, mas em "nós ligados".
- inserir e remover elementos (principalmente no meio ou no início da lista) é mais eficiente.
    - Em um cenário onde é preciso inserir ou remover itens, como filas ou playlist, a `LinkedList` é ideal.

- Alguns métodos: `addFirst()`; `addLast()`; `removeFirst()`; `removeLast()`

***

## Conjuntos
### HashSet
