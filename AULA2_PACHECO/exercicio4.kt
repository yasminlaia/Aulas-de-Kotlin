fun main(args: Array<String>) {
    
   val textos = arrayOf(
       "Linha 1....",
       "Linha 2....",
       "Linha 3....",
       "Linha 4...."
   )
   
   //textos.withIndex() = serve para descobrir qual a posição do vetor
   for ((indice,t) in textos.withIndex()){
		println("$indice - $t")
   } 
   for (t in textos){
		println(t)
   }
   for (i in 0..5){
		println("contador = $i")
   }
    
    
}
