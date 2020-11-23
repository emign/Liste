package me.sschaeffner.abi.liste

/**
 * @author sschaeffner
 */
internal class Abschluss : Listenelement() {
    override fun hintenEinfuegen(daten: Datenelement?): Listenelement? {
        return Knoten(daten!!, this)
    }

    override fun einfuegenVor(daten: Datenelement?, vor: Datenelement?): Listenelement? {
        return this
    }

    override fun sortiertEinfuegen(daten: Datenelement?): Listenelement? {
        return Knoten(daten!!, this)
    }

    override fun knotenEntfernen(daten: Datenelement?): Listenelement? {
        return this
    }

    override fun endeGeben(daten: Datenelement?): Datenelement? {
        return daten
    }

    override fun endeEntfernen(daten: Datenelement?): Listenelement? {
        return this
    }

    override fun datenelementGeben(): Datenelement? {
        return null
    }

    override fun nachfolgerGeben(): Listenelement? {
        return this
    }

    override fun suchen(schluessel: String?): Datenelement? {
        return null
    }

    override fun informationAusgeben() {}
    override fun restlaengeGeben(): Int {
        return 0
    }

    override fun toString(): String {
        return "Abschluss()"
    }
}