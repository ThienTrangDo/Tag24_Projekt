fun main() {
    val monate: List<String> = listOf(
        "Januar", "Februar", "März", "April", "Mai", "Juni",
        "Juli", "August", "September", "Oktober", "November", "Dezember"
    )

    for(monat in monate){
        println("Der Monat $monat ist im ${ergebnis(monat)}")
    }

    println()

    for(monat in monate){
        if(ergebnis(monat) == "Sommer"){
            println("Der Monat $monat ist im ${ergebnis(monat)}")
        }
    }

    println()

    for(monat in monate) {
        if (monat != "Juni" && monat != "September") {
            println("Der Monat $monat ist im ${ergebnis(monat)}")
        }
    }

}

fun ergebnis(monat: String): String {
     when (monat) {
         "Dezember","Januar", "Februar" -> return "Winter"
         "März", "April", "Mai" -> return "Frühling"
         "Juni", "Juli", "August" -> return "Sommer"
         "September", "Oktober", "November" -> return "Herbst"
     }
    return "Kein Ergebnis"
}