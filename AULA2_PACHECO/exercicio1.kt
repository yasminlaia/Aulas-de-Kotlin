/**------------------------------------------------------------------------------------------------------------------------------------**/
fun main(args: Array<String>) {
	var idade = 14
    
    if (idade<16){
        println("Não pode votar")
    }
    if (((idade >= 16) && (idade<18)) || (idade>60)){
        println("Pode votar")
    }
    if ((idade>=18) && (idade<60)){
        println("Deve votar")
    }
}
/**--CÓDIGO PARA REPRESENTAR O CASE EM OUTRAS LINGUAGENS----------------------------------------------------------------------------------------------------------------------------------**/
fun main(args: Array<String>) {
	var opcao = 4
    
    when(opcao){
        1 -> {
            println("Café com leite")
        	println("Com desconto")
        }
        2,3 -> println("Chocolate quente")
        else -> println("Opção inválida")
    }
}
/*----------------OUTRA FORMA DE ESCREVER -----------------------------------------------------------------------------------------------------------------------*/
fun main(args: Array<String>) {
	var opcao = 4
    
    var escolha = when(opcao){
        1 -> "Café com leite"
        2,3 -> "Chocolate quente"
        else -> "Opção inválida"
    }
    println(escolha)
}
