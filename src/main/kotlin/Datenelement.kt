package me.sschaeffner.abi.liste

/**
 * @author sschaeffner
 */
interface Datenelement {
    fun informationAusgeben()
    fun istKleinerAls(daten: Datenelement?): Boolean
    fun schluesselIstGleich(schluessel: String?): Boolean
    fun schluesselGeben(): String?
}