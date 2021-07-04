open class TaxCalculator {

    open fun calculate(bill: Bill): Float {
        return bill.getAmountD() * TAX_DEF + bill.getAmountD() + bill.getTipsD()
    }

    fun getTaxPercent(state: String): Float {
        return when (state) {
            "CA" -> TAX_CA
            "TX" -> TAX_TX
            else -> TAX_DEF
        }
    }

    companion object {
        private const val TAX_DEF = 0.10f
        private const val TAX_CA = 0.10f
        private const val TAX_TX = 0.13f
    }
}