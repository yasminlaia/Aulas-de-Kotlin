//private serve para deixar disponivel apenas uma classe em especifico
//private --> Visível apenas na classe
//protected --> Visivel na classe e nas classes
//public --> Visível sempre (é o padrão)
//internal --> Visível dentro do módulo

class ContaBancaria(saldoInicial:Double){
    private var saldo: Double
    
    init {
        this.saldo = saldoInicial
    }
    fun consulta(){
    	println("Seu saldo é $saldo")
    }
    fun deposito(valor:Double){
        this.saldo = this.saldo + valor
        
    }
    fun saque(valor:Double){
        this.saldo = this.saldo - valor
    }
}

fun main(args:Array<String>){
	val cc = ContaBancaria(100.00)
    
    cc.consulta()
    cc.deposito(20.00)
    cc.consulta()
}
