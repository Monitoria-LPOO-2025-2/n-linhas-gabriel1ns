# N-Linhas

Você precisa construir um método em Java que gera um padrão numérico com base em um número inteiro `n`.

---

## O Desafio

O padrão que você precisa criar funciona da seguinte maneira:  
Para um dado número `n`, seu programa deve gerar `n` linhas de texto.  
Cada linha `i` (de 1 a `n`) deve conter o número `i` repetido `i` vezes.

### Exemplo

Se `n = 4`, a saída esperada é:

```
1
22
333
4444
```

---

## Estrutura do Projeto

O projeto já vem com alguns arquivos para te ajudar. É importante que você se familiarize com eles:

```
src
├── main
│   └── java
│       └── solution
│           ├── NLinhas.java     <-- Você trabalhará aqui.
│           └── Main.java        <-- Use este para testes manuais.
└── test
    └── java
        └── solution
            └── TestNLinhas.java <-- Testes automáticos (não modifique!)
```

- **`NLinhas.java`**: Contém a classe `NLinhas` com o método `gerarLinhas(int n)` que você precisa implementar.
- **`Main.java`**: Classe com um método `main` para testar manualmente sua implementação.
- **`TestNLinhas.java`**: Contém os testes automatizados que serão usados para corrigir sua atividade.

---

## Sua Tarefa

Implemente a lógica dentro do método `gerarLinhas(int n)` no arquivo `NLinhas.java`.

Esse método deve:

- Receber um inteiro `n`.
- Retornar uma **String** com o padrão completo.
- Cada linha deve ser separada por um caractere de nova linha (`\n`).

### Exemplo de estrutura do método:

```java
public String gerarLinhas(int n) {
    // Implemente toda a sua lógica aqui.
    // DICA: Verifique se n <= 0. Se for, retorne "".
    // DICA: Use laços (loops) para construir a string linha por linha.
    // DICA: Retorne a variável que guarda a string final.

    return ""; // Substitua isso pela sua implementação
}
```

---

## Requisitos

Para que sua solução seja considerada correta, ela deve:

 Gerar o padrão correto para qualquer valor de `n` positivo.  
 Lidar com o caso `n = 0`: o método deve retornar uma string vazia (`""`).  
 Lidar com números negativos: o comportamento deve ser o mesmo que para `n = 0`.  
 Não alterar os nomes das classes, métodos ou estrutura dos arquivos.  

---

## Como Testar seu Código

###  Teste Manual

Você pode usar o arquivo `Main.java` para fazer testes rápidos:

```java
public static void main(String[] args) {
    NLinhas gerador = new NLinhas();
    int numeroDeLinhas = 5;
    String resultado = gerador.gerarLinhas(numeroDeLinhas);
    System.out.println("Teste para n = " + numeroDeLinhas);
    System.out.print(resultado);
}
```

### Teste Automatizado (Correção)

O projeto está configurado com **Gradle**.  
Para rodar os testes automatizados, execute o seguinte comando no terminal (na raiz do projeto):

```bash
./gradlew test
```

Se todos os testes passarem, você verá a mensagem:

```
BUILD SUCCESSFUL
```

Caso contrário, um relatório de testes será gerado em:

```
build/reports/tests/test/index.html
```

Acesse esse relatório para identificar quais testes falharam.

---

Boa sorte! 
