# Para cima, para baixo

Implemente um programa que pede ao utilizador para tentar adivinhar um número aleatório. O programa deve estar no ficheiro `Main.kt`.

## Exemplo de funcionamento

(imaginando que o número aleatório era o 400):

```
Estou a pensar num numero entre 1 e 1000. Adivinha qual!
100
Para cima
700
Para baixo
400
Parabens! Acertaste ao fim de 3 tentativas
```

**Nota:** Deverá respeitar rigorosamente este formato, caso contrário falhará nos testes do Drop Project. Note a não utilização de acentos.

Caso o utilizador introduza um palpite inválido, deverá mostrar a mensagem: 

```
Palpite invalido
```

e voltar a pedir um palpite. Os palpites inválidos contam como tentativas.

**Nota:** Terás de utilizar a seguinte função 

```kotlin
fun geraNumero(intervalo: IntRange) = intervalo.random()
```
