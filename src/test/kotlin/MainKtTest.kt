import kotlin.test.Test
import kotlin.test.assertEquals

class MainKtTest {

    @Test
    fun commission() {
        val transaction = 15_000
        val card = "Мир"
        val allTransactions = 0

        val result = commission(transaction, card, allTransactions)
        assertEquals("Комиссия с $transaction рублей не взимается",result)
    }

    @Test
    fun commissionVisa() {
        val transaction = 85_000
        val card = "Visa"
        val allTransactions = 150_000

        val result = commission(transaction, card, allTransactions)
        assertEquals("Комиссия с $transaction рублей составит 737.5 рублей",result)
    }
}