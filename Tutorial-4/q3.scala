object question3 extends App{
    
    def toUpper(str:String):String={
        
        return str.toUpperCase
    }

    def toLower(str:String):String={
        return str.toLowerCase
    }

    def formatNames(str:String,format:String):String=format match{
        case format if (format=="toUpper") => toUpper(str)
        case format if (format=="toLower") => toLower(str)
    }

    println(formatNames("Benny","toUpper"))
    println(formatNames("Niroshan","toUpper"))
    println(formatNames("Saman","toLower"))
    println(formatNames("Kumara","toUpper"))

    
}