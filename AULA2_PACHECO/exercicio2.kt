fun main(args: Array<String>) {
	
    //null safety. a ? e !! permite que eu declare uma variável e aceite a mesma sem o
    //código dar erro
	var texto: String? = null
	println(texto)
    
    println(texto?.length)
    
    //null pointer exception
    println(texto!!.length)
}
