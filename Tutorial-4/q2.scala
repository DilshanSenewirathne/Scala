object question2 extends App{

    def PatternMatching()=scala.io.StdIn.readInt() match{
        case x if x<=0 => "Negative/Zero"
        case x if x%2==0 => "Even"
        case x if x%2==1 => "Odd"
    }

    printf("Enter number: ")
    println(PatternMatching())
   
}