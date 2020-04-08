import org.junit.Test
import pt.ulusofona.deisi.StdinStdoutHelper

class TestTeacherConversor {

    @Test(timeout = 500)
    fun testConversor1() {
        val helper = StdinStdoutHelper(true)
                .expectOutput("Introduza milhas")
                .simulateInput("30")
                .expectOutput("30 milhas são 48 kms")

        helper.start()
        main()
        helper.stop()
    }

    @Test(timeout = 500)
    fun testConversor2() {
        val helper = StdinStdoutHelper(true)
                .expectOutput("Introduza milhas")
                .simulateInput("50")
                .expectOutput("50 milhas são 80 kms")

        helper.start()
        main()
        helper.stop()
    }

    @Test(timeout = 500)
    fun testConversor3() {
        val helper = StdinStdoutHelper(true)
                .expectOutput("Introduza milhas")
                .simulateInput("75")
                .expectOutput("75 milhas são 120 kms")

        helper.start()
        main()
        helper.stop()
    }
}