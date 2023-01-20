fun main() {
    val fees = listOf(363.34, 235.45, 753.45, 234.56, 658.33, 22.65, 2623.46, 475.54)

    ergebnis(fees)
}

fun ergebnis(items: List<Double>) {
    var sum = 0.00
    for (i in items) {
        sum += i
    }
    println(sum)
}


/*
Wir kriegen von unserem Chef eine Liste mit Gebühren, die zu bezahlen sind.
Er möchte wissen, wie viel er insgesamt Zahlen muss.

Schreibe eine Funktion, die eine Liste mit Gebühren als Parameter bekommt,
die Gebühren zusammen addiert und das Ergebnis wieder zurückgibt.

Du darfst für deine Lösung nicht die sum() Funktion verwenden.
Löse das Problem mit einer Schleife.
Deine Funktion stimmt, wenn du in etwa 5366.78 heraus bekommst,
(Das Ergebnis kann sich von Computer zu Computer ein ganz kleines bisschen Unterscheiden).

 */