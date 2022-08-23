object question2 extends App {

    def isPrime(n:Int,p:Int=2):Boolean= n match{
        case n if (n==p) => true
        case n if (n%p==0) => false
        case _ => isPrime(n,p+1)
    }

    def primeSeq(n:Int,i:Int=2):Unit={
        if(n==i) return
        if(isPrime(i)) println(i)

        primeSeq(n,i+1)

    }

    primeSeq(20)


}