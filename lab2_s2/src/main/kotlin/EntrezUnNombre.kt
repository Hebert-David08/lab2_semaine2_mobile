package org.hebert

fun main(){
    var estNb = false
    while (!estNb){
        print("Veuillez entrer un nombre : ")
        var input = readln()
        try{
            input.toInt()
            estNb = true
            println("Merci, votre nombre est " + input + ".")
        }
        catch(error: Exception){
            estNb = false
        }
    }
}