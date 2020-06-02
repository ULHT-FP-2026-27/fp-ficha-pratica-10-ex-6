import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import pt.ulusofona.deisi.StdinStdoutHelper

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestTeacherMaior3Numeros {

    @Test(timeout = 500)
    fun test01CalculaMaior() {
        val helper = StdinStdoutHelper(true)
                .expectOutput("Introduza o primeiro numero")
                .simulateInput("1")
                .expectOutput("Introduza o segundo numero")
                .simulateInput("2")
                .expectOutput("Introduza o terceiro numero")
                .simulateInput("3")
                .expectOutput("O maior numero e: 3")

        helper.start()
        main()
        helper.stop()
    }

    @Test(timeout = 500)
    fun test02CalculaMaior2() {
        val helper = StdinStdoutHelper(true)
                .expectOutput("Introduza o primeiro numero")
                .simulateInput("4")
                .expectOutput("Introduza o segundo numero")
                .simulateInput("1")
                .expectOutput("Introduza o terceiro numero")
                .simulateInput("2")
                .expectOutput("O maior numero e: 4")

        helper.start()
        main()
        helper.stop()
    }

    @Test(timeout = 500)
    fun test03CalculaMaior3() {
        val helper = StdinStdoutHelper(true)
                .expectOutput("Introduza o primeiro numero")
                .simulateInput("4")
                .expectOutput("Introduza o segundo numero")
                .simulateInput("5")
                .expectOutput("Introduza o terceiro numero")
                .simulateInput("2")
                .expectOutput("O maior numero e: 5")

        helper.start()
        main()
        helper.stop()
    }

    @Test(timeout = 500)
    fun test04InputInvalido1() {
        val helper = StdinStdoutHelper(true)
                .expectOutput("Introduza o primeiro numero")
                .simulateInput("ola")
                .expectOutput("Numero invalido!")

        helper.start()
        main()
        helper.stop()
    }

    @Test(timeout = 500)
    fun test05InputInvalido2() {
        val helper = StdinStdoutHelper(true)
                .expectOutput("Introduza o primeiro numero")
                .simulateInput("3")
                .expectOutput("Introduza o segundo numero")
                .simulateInput("")
                .expectOutput("Numero invalido!")

        helper.start()
        main()
        helper.stop()
    }

    @Test(timeout = 500)
    fun test06InputInvalido3() {
        val helper = StdinStdoutHelper(true)
                .expectOutput("Introduza o primeiro numero")
                .simulateInput("3")
                .expectOutput("Introduza o segundo numero")
                .simulateInput("5")
                .expectOutput("Introduza o terceiro numero")
                .simulateInput("\u0004")
                .expectOutput("Numero invalido!")

        helper.start()
        main()
        helper.stop()
    }



}