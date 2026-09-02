package org.hebert

fun main(){
    var liste : List<String> = readln().split(" ").sorted()
    var set: Set<String> = liste.toSet()
    println(set)
}