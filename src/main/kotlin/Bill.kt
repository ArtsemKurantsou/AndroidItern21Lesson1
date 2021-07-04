class Bill(
    var cashier: String,
    var amount: String,
    var dishes: List<String>,
    var tips: String
) {
    fun getAmountD(): Int {
        return amount.replace("$", "").toInt()
    }

    fun getTipsD(): Int {
        return tips.replace("$", "").toInt()
    }

    fun getFullAmount(): Int {
        return  getAmountD() + getTipsD()
    }
}