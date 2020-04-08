fun main() {

    var taxaConversao : Float = 1.60934f

    println("Introduza milhas")

    var milhas : Short = readLine()!!.toShort()

    var kms : Int = (milhas * taxaConversao).toInt()

    println("$milhas milhas são $kms kms")

}