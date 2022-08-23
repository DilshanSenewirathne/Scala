object question1 extends App {

    def prime(n:Int,p:Int=2):Boolean= n match{
        case x if (n==p) => true
        case x if (n%p==0) => false
        case _ => prime(n,p+1)
    }

    println(prime(5))
    println(prime(8))
    
}