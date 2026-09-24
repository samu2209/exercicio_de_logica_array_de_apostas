# 🎰 Projeto — Sistema de Apostas de Loteria

## 📌 Descrição

Desenvolva um programa em Java que simule um pequeno sistema de apostas de loteria.

O sistema deverá permitir o cadastro de **3 apostas**, realizar um sorteio com **5 números** e, ao final, comparar cada aposta com o resultado sorteado, informando a quantidade de acertos de cada participante.

O objetivo deste projeto é praticar conceitos fundamentais de Java, principalmente **arrays, estruturas de repetição, condicionais, métodos, validação de dados, geração de números aleatórios, classes e objetos**.

> **Restrição:** neste projeto não devem ser utilizadas Collections (`ArrayList`, `HashSet`, `HashMap` etc.) ou recursos mais avançados da linguagem. Resolva o problema utilizando principalmente arrays e os conceitos já estudados.

---

# 🎯 Requisitos

## 1. Cadastro das apostas

O sistema deverá permitir o cadastro de **3 apostas**.

Para cada aposta, o usuário deverá informar:

* Nome do apostador;
* Quantidade de números que deseja apostar;
* Os números escolhidos.

O apostador poderá escolher entre:

* **5 números**
* **6 números**
* **7 números**

Cada número deverá estar obrigatoriamente no intervalo:

```text
1 a 99
```

---

## 2. Validação da quantidade de números

O sistema deverá verificar se a quantidade escolhida é válida.

Somente estas opções serão aceitas:

```text
5
6
7
```

Caso o usuário informe qualquer outro valor, o programa deverá solicitar novamente uma quantidade válida.

Exemplo:

```text
Quantidade de números: 4

Quantidade inválida.
Escolha entre 5, 6 ou 7 números.
```

---

## 3. Validação dos números

Cada número informado pelo apostador deverá estar entre:

```text
1 e 99
```

Valores fora desse intervalo deverão ser rejeitados.

Exemplo:

```text
Digite o número: 120

Número inválido.
Digite um número entre 1 e 99.
```

---

## 4. Números não podem se repetir

Uma mesma aposta não poderá possuir números repetidos.

Exemplo inválido:

```text
10
25
10
42
73
```

O programa deverá identificar que o número `10` já foi escolhido e solicitar outro número.

> **Importante:** essa validação deverá ser feita utilizando arrays e estruturas de repetição, sem utilizar `Set` ou outras Collections.

---

# 🎲 5. Sorteio

Depois que as 3 apostas forem cadastradas, o sistema deverá realizar um sorteio.

O sorteio deverá gerar:

* **5 números**
* Números entre **1 e 99**
* Sem números repetidos

Exemplo:

```text
Números sorteados:

12
27
34
71
89
```

Os números deverão ser gerados aleatoriamente pelo programa.

---

# 🔎 6. Comparação das apostas

Depois do sorteio, o programa deverá comparar os números de cada aposta com os números sorteados.

Para cada aposta, deverá ser calculada a quantidade de acertos.

Exemplo:

```text
Sorteio:
10 25 42 67 91

João:
10 25 33 50 91

Acertos: 3
```

O programa deverá realizar essa comparação para as três apostas.

---

# 🏆 7. Resultado

Ao final da execução, o programa deverá apresentar:

### Números sorteados

```text
10 - 25 - 42 - 67 - 91
```

### Apostas

```text
Aposta 1
Apostador: João
Números: 10 - 25 - 33 - 50 - 91
Acertos: 3

Aposta 2
Apostador: Maria
Números: 05 - 25 - 42 - 67 - 70
Acertos: 3

Aposta 3
Apostador: Carlos
Números: 10 - 20 - 30 - 40 - 50
Acertos: 1
```

---

# 🥇 8. Determinação do resultado

O sistema deverá identificar a(s) aposta(s) que obteve/obtiveram a maior quantidade de acertos.

Caso exista apenas uma aposta com a maior quantidade de acertos, ela deverá ser apresentada como vencedora.

Exemplo:

```text
🏆 Vencedor: João
Quantidade de acertos: 5
```

Caso duas ou três apostas tenham a mesma quantidade máxima de acertos, o sistema deverá informar o empate.

Exemplo:

```text
🏆 Empate!

João: 4 acertos
Maria: 4 acertos
```

> Não existe necessidade de criar um critério de desempate. Se houver empate na quantidade de acertos, todos os empatados deverão ser apresentados.

---

# 🧱 9. Orientação de implementação

O programa deverá ser desenvolvido inicialmente utilizando os conceitos fundamentais já estudados.

### Conceitos esperados

* Variáveis e tipos primitivos;
* `if`, `else` e `else if`;
* `for`;
* `while` e/ou `do while`;
* Arrays;
* Métodos;
* Parâmetros e retorno de métodos;
* `String`;
* Classes e objetos;
* Encapsulamento, caso seja utilizada uma classe para representar a aposta;
* Geração de números aleatórios;
* Validação de dados;
* Comparação de valores.

---

# 🏗️ 10. Classe `Aposta`

É recomendado que o sistema possua uma classe responsável por representar uma aposta.

A implementação fica a seu critério, mas uma aposta deverá possuir informações suficientes para representar:

* O nome do apostador;
* Os números escolhidos;
* A quantidade de acertos.

Você deverá decidir quais atributos, métodos, construtores e regras deverão pertencer à classe.

> Não é necessário criar uma classe para cada conceito do sistema. O objetivo é praticar a identificação de responsabilidades de uma classe.

---

# ⚠️ Restrições

Neste projeto **não utilizar**:

* `ArrayList`;
* `HashSet`;
* `HashMap`;
* Outras Collections;
* Streams;
* Lambda;
* Banco de dados;
* Arquivos;
* Frameworks;
* Bibliotecas externas;
* Recursos de Java que ainda não tenham sido estudados.

Utilize principalmente:

```text
Arrays
↓
Laços
↓
Condicionais
↓
Métodos
↓
Classes e objetos
```

---

# ⭐ Desafios opcionais

Depois que o requisito principal estiver funcionando, você poderá adicionar alguns desafios.

## Desafio 1 — Identificar os números acertados

Além de informar a quantidade de acertos, mostrar quais números da aposta foram sorteados.

Exemplo:

```text
João teve 3 acertos.

Números acertados:
10 - 25 - 91
```

## Desafio 2 — Mostrar a situação de cada aposta

Exemplo:

```text
João    → 5 acertos
Maria   → 3 acertos
Carlos  → 1 acerto
```

## Desafio 3 — Estatística simples

Informar quantas apostas tiveram:

```text
0 acertos
1 acerto
2 acertos
3 acertos
4 acertos
5 acertos
```

> Esse desafio deve continuar sendo resolvido utilizando arrays e estruturas básicas.

---

# 📚 Objetivo de aprendizado

O objetivo principal deste projeto **não é criar um sistema de loteria real**, mas utilizar um problema relativamente completo para praticar lógica de programação e os fundamentos de Java.

Ao desenvolver o projeto, procure evitar colocar toda a lógica em um único método.

Tente identificar partes do problema que podem ser transformadas em métodos independentes.

Por exemplo:

```text
Cadastro
Validação
Geração do sorteio
Comparação
Contagem de acertos
Exibição dos resultados
```

A forma como essas responsabilidades serão organizadas faz parte do desafio.

---

# 🚀 Critério de conclusão

O projeto será considerado concluído quando for capaz de:

* [ ] Cadastrar 3 apostas;
* [ ] Cadastrar o nome de cada apostador;
* [ ] Permitir apostas de 5, 6 ou 7 números;
* [ ] Validar a quantidade escolhida;
* [ ] Validar números entre 1 e 99;
* [ ] Impedir números repetidos na mesma aposta;
* [ ] Gerar 5 números aleatórios;
* [ ] Impedir números repetidos no sorteio;
* [ ] Comparar cada aposta com o sorteio;
* [ ] Contabilizar os acertos;
* [ ] Identificar a maior quantidade de acertos;
* [ ] Identificar empate quando necessário;
* [ ] Exibir todas as apostas;
* [ ] Exibir os números sorteados;
* [ ] Exibir os resultados de cada apostador.

---

## 💡 Regra pessoal do projeto

**Não procurar a solução pronta.**

O objetivo é enfrentar os problemas encontrados durante a implementação e utilizar a documentação, pesquisas e conhecimentos já adquiridos para solucioná-los.

Se surgir uma dificuldade, tente primeiro responder:

> **"O que exatamente eu preciso que o programa faça neste momento?"**

Depois divida o problema em partes menores.

O foco deste projeto é desenvolver a capacidade de **transformar um problema descrito em linguagem natural em uma solução programável.'**
