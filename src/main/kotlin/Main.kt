fun main() {
    println("Introduza o primeiro numero")
    val primeiro = readLine()?.toIntOrNull()
    if (primeiro == null) {
        println("Numero invalido!")
    } else {
        println("Introduza o segundo numero")
        val segundo = readLine()?.toIntOrNull()
        if (segundo == null) {
            println("Numero invalido!")
        } else {
            println("Introduza o terceiro numero")
            val terceiro = readLine()?.toIntOrNull()
            if (terceiro == null) {
                println("Numero invalido!")
            } else {
                if (primeiro > segundo && primeiro > terceiro) {
                    println("O maior numero e: $primeiro")
                } else if (segundo > terceiro) {
                    println("O maior numero e: $segundo")
                } else {
                    println("O maior numero e: $terceiro")
                }
            }
        }
    }
}