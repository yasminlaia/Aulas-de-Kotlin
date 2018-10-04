   /*
     * Collections ou coleções são implementações estrutura de dados
     * -List>> Imutável, tamanho fixo, você colocar ou remover elementos.
    */
    

fun main(args: Array<String>) {

    var listaItens = arraylistOf("MS","SP","RJ","BA")
    println(listaItens)
	  println(listaItens.size)
	  println(listaItens.isEmpty)
    println(listaItens[3])
    listaItens[0] = "RS"
    
    listaItens.add("SP")
    println(listaItens)
    
	listaItens.remove("SP") //Remove o primeiro SP
    println(listaItens)
    
    listaItens.removeAt(2) //remove o elemento da posição 2
	println(listaItens)
    
	}

#UTILIZANDO OUTRA FORMA DE FOR

fun main(args: Array<String>) {
	var listaItens = arrayListOf ("MS","SP","RJ","BA")
    var ultimoElemento = listaItens.size-1
    
    for(i in 0..ultimoElemento){
        //print = permanece na mesma linha
        //println = pula uma linha
        print("$i -")
        println(listaItens[i])
    }
    
	}



