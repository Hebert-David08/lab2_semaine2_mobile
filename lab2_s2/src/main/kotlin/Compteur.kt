package org.hebert

fun main(){
    var map = mutableMapOf<String, Int>()

    var chaine = readln()
    for(i in chaine.split(" ")){
        val regex: Regex=i.toRegex()
        val occurences: Int = regex.findAll(chaine).count()
        map[i] = occurences
    }
    println(map)
}