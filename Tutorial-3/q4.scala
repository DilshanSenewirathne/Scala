object question4 extends App{
    def bookPrice(x:Int):Double={
        return x*24.95
    }

    def discount(amount:Double):Double={
        return amount*.4
    }

    def shippingCost(x:Int):Double={
        return if(x>50) 3+(x-50)*.75 else 3
    }

    val total_cost=bookPrice(60)-discount(bookPrice(60))+shippingCost(60)

    println(total_cost)
   
}