package org.hebert

fun main(){
    println(repete(4,2))
}

fun repete(n : Int, nombreFois: Int) : List<Int>{
    var uneListe = mutableListOf<Int>()

    for (i in 1..n){
        for (j in 1..nombreFois){
            uneListe.add(i)
        }
    }
    return uneListe
}