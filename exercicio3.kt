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
    
