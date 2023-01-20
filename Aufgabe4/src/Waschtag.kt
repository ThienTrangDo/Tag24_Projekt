import kotlin.contracts.contract

fun main() {
    val shirts = mutableListOf(
        "rot", "blau", "rot", "blau", "blau", "rot", "rot", "blau", "blau",
        "blau", "rot", "blau", "rot", "blau", "blau", "rot", "rot", "blau"
    )

    var redShirts: MutableList <String> = mutableListOf()
    var blueShirts = mutableListOf<String>()

    for (colour in shirts)
        if (colour == "rot"){
            redShirts.add(colour)
            continue
        } else {
            blueShirts.add(colour)
        }
    println(redShirts)
    println("Es sind ${redShirts.size} rote T Shirts.")
    println(blueShirts)
    println("Es sind ${blueShirts.size} blaue T Shirts.")
}

/*
Es ist Waschtag.
Wir haben einen Haufen an T-Shirts (veränderbare Liste shirts) die wir waschen wollen.
Dazu müssen wir die T-Shirts erstmal nach Farbe sortieren.

Schreibe eine Schleife deiner Wahl, die die Liste an T-Shirts durchgeht.
Wenn die Farbe Rot ist, füge das T-Shirt der Liste redShirts hinzu. Wenn die Farbe Blau ist,
füge das T-Shirt der Liste blueShirts hinzu.
Wie viele T-Shirts jeder Farbe gibt es?
 */