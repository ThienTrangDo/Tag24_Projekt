fun main() {
    val numbers: List<Int> = listOf(34, 42, 235, 42, 42, 24, 42, 42, 7346, 34)

    for (i in numbers){
        if (i == 42)
            continue
        println(i)
    }
}

/*

Das Schlüsselwort continue wird verwendet, um vorzeitig einen Durchlauf einer Schleife zu beenden.
In der Aufgabendatei ist eine Liste numbers vorgegeben.
Schreibe eine Schleife, die vom Anfang der Liste ausgehend eine Zahl nach der Anderen prüft.
Wenn die Zahl gleich 42 ist, beenden den momentanen Durchlauf der Schleife mit continue, ansonsten geben wir die Zahl in der Konsole aus.

In der Konsole sollte dann folgendes zu sehen sein:

34
235
24
7346
34


 */