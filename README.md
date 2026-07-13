# 🚀 Java Learning Path

Este repositório serve como um diário de bordo e registro cronológico dos meus estudos focados em desenvolvimento backend com Java. Ele documenta a minha evolução técnica, partindo da sintaxe essencial até a aplicação de arquiteturas robustas da Orientação a Objetos e boas práticas de mercado.

---

## 📂 Organização dos Capítulos

* **`ch01_fundamentals`**: Domínio da sintaxe básica, tipos primitivos, estruturas condicionais (`if/else`) e de repetição (`for`, `while`).
* **`ch02_arrays`**: Manipulação de vetores na memória, conceitos de encapsulamento, construtores e o comportamento de referências vs. valor.
* **`ch03_lists`**: Trabalho com coleções dinâmicas utilizando `List` e `ArrayList`, focando na manipulação e filtragem de elementos.
* **`ch04_inheritance_polymorphism`**: Aplicação prática dos pilares avançados da POO:
    * Reutilização de código através de herança (`extends`) e herança de construtores (`super()`).
    * Sobrescrita de métodos com a anotação `@Override`.
    * Polimorfismo aplicado ao gerenciar coleções heterogêneas (ex: lista única de `Product` que aceita classes filhas).
    * Uso de constantes (`private static final`) alinhado às boas práticas de Clean Code.
* **`ch05_exceptions`**: Criação de aplicações resilientes através do tratamento de erros estruturado com blocos `try-catch` e desenvolvimento de exceções personalizadas (*custom exceptions*) para regras de negócio.
* **`ch06_files`**: Manipulação de arquivos de texto e I/O de dados através das classes `FileReader` e `BufferedReader`, garantindo o fechamento seguro de recursos com a estrutura `try-with-resources`.
* **`ch07_interfaces`**: Implementação de contratos através de `interfaces`, promovendo o desacoplamento de código, inversão de controle e facilidade de manutenção.
* **`ch08_generics_collections`**: Deep dive em estruturas de dados avançadas, reutilização de código com Generics e algoritmos de busca/armazenamento eficientes:
    * **Set (Student Counter):** Resolução de problemas de união de conjuntos ($A \cup B \cup C$) com foco em otimização de memória, utilizando um único `HashSet` e sobrescrevendo os métodos `hashCode` e `equals` para garantir unicidade lógica baseada em atributos da entidade.
    * **Map (Vote Aggregator):** Agregação e contagem de dados textuais estruturados extraídos de arquivos externos. Uso estratégico de `LinkedHashMap` para manter a ordem cronológica de inserção enquanto atualiza valores dinamicamente.

---

## 🛠️ Tecnologias, Ferramentas e Conceitos

* **Linguagem:** Java (Foco em recursos modernos e tipagem forte)
* **Paradigma:** Programação Orientada a Objetos (POO) aplicada a cenários reais
* **Qualidade:** Padrões de nomenclatura em inglês, código limpo (*Clean Code*) e legibilidade
* **Ambiente de Desenvolvimento:** IntelliJ IDEA e Git/GitHub para versionamento profissional
