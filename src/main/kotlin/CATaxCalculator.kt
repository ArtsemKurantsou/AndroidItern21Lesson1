class CATaxCalculator : TaxCalculator() {
    override fun calculate(bill: Bill): Float {
        return bill.getAmountD() * getTaxPercent("CA") + bill.getAmountD() + bill.getTipsD()
    }
}