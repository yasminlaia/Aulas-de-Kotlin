fun mostraMensagem(nome:String){
    println("$nome")
}

fun soma(n1:Int,n2:Int):Int{
    var total = n1+ n2
    return total
}

fun main(args: Array<String>) {
    var valor:Int
    
    valor = soma(10,12)
    
    mostraMensagem("João")
    mostraMensagem("$valor")
    
}
