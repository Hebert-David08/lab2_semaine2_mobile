package org.hebert

fun main(){
    println(trouveALaMain(5, listOf(1,2,3,4,5)))
    println(trouve(5, listOf(1,2,3,4,5)))
    println(compteALaMain(5, listOf(1,2,3,5,5)))
    println(compte(5, listOf(1,2,3,5,5)))
}

fun trouveALaMain(element: Int, liste: List<Int>): Boolean{
    for(i in liste){
        if (i == element){
            return true
        }
    }
    return false
}

fun trouve(element: Int, liste: List<Int>): Boolean{
    if (liste.contains(element)){
        return true
    }
    return false
}

fun compteALaMain(element: Int, liste: List<Int>): Int{
    var compteur = 0
    for(i in liste){
        if (i == element){
            compteur++
        }
    }
    return compteur
}

fun compte(element: Int, liste: List<Int>): Int{
    var compteur = liste.count({it == element})
    return compteur
}