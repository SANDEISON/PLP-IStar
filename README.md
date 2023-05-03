# PLP-RASTREABILIDADE-DE-REQUISITOS

Projeto para a disciplina de Paradigmas de Linguagens de Programação (IN1007)

## Disciplina
  - Professor: [Augusto Sampaio](https://www.cin.ufpe.br/~acas/index.php "Professor Augusto Sampaio")
  | Email : <acas@cin.ufpe.br>

  - Disciplina : [Paradigmas de Linguagens de Programação](https://www.cin.ufpe.br/~in1007/ "Acesse Aqui!")

## Equipe

  - [Sandeison Fernandes](https://www.linkedin.com/in/SandeisonFernandes "Sandeison Fernandes") | Email : <ssf2@cin.ufpe.br>
  
  - [Abimael Santos](https://github.com/MaelSantos "Abimael Santos")
  | Email : <ajfs@cin.ufpe.br>

# Contextualização

## Requisitos

Especificação do que se deve ser implementado, são descrições de como o sistema deve se corportar, ou uma propriedade ou atributo do sistema, também podem ser uma restrição do sistema.

- *Requisitos Funcionais:* Define os serviços que o sistema deve prover, o comportamento do sistema
- *Requisitos de Qualidade (Não-Funcionais):* Propriedades de qualidade de todo o sistema, de um componente, de um serviço ou uma função.
- *Requisitos Organizacionais:* Metas da empresa, políticas e estratégias adotadas, assim como também restrições.

## Rastreabilidade

Capacidade de rastrear um elemento de projeto para outros elementos de projeto relacionados. Consiste na identificação de relações entre requisitos, suas fontes ou artefatos do sistema

- Finalidade da Rastreabilidade
  - Identificação de requisitos incompletos ou não implementados
  - Compreensão dos relacionamentos entre requisitos, artefatos, arquitetura e implementação 
  - Compreender a origem dos requisitos
  - Avaliar o impacto no projeto da mudança em um requisito

# Objetivo

Estender a Linguagem Funcional 2 para aceitar um identificador antes da função, de modo que seja possível identificar a qual requisito pertence cada função, com a finalidade de ao final da execução gerar um relatório informando a porcentagem que aquele requisito foi empregado.

## Atividades

- Adicionar identificador antes da declaração da função para vincular ao requisito
- Rastrear todos as funções ligadas a determinado requisito
- Rastrear requisitos dependentes
- Gerar um relatório ao final da execução
 
# BNF

<h3>Funcional 2</h3>

[Programa](/Funcional2/src/lf2/plp/functional2/Programa.java) ::= [Expressao](/Funcional2/src/lf2/plp/expressions2/expression/Expressao.java)

Expressao ::= [Valor](/Funcional2/src/lf2/plp/expressions2/expression/Valor.java)

&emsp; &emsp; &emsp; &emsp; &emsp;| [ExpUnaria](/Funcional2/src/lf2/plp/expressions2/expression/ExpUnaria.java)

&emsp; &emsp; &emsp; &emsp; &emsp;| [ExpBinaria](/Funcional2/src/lf2/plp/expressions2/expression/ExpBinaria.java)

&emsp; &emsp; &emsp; &emsp; &emsp;| [ExpDeclaracao](/Funcional2/src/lf2/plp/functional2/expression/ExpDeclaracao.java)

&emsp; &emsp; &emsp; &emsp; &emsp;| [Id](/Funcional2/src/lf2/plp/expressions2/expression/Id.java)

&emsp; &emsp; &emsp; &emsp; &emsp;| [Aplicacao](Funcional2/src/lf2/plp/functional2/expression/Aplicacao.java)

&emsp; &emsp; &emsp; &emsp; &emsp;| [IfThenElse](/Funcional2/src/lf2/plp/functional1/expression/IfThenElse.java)

Valor ::= [ValorConcreto](/Funcional2/src/lf2/plp/expressions2/expression/ValorConcreto.java) | [ValorAbstrato](/Funcional2/src/lf2/plp/functional2/expression/ValorAbstrato.java)


ValorAbstrato ::= [ValorFuncao](/Funcional2/src/lf2/plp/functional2/expression/ValorFuncao.java)

ValorConcreto ::= [ValorInteiro](/Funcional2/src/lf2/plp/expressions2/expression/ValorInteiro.java) | [ValorBooleano](/Funcional2/src/lf2/plp/expressions2/expression/ValorBooleano.java) | [ValorString](/Funcional2/src/lf2/plp/expressions2/expression/ValorString.java)

ValorFuncao ::= "fn" ListId "." Expressao

ExpUnaria ::= ["-" Expressao](/Funcional2/src/lf2/plp/expressions2/expression/ExpMenos.java) | ["not" Expressao](/Funcional2/src/lf2/plp/expressions2/expression/ExpNot.java) | ["length" Expressao](/Funcional2/src/lf2/plp/expressions2/expression/ExpLength.java)

ExpBinaria ::=    [Expressao "+" Expressao](/Funcional2/src/lf2/plp/expressions2/expression/ExpSoma.java)

&emsp; &emsp; &emsp; &emsp; &emsp;| [Expressao "-" Expressao](/Funcional2/src/lf2/plp/expressions2/expression/ExpSub.java)

&emsp; &emsp; &emsp; &emsp; &emsp;| [Expressao "and" Expressao](/Funcional2/src/lf2/plp/expressions2/expression/ExpAnd.java)

&emsp; &emsp; &emsp; &emsp; &emsp;| [Expressao "or" Expressao](/Funcional2/src/lf2/plp/expressions2/expression/ExpOr.java)

&emsp; &emsp; &emsp; &emsp; &emsp;| [Expressao "==" Expressao](/Funcional2/src/lf2/plp/expressions2/expression/ExpEquals.java)

&emsp; &emsp; &emsp; &emsp; &emsp;| [Expressao "++" Expressao](/Funcional2/src/lf2/plp/expressions2/expression/ExpConcat.java)

ExpDeclaracao ::= "let" [DeclaracaoFuncional](/Funcional2/src/lf2/plp/functional1/declaration/DeclaracaoFuncional.java) "in" Expressao

DeclaracaoFuncional ::= [DecVariavel](/Funcional2/src/lf2/plp/functional1/declaration/DecVariavel.java)

&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; | [DecFuncao](/Funcional2/src/lf2/plp/functional2/declaration/DecFuncao.java)

&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;   | [DecComposta](/Funcional2/src/lf2/plp/functional1/declaration/DecComposta.java)

&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;   | DecRequisito

DecVariavel ::= "var" Id "=" Expressao

DecRequisito ::= "req" Listd

DecFuncao ::= DecRequisito "fun" ListId "=" Expressao

DecComposta ::= DeclaracaoFuncional "," DeclaracaoFuncional

ListId ::= Id  |  Id ListId

Aplicacao:= Expressao"(" ListExp ")"

ListExp ::= Expressao  |  Expressao, ListExp