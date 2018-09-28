/**relembrando... vetor sempre começa na posição 0**/
/**além de poder declararar como var, podemos declarar como val, que é uma constante. Ex: numero do PI (3.14)**/

fun main(args: Array<String>) {
    val PI = 3.14
    
    var vetor = arrayOf ("Maria","João","Ana",10)
    var vetorInteiros = intArrayOf(12,34,1,-10)
    
    for(i in vetorInteiros.indices) {
        println(vetorInteiros[i])
    }
    
    var total_mes = 0
    var totalMes = 0
    
    
    vetorInteiros[2] = 11
    
    println(vetor[1])
    println(vetor[2])
	
}
