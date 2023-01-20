fun main() {
    val monate: List<String> = listOf(
        "Januar", "Februar", "März", "April", "Mai", "Juni",
        "Juli", "August", "September", "Oktober", "November", "Dezember"
    )

    for (i in monate)
        ergebnis(i)

}

fun ergebnis(monat: String) {
     when (monat) {
         "Dezember", "Januar", "Februar" -> "Winter"
         "März", "April", "Mai" -> "Frühling"
         "Juni", "Juli", "August" -> "Sommer"
         "September", "Oktober", "November" -> println("Herbst")
     }
}

/*
b)
Schreibe jetzt in der main()-Funktion eine Schleife, die alle Monate mit ihrer Jahreszeit in der Konsole ausgibt.

In der Konsole sollte dann folgendes ausgegeben werden:
Der Januar ist im Winter
Der Februar ist im Winter
Der MÃ¤rz ist im FrÃ¼hling
...
Der Dezember ist im Winter

c)
Schreibe zusätzlich eine Schleife deiner Wahl, die nur die Sommermonate in der Konsole ausgibt.

d)
Schreibe zusätzlich eine Schleife deiner Wahl, die alle Monate außer den Juni und den September ausgibt.

e)
Schreibe zusätzlich eine Schleife deiner Wahl, die ab dem März jeden zweiten Monat ausgibt.
 */