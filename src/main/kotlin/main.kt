fun main(args: Array<String>) {
    solution()
}

const val TAX_CA = 0.13f
const val TAX_TX = 0.10f
const val TAX_DEFAULT = 0.10f

fun getCurrentState(): String {
    return "CA"
}

fun getBill(): Array<Any> {
    return arrayOf(
        "cashier#1",
        "100$",
        3,
        "water",
        "espresso",
        "caesar",
        "10$"
    )
}

fun solution() {
    //Calculate price with TAX based on state
    //For Texas TAX is also applied to tips

}