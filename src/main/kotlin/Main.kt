fun leNumero() = readLine()?.toIntOrNull()

fun geraNumero(intervalo: IntRange) = intervalo.random()

fun main() {
    val intervalo = 1..1000
    var tentativas = 0
    val numero = geraNumero(intervalo)

    println("Estou a pensar num numero entre ${intervalo.first} e ${intervalo.last}." +
            " Adivinha qual!")

    do {
        val palpite = leNumero()
        tentativas++
        when {
            palpite == null -> println("Palpite invalido")
            palpite !in intervalo -> println("Palpite invalido")
            palpite < numero -> println("Para cima")
            palpite > numero -> println("Para baixo")
            else -> println("Parabens! Acertaste ao fim de " +
                    "$tentativas tentativas"
            )
        }
    } while (palpite != numero)
}