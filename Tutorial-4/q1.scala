object question1 extends App{
    
    def interest(amount:Int):Double= amount match{
        case amount if amount < 20000 => amount*.02
        case amount if amount < 200000 => amount*.04
        case amount if amount < 2000000 => amount*.035
        case _=> amount*.65

    }

    println(interest(100000000))
}