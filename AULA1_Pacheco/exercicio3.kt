/**relembrando utilização de classes**/
/**casaJoao --> instancia criada**/

class Casa(){
	//Propriedades.
	var cor : String = ""
    
    //Método
    fun abrirPorta(){
        println("Porta aberta")
    }
    fun abrirJanela(){
        println("Janela aberta")
    }
}



fun main(args: Array<String>) {
	var casaJoao = Casa()
    
    casaJoao.cor = "Verde"
    println(casaJoao.cor)
    
    casaJoao.abrirJanela()
    casaJoao.abrirPorta()
	
/**parte 2**/

/**relembrando utilização de classes**/
/**casaJoao --> instancia criada**/

class Casa(cor:String, qtGaragem:Int){
	//Propriedades
	var cor : String 
    var garagem : Int
    
    //Construtor
    init{
        this.cor = cor
        this.garagem = qtGaragem
        println("quantidade de garagens é $garagem")
    }
    
    //Métodos
    fun abrirPorta(qt1:Int){
        println("temos $qt1 portas abertas na casa do João")
    }
    fun abrirJanela(qt2:Int){
        println("temos $qt2 janelas abertas na casa do João")
    }
    fun pintar(cor:String){
        this.cor = cor
        println("$cor é a cor da casa do João")
    }
    fun abrirCasa(){
        this.abrirPorta(3)
        this.abrirJanela(2)        
    }
    
}

fun main(args: Array<String>) {
	var casaJoao = Casa("Verde",2)    
    casaJoao.abrirCasa()
    casaJoao.pintar("Verde")
}
    
