package org.hebert
import java.io.File

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var file = File("./monFile.txt")
    var file2 = File("../fileParent.txt")
    file2.writeText("Hébert,David")
    file.writeText("allo")

    var fileName : File = File("${readln()}")
    println(fileName.readText())
    println("----------")
}