# 🧮 Projeto Calculadora — FinançApp

Módulo básico de cálculos matemáticos desenvolvido em Java para o sistema de controle de finanças pessoais da startup fictícia **FinançApp**. O projeto aplica boas práticas de engenharia de software, incluindo testes unitários, tratamento de erros, refatoração de código limpo e documentação técnica via JavaDoc.

---

## 🎯 Objetivo da Atividade

Desenvolver a capacidade prática na construção, validação, manutenção e documentação de software, aplicando conceitos essenciais de qualidade:

* **Testes Funcionais e Unitários:** Validação das operações matemáticas básicas e cenários de exceção.
* **Tratamento de Erros:** Prevenção de falhas críticas (como divisão por zero e operadores inválidos ou nulos) sem interromper a execução do programa.
* **Refatoração de Código:** Melhoria contínua da legibilidade, encapsulamento e extração de métodos em branch dedicada (`Refatoracao`).
* **Documentação Técnica e Versionamento:** Geração de documentação HTML automatizada com **JavaDoc** e organização de histórico de commits no GitHub.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK)
* **IDE:** Visual Studio Code (Extension Pack for Java)
* **Documentação:** JavaDoc (HTML)
* **Versionamento:** Git e GitHub

---

## ⚙️ Explicação das Operações

A classe principal `Calculadora` (localizada no pacote `calculadora`) disponibiliza o método público `calc(int primeiroOperando, int segundoOperando, String operador)`, que delega a execução para métodos privados especializados:

| Operação | Símbolo | Método Interno | Descrição e Tratamento |
| :--- | :---: | :--- | :--- |
| **Soma** | `+` | `somar(a, b)` | Retorna a adição entre dois números inteiros. |
| **Subtração** | `-` | `subtrair(a, b)` | Retorna a diferença entre o primeiro e o segundo operando. |
| **Multiplicação** | `*` | `multiplicar(a, b)` | Retorna o produto entre dois fatores inteiros. |
| **Divisão** | `/` | `dividir(a, b)` | Retorna o quociente inteiro da divisão. Caso o divisor seja `0`, exibe mensagem de alerta no console e retorna `0` de forma segura. |
| **Validação** | `outros` / `null` | — | Caso um operador inválido ou nulo seja informado, exibe mensagem de erro controlada e retorna `0`. |

---

## 📂 Estrutura do Repositório e Branches

O repositório está organizado em duas branches principais para evidenciar a evolução do código:

* **`main`:** Contém a implementação inicial funcional da `Calculadora.java` e a suíte de testes em `TesteCalculadora.java`.
* **`Refatoracao`:** Contém o código refatorado (encapsulamento de atributos, extração de métodos privados, substituição de estruturas condicionais por `switch` e comentários JavaDoc completos) e a pasta `docs/` gerada.

```text
projeto_calculadora/
├── calculadora/
│   ├── Calculadora.java
│   └── TesteCalculadora.java
├── docs/
│   └── index.html
└── README.md
```

---

## 🧪 Evidências: Execução dos Testes Unitários

A classe `TesteCalculadora` executa 6 cenários obrigatórios (soma, subtração, multiplicação, divisão, divisão por zero e operação inválida), exibindo entrada, resultado esperado e resultado obtido no console:

> **📸 Inserir aqui o print da execução dos testes no terminal do VS Code:**
>
> ![Execução dos Testes Unitários](prints/teste_unitario.png)

---

## 📚 Evidências: Documentação JavaDoc (`docs/index.html`)

A documentação técnica em HTML foi gerada a partir das anotações `@author`, `@version`, `@param` e `@return` inseridas nas classes e métodos do pacote `calculadora`:

> **📸 Inserir aqui o print da página `docs/index.html` aberta no navegador:**
>
> ![Documentação JavaDoc](prints/javadoc.png)

---

## 🔗 Link do Repositório

* **GitHub:** [https://github.com/RodrigoSeishi/projeto_calculadora](https://github.com/RodrigoSeishi/projeto_calculadora)