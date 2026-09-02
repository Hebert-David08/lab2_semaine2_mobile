package org.hebert

fun main() {
    println(triInverseALaMain(listOf(2.5, 5.5, 7.7, 9.9)))
    println(triInverse(listOf(2.5,5.5,7.7,9.9)))
}

fun triInverseALaMain(liste: List<Double>) : List<Double>{
    var mutableList = mutableListOf<Double>()

    for(i in liste.size downTo 1){
        mutableList.add(liste[i-1])
    }
    return mutableList
}

fun triInverse(liste: List<Double>) : List<Double>{
    return liste.asReversed()
}