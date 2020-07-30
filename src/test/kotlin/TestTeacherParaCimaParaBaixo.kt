import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkStatic
import org.junit.BeforeClass
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import pt.ulusofona.deisi.StdinStdoutHelper
import kotlin.random.Random

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestTeacherParaCimaParaBaixo {
    companion object {
        @BeforeClass
        @JvmStatic
        fun setup() {
            mockkStatic("MainKt")
            every { geraNumero(1..1000) } returns 200
        }
    }

    @Test(timeout = 500)
    fun test01AdivinhaAPrimeira() {

        val helper = StdinStdoutHelper(true)
                .expectOutput("Estou a pensar num numero entre 1 e 1000. Adivinha qual!")
                .simulateInput("200")
                .expectOutput("Parabens! Acertaste ao fim de 1 tentativas")

        helper.start()
        main()
        helper.stop()
    }

    @Test(timeout = 500)
    fun test02AdivinhaASegunda() {

        val helper = StdinStdoutHelper(true)
                .expectOutput("Estou a pensar num numero entre 1 e 1000. Adivinha qual!")
                .simulateInput("100")
                .expectOutput("Para cima")
                .simulateInput("200")
                .expectOutput("Parabens! Acertaste ao fim de 2 tentativas")

        helper.start()
        main()
        helper.stop()
    }

    @Test(timeout = 500)
    fun test03AdivinhaATerceira() {

        val helper = StdinStdoutHelper(true)
                .expectOutput("Estou a pensar num numero entre 1 e 1000. Adivinha qual!")
                .simulateInput("100")
                .expectOutput("Para cima")
                .simulateInput("300")
                .expectOutput("Para baixo")
                .simulateInput("200")
                .expectOutput("Parabens! Acertaste ao fim de 3 tentativas")

        helper.start()
        main()
        helper.stop()
    }

    @Test(timeout = 500)
    fun test04PalpiteInvalido1() {

        val helper = StdinStdoutHelper(true)
                .expectOutput("Estou a pensar num numero entre 1 e 1000. Adivinha qual!")
                .simulateInput("ola")
                .expectOutput("Palpite invalido")
                .simulateInput("200")
                .expectOutput("Parabens! Acertaste ao fim de 2 tentativas")

        helper.start()
        main()
        helper.stop()
    }

    @Test(timeout = 500)
    fun test05PalpiteInvalido2() {

        val helper = StdinStdoutHelper(true)
                .expectOutput("Estou a pensar num numero entre 1 e 1000. Adivinha qual!")
                .simulateInput("1500")
                .expectOutput("Palpite invalido")
                .simulateInput("200")
                .expectOutput("Parabens! Acertaste ao fim de 2 tentativas")

        helper.start()
        main()
        helper.stop()
    }


}