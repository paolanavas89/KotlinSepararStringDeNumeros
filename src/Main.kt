 fun main(){
    val lista = listOf("Hola",2,3,"¿",0.1,"Que",1,"tal",0.9,"?")
    var resul=0.0
    var cadena =""
    var i=0

    repeat(lista.size){
        if(lista[i] is String)
            cadena =cadena +" "+ lista[i]
        else if(lista[i] is Int) {
            val numero = lista[i] as Int
            resul += numero
        }else if (lista[i] is Double){
            resul += lista[i] as Double
        }
        i++
    }
    println(resul)
    println(cadena)

}