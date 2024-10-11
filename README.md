### exception-handling-java

## Operações em Conta Bancária

Projeto feito para fins de estudos e desenvolvimento, Curso Java Completo - Udemy(Estudo de tratamento de exceções personalizadas e cases).
Este projeto demonstra um sistema simples para gerenciar contas bancárias com funcionalidades de depósito e saque. O usuário pode escolher se deseja realizar um depósito, um saque ou ambos. O código também trata exceções para entradas inválidas e regras de negócios relacionadas ao limite de saque e saldo insuficiente.

---

### Funcionalidades:
- **Criar uma conta bancária** com saldo inicial e limite de saque.
- **Realizar depósito**, saque ou ambos em uma única execução.
- **Verificar o saldo atualizado** após cada transação.
- **Tratar exceções** para entradas inválidas e regras de negócios (limite de saque ou saldo insuficiente).

---

### Como Funciona

#### 1. Criação de Conta:
   O usuário deve inserir:
   - Número da Conta
   - Nome do Titular
   - Saldo Inicial
   - Limite de Saque

#### 2. Seleção de Operação:
   O menu apresenta as opções:
   - Depósito
   - Saque
   - Depósito e Saque

#### 3. Execução da Transação:
   - **Depósito:** O usuário insere um valor para depositar. O saldo da conta é atualizado.
   - **Saque:** O usuário insere um valor para sacar. O sistema verifica se o valor excede o saldo disponível ou o limite de saque.
   - **Ambos:** O usuário pode realizar um depósito e, em seguida, um saque.

#### 4. Tratamento de Erros:
   - **Exceções de Negócios:** São acionadas se o valor do saque exceder o saldo da conta ou o limite de saque.
   - **Exceções de Entrada:** São acionadas quando o usuário insere tipos de dados inválidos (por exemplo, texto ao invés de números).

---

### Visão Geral do Código:
- **Classe Account:** Esta classe gerencia os atributos da conta bancária e fornece métodos para depósito e saque.
- **Classe BusinessException:** Uma classe de exceção personalizada que aplica regras de negócios, como limites de saque e saldo insuficiente.
- **Programa Principal:** Onde ocorre a interação com o usuário. Lida com a criação de contas, seleção de operações, execução de transações e tratamento de exceções.

---

### Exemplos de Execução

**Exemplo 1: Saque Simples**

```
Insira os dados da conta:
Número da Conta: 1001
Titular: João
Saldo Inicial: 1000.00
Limite de Saque: 500.00

Insira o valor para saque: 200.00
Saldo Atualizado: R$800.00
```

**Exemplo 2: Limite de Saque Excedido**

```
Insira os dados da conta:
Número da Conta: 1002
Titular: Maria
Saldo Inicial: 1500.00
Limite de Saque: 300.00

Insira o valor para saque: 400.00
O valor excede o limite de saque
```

**Exemplo 3: Depósito e Saque na Mesma Transação**

```
Insira os dados da conta:
Número da Conta: 1003
Titular: Paulo
Saldo Inicial: 500.00
Limite de Saque: 250.00

Escolha a Operação: 
1 - Depósito
2 - Saque
3 - Depósito e Saque
Opção: 3

Insira o valor para depósito: 300.00
Saldo Atualizado após Depósito: R$800.00

Insira o valor para saque: 200.00
Saldo Atualizado após Saque: R$600.00
```

---

## Bank Account Operations

This project demonstrates a simple system for managing bank accounts with functionalities for deposit and withdrawal. The user can choose whether to make a deposit, a withdrawal, or both. It also handles exceptions for invalid input and business rules related to withdrawal limits and insufficient balance.

---

### Features:
- **Create a bank account** with an initial balance and a withdrawal limit.
- **Make a deposit**, a withdrawal, or both in one execution.
- **Check the updated balance** after each transaction.
- **Handles exceptions** for invalid input types and business rules (withdrawal limit or insufficient balance).

---

### How It Works

#### 1. Account Creation:
   The user is prompted to enter:
   - Account Number
   - Account Holder's Name
   - Initial Balance
   - Withdrawal Limit

#### 2. Operation Selection:
   A menu is presented to the user with options to:
   - Deposit
   - Withdraw
   - Both Deposit and Withdraw

#### 3. Transaction Execution:
   - **Deposit:** The user enters an amount to deposit. The account balance is updated accordingly.
   - **Withdraw:** The user enters an amount to withdraw. The system checks if the amount exceeds the available balance or the withdrawal limit.
   - **Both:** The user can perform a deposit first, followed by a withdrawal.

#### 4. Error Handling:
   - **Business Exceptions:** These are triggered if the withdrawal amount exceeds the account balance or the withdrawal limit.
   - **Input Exceptions:** These are triggered when the user inputs invalid data types (e.g., trying to input text instead of numbers).

---

### Code Overview:
- **Account Class:** This class manages the bank account’s attributes and provides methods for deposit and withdrawal.
- **BusinessException Class:** A custom exception class that enforces business rules, such as withdrawal limits and insufficient balance.
- **Main Program:** This is where the user interaction takes place. It handles account creation, operation selection, transaction execution, and exception handling.

---

### Example Executions

**Example 1: Basic Withdrawal**

```
Enter the account data:
Account Number: 1001
Holder: John
Initial Balance: 1000.00
Withdraw Limit: 500.00

Enter amount for withdraw: 200.00
Updated Balance: $800.00
```

**Example 2: Exceeding Withdrawal Limit**

```
Enter the account data:
Account Number: 1002
Holder: Mary
Initial Balance: 1500.00
Withdraw Limit: 300.00

Enter amount for withdraw: 400.00
The amount exceeds withdraw limit
```

**Example 3: Deposit and Withdraw in the Same Transaction**

```
Enter the account data:
Account Number: 1003
Holder: Paul
Initial Balance: 500.00
Withdraw Limit: 250.00

Choose Operation: 
1 - Deposit
2 - Withdraw
3 - Deposit and Withdraw
Option: 3

Enter deposit amount: 300.00
Updated Balance after Deposit: $800.00

Enter withdraw amount: 200.00
Updated Balance after Withdraw: $600.00
```
