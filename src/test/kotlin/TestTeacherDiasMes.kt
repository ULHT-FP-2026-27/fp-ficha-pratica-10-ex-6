import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import pt.ulusofona.deisi.StdinStdoutHelper

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestTeacherDiasMes {

    @Test(timeout = 500)
    fun test01CalculaJaneiro() {
        val helper = StdinStdoutHelper(true)
                .expectOutput("Introduza o mês (1-12)")
                .simulateInput("1")
                .expectOutput("O mês 1 tem 31 dias")

        helper.start()
        main()
        helper.stop()
    }

    @Test(timeout = 500)
    fun test02CalculaAbril() {
        val helper = StdinStdoutHelper(true)
                .expectOutput("Introduza o mês (1-12)")
                .simulateInput("4")
                .expectOutput("O mês 4 tem 30 dias")

        helper.start()
        main()
        helper.stop()
    }

    @Test(timeout = 500)
    fun test03CalculaNovembro() {
        val helper = StdinStdoutHelper(true)
                .expectOutput("Introduza o mês (1-12)")
                .simulateInput("11")
                .expectOutput("O mês 11 tem 30 dias")

        helper.start()
        main()
        helper.stop()
    }

    @Test(timeout = 500)
    fun test04CalculaFevereiro2020() {
        val helper = StdinStdoutHelper(true)
                .expectOutput("Introduza o mês (1-12)")
                .simulateInput("2")
                .expectOutput("Introduza o ano (ou enter se quiser o ano atual)")
                .simulateInput("2020")
                .expectOutput("O mês 2 em 2020 tem 29 dias")

        helper.start()
        main()
        helper.stop()
    }

    @Test(timeout = 500)
    fun test05CalculaFevereiro2021() {
        val helper = StdinStdoutHelper(true)
                .expectOutput("Introduza o mês (1-12)")
                .simulateInput("2")
                .expectOutput("Introduza o ano (ou enter se quiser o ano atual)")
                .simulateInput("2021")
                .expectOutput("O mês 2 em 2021 tem 28 dias")

        helper.start()
        main()
        helper.stop()
    }

    @Test(timeout = 500)
    fun test06CalculaFevereiroAnoAtual() {
        val helper = StdinStdoutHelper(true)
                .expectOutput("Introduza o mês (1-12)")
                .simulateInput("2")
                .expectOutput("Introduza o ano (ou enter se quiser o ano atual)")
                .simulateInput("")
                .expectOutput("O mês 2 em 2020 tem 29 dias")

        helper.start()
        main()
        helper.stop()
    }

    @Test(timeout = 500)
    fun test07MesInvalido1() {
        val helper = StdinStdoutHelper(true)
                .expectOutput("Introduza o mês (1-12)")
                .simulateInput("13")
                .expectOutput("Mês inválido")

        helper.start()
        main()
        helper.stop()
    }

    @Test(timeout = 500)
    fun test08MesInvalido2() {
        val helper = StdinStdoutHelper(true)
                .expectOutput("Introduza o mês (1-12)")
                .simulateInput("-1")
                .expectOutput("Mês inválido")

        helper.start()
        main()
        helper.stop()
    }

    @Test(timeout = 500)
    fun test09MesInvalido3() {
        val helper = StdinStdoutHelper(true)
                .expectOutput("Introduza o mês (1-12)")
                .simulateInput("ola")
                .expectOutput("Mês inválido")

        helper.start()
        main()
        helper.stop()
    }

    @Test(timeout = 500)
    fun test10MesInvalido4() {
        val helper = StdinStdoutHelper(true)
                .expectOutput("Introduza o mês (1-12)")
                .simulateInput("\u0004")
                .expectOutput("Mês inválido")

        helper.start()
        main()
        helper.stop()
    }

}