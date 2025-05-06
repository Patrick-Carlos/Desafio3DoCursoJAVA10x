## 📋 Descrição do Desafio

Crie um programa em **Java** para gerenciar informações de ninjas utilizando **herança**.

Desenvolva:

### 1. Classe Base: `Ninja`

Defina os seguintes atributos:

- `nome` (String)  
- `idade` (int)  
- `missao` (String)  
- `nivelDificuldade` (String)  
- `statusMissao` (String)  

Adicione um método chamado:

- `mostrarInformacoes()` → Exibe todos os atributos acima.

---

### 2. Subclasse: `Uchiha` (herda de `Ninja`)

Adicione:

- Atributo adicional: `habilidadeEspecial` (String)  
- Método: `mostrarHabilidadeEspecial()` → Exibe a habilidade especial do ninja.

---

### 3. Sobrescrita de Método

Na classe `Uchiha`, sobrescreva o método `mostrarInformacoes()` para também exibir a `habilidadeEspecial`.

---

### 🔥 Desafio Adicional (Interatividade com Scanner)

Implemente um **menu interativo** utilizando a classe `Scanner`, com as seguintes opções:

- Exibir informações de todos os ninjas
- Adicionar novos ninjas
- Atualizar habilidades especiais de um ninja Uchiha

Isso ajuda a praticar:

- Entrada de dados do usuário (`Scanner`)
- Controle de fluxo (`if`, `while`, `switch`, etc)
