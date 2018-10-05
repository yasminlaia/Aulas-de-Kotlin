/* PARA TIRAR DUVIDA NA PROXIMA AULA
 	* Vetor = [10,30,50,5,30,10] >>> Palintromo
    * Vetor = [10,30,50,5,50,20,-1] >>> Não é palintromo 
*/

fun main(args: Array<String>){
    var vetor1 = arrayListOf (10,30,50,5,30,10)
    var vetor2 = arrayListOf (10,30,50,5,50,20,-1)
    
    for (i in vetor1){
        if ((vetor1.equals(vetor1.reverse()) || (vetor2.equals(vetor2.reverse()){
            println("É palindromo")
        }
        else{
            println("Não é palindromo")
        }
	}
 }
