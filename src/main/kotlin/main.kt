fun main() {
    val com = commission(85000, "Visa", 150000)
    println(com)
}

val dailyLimit = 150_000
val monthlyLimit = 600_000
val monthlyLimitMastercard = 75_000
val commisionMastercard = 0.006
val addCommissinMastercard = 20
val commisionVisa = 0.0075
val minCommissionVisa = 35
fun commission(transaction: Int, card: String = "Мир", allTransactions: Int = 0): String {
    return when {
        (transaction > dailyLimit || allTransactions + transaction > monthlyLimit) -> "Превышен лимит переводов"
        (card == "Mastercard" && transaction <= monthlyLimitMastercard) -> "Комиссия с $transaction рублей не взимается"
        (card == "Mastercard" && transaction >= monthlyLimitMastercard) -> "Комиссия с $transaction рублей составит ${(transaction - monthlyLimitMastercard) * commisionMastercard + addCommissinMastercard} рублей"
        card == "Visa" && (transaction * commisionVisa) < minCommissionVisa -> "Комиссия с $transaction рублей составит 35 рублей"
        card == "Visa" && (transaction * commisionVisa) >= minCommissionVisa -> "Комиссия с $transaction рублей составит ${transaction * commisionVisa} рублей"
        else -> "Комиссия с $transaction рублей не взимается"
    }
}
