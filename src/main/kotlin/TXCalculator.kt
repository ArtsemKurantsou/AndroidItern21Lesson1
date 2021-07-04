class TXCalculator : TaxCalculator() {
    override fun calculate(bill: Bill): Float {
        return bill.getFullAmount() * getTaxPercent("TX") + bill.getFullAmount()
    }
}