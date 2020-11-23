package me.sschaeffner.abi.liste

/**
 * @author sschaeffner
 */
internal class Knoten(private val daten: Datenelement?, private var nachfolger: Listenelement?) : Listenelement() {
    override fun hintenEinfuegen(daten: Datenelement?): Listenelement? {
        nachfolger = nachfolger!!.hintenEinfuegen(daten)
        return this
    }

    override fun einfuegenVor(daten: Datenelement?, vor: Datenelement?): Listenelement? {
        return if (this.daten!!.schluesselIstGleich(vor!!.schluesselGeben())) {
            Knoten(daten, this)
        } else {
            nachfolger = nachfolger!!.einfuegenVor(daten, vor)
            this
        }
    }

    override fun sortiertEinfuegen(daten: Datenelement?): Listenelement? {
        return if (this.daten!!.istKleinerAls(daten)) {
            nachfolger = nachfolger!!.sortiertEinfuegen(daten)
            this
        } else {
            Knoten(daten, this)
        }
    }

    override fun knotenEntfernen(daten: Datenelement?): Listenelement? {
        return if (this.daten!!.schluesselIstGleich(daten!!.schluesselGeben())) {
            nachfolger
        } else {
            nachfolger = nachfolger!!.knotenEntfernen(daten)
            this
        }
    }

    override fun endeGeben(daten: Datenelement?): Datenelement? {
        return nachfolger!!.endeGeben(this.daten)
    }

    override fun endeEntfernen(daten: Datenelement?): Listenelement? {
        return if (this.daten!!.schluesselIstGleich(daten!!.schluesselGeben())) {
            nachfolger
        } else {
            nachfolger = nachfolger!!.endeEntfernen(daten)
            this
        }
    }

    override fun datenelementGeben(): Datenelement? {
        return daten
    }

    override fun nachfolgerGeben(): Listenelement? {
        return nachfolger
    }

    override fun suchen(schluessel: String?): Datenelement? {
        return if (daten!!.schluesselIstGleich(schluessel)) {
            daten
        } else {
            nachfolger!!.suchen(schluessel)
        }
    }

    override fun informationAusgeben() {
        println(this)
    }

    override fun restlaengeGeben(): Int {
        return nachfolger!!.restlaengeGeben() + 1
    }

    override fun toString(): String {
        return "Knoten(" + daten + ") " + nachfolger
    }
}