package me.sschaeffner.abi.liste

/**
 * @author sschaeffner
 */
class DatenelementImpl(private val schluessel: String) : Datenelement {
    override fun informationAusgeben() {
        println(this)
    }

    override fun istKleinerAls(daten: Datenelement?): Boolean {
        return schluessel.compareTo(daten!!.schluesselGeben()!!) < 0
    }

    override fun schluesselIstGleich(schluessel: String?): Boolean {
        return this.schluessel == schluessel
    }

    override fun schluesselGeben(): String? {
        return schluessel
    }

    override fun toString(): String {
        return "DatenelementImpl(\"" + schluessel + "\")"
    }
}