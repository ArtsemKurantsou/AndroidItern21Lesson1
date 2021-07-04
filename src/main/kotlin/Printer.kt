class Printer {
    fun print(bill: Bill){
       for (dish in bill.dishes) {
           println(dish)
       }
    }
}