package args

class ArgsParser(val schema: String, val args: Array<String>){
    fun hello(): String{
        return "Hello, world!"
    }
}

fun main(args : Array<String>) {
    var argsParser = ArgsParser("schema", args)
    println(argsParser.schema)
}