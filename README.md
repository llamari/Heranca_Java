# Atividade Prática: Herança em Java
## Objetivo
O objetivo desse projeto é aprender e aplicar conceitos de herança simples e múltipla em Java. Exemplificando esses conceitos com uma hierança de classes na qual as subclasses herdam e utilizam métodos das superclasses.

## Estrutura
- **Pessoa.java:** Classe base com atributos comuns a todas as pessoas (CPF e data de nascimento);
- **Funcionarios.java:** Subclasse de Pessoa com atributos e métodos específicos de funcionários (nome, salario, departamento e os métodos MostrarDados e BaterPonto);
- **Desenvolvedor.java, Estagiario.java, Gerente.java:** Subclasses de Funcionarios, representando diferentes cargos. Cada uma sobrescrevendo MostrarDados e tenho um método construtor e um método próprio;
- **Main.java:** Classe principal para execução e demonstração das classes. Nesse arquivo é onde ocorre toda interação com o usuário.

## Como Executar
1. Clone o repositório:
```bash
git clone https://github.com/llamari/Heranca_Java.git
```
2. Navegue até o diretório do projeto:
```bash
cd Heranca_Java
```
3. Compile os arquivos Java:
```bash
javac *.java
```
4. Execute a aplicação:
```bash
java Main
```
