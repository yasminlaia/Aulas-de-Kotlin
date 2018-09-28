/**só é possivel criar classes filhas no kotlin colocando open**/
open class Animal(){

//Para aceitar fazer o override, é necessário colocar um open na função que sera chamada
    open fun dormir(){
        println("Dormindo")
    }
    fun comer(){
        println("Comendo")
    }
}

//SuperClasse cachorro está herdando tudo da classe animal
class Cachorro: Animal(){
//override = sobrescrita da funcao dormir
    	override fun dormir(){
//chama super(superclasse) e chama a funcao original(dormir)
            super.dormir()
            println("Como um cachorro")
        }
    	fun latir(){
        println("Latindo")
    }
}

class Ave(){}
fun main(args:Array<String>){
  var cao = Cachorro()
  var piupiu = Ave()
    
  cao.dormir()
  cao.latir()
  piupiu.
}
