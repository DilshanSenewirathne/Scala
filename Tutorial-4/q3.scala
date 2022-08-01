object question3 extends App{
    
    def toLower(str:String):String= str.toLowerCase
    def toUpper(str:String):String= str.toUpperCase

    def formatNames(fun:String => String,name:String):Unit={
        val formatText = fun(name)
        print(formatText)
        
    }

    formatNames(toUpper,"Benny")
    println()

    formatNames(toUpper,"Niroshan".slice(0,2))
    formatNames(toLower,"Niroshan".slice(2,8))
    println()

    formatNames(toLower,"Saman".slice(0,6))
    println()

    formatNames(toUpper,"Kumara".slice(0,1))
    formatNames(toLower,"Kumara".slice(1,5))
    formatNames(toUpper,"Kumara".slice(5,6))

    
}
