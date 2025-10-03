# Projeto de Cálculo de Imposto com Polimorfismo em Java



Este projeto é um exercício prático que demonstra o conceito de Polimorfismo em Java, um dos pilares da Programação Orientada a Objetos. O código é estruturado para calcular impostos de diferentes tipos de produtos, aplicando lógicas de cálculo específicas para cada um de forma desacoplada e extensível.



## Visão Geral



O objetivo principal é ilustrar como o Polimorfismo permite que um método genérico trate objetos de diferentes classes de maneira uniforme, enquanto cada objeto responde de forma única à mesma chamada de método (`calcularImposto`).



O projeto é organizado usando uma estrutura de pacotes padrão de mercado, separando as responsabilidades em:



**`model`**: Contém as classes que representam as entidades do negócio (ex: `Produto`, `Computador`).

**`service`**: Contém as classes que executam a lógica de negócio (ex: `CalculadoraImposto`).

## Funcionalidades

**Abstração:** Uma classe abstrata `Produto` serve como base para todos os produtos, definindo atributos e comportamentos comuns.

**Interface:** A interface `Taxavel` estabelece um contrato que obriga todas as classes de produto a implementarem um método para o cálculo de imposto.

**Polimorfismo:** A classe `CalculadoraImposto` opera sobre a abstração `Produto`, permitindo calcular o imposto de qualquer subclasse (`Computador`, `Tomate`, etc.) sem conhecer seus detalhes específicos.

**Encapsulamento:** Cada produto encapsula sua própria alíquota e lógica de cálculo de imposto.

## Estrutura do Projeto

O projeto segue a estrutura de diretórios padrão do Maven/Gradle, separando claramente o código de produção do código de teste.

```
└── src/
├── main/
│   └── java/
│       └── br/
│           └── com/
│               └── calcularimposto/
│                   ├── model/
│                   │   ├── Produto.java         (Classe base abstrata)
│                   │   ├── Taxavel.java         (Interface para cálculo)
│                   │   ├── Computador.java      (Produto concreto)
│                   │   ├── Tomate.java          (Produto concreto)
│                   │   └── Televisao.java       (Produto concreto)
│                   │
│                   └── service/
│                       └── CalculadoraImposto.java (Classe com a lógica de negócio)
│
└── test/
└── java/
└── br/
└── com/
└── calcularimposto/
└── ProdutoTest01.java (Arquivos para testar a aplicação)
└── ProdutoTest02.java (Arquivos para testar a aplicação)
```
## Como Executar

Este projeto foi criado para fins de estudo e não possui uma classe de aplicação principal (`main`) no código de produção. Para ver a funcionalidade em ação, você deve executar os arquivos de teste.

1.  **Pré-requisitos:**
    * Java Development Kit (JDK) instalado.
    * Uma IDE Java (IntelliJ, Eclipse, etc.) ou compilação via linha de comando.

2.  **Execução:**
    * Importe o projeto na sua IDE.
    * Navegue até o diretório `src/test/java/br/com/calcularimposto/`.
    * Execute o método `main` dentro da classe `ProdutoTest01.java`/`ProdutoTest02.java`).
    * O resultado da simulação do cálculo de impostos será exibido no console.

### Exemplo de Saída no Console
```
Relatório de imposto
Calculando imposto do Computador
Produto: Notebook Gamer
Valor: 5000.0
Imposto a ser pago: 1050.0
----------------------
Relatório de imposto
Calculando imposto do tomate
Produto: Tomate-cereja
Valor: 50.0
Imposto a ser pago: 3.0
----------------------
Relatório de imposto
Calculando imposto da televisão
Produto: Samsung 50" 
Valor: 2000.0
Imposto a ser pago: 300.0
```
