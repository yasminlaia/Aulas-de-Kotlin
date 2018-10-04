#USANDO CONTADOR MAIS RESULTANDO EM UM NUMERO CRESCENTE A PARTIR DO #0
fun main(args: Array<String>) {
    var contador = 0
    
    while(contador<5){
    	println("Contador = $contador")
        //contador = contador + 1
        contador++
    }
}

#USANDO CONTADOR MENOS RESULTANDO EM UM NUMERO DECRESCENTE A PARTIR DO #5
fun main(args: Array<String>) {
    var contador = 5
    
    while(contador>0){
    	println("Contador = $contador")
        //contador = contador - 1
        contador--
    }
}
