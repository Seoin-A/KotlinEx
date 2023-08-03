fun main(args: Array<String>) {
    val korean = Korea("Republic of Korea", "Seoul", " Korean")
    korean.singNationalAnthem()

    val Usa = Usa("Unted States of America","Washinton D.C.", "English")
    Usa.singNationalAnthem()

    korean.printlanguage()
    Usa.printlanguage()

    Usa.printFullName()
}


