package me.sschaeffner.abi.liste

/**
 * @author sschaeffner
 */
internal abstract class Listenelement {
    abstract fun hintenEinfuegen(daten: Datenelement?): Listenelement?
    abstract fun einfuegenVor(daten: Datenelement?, vor: Datenelement?): Listenelement?
    abstract fun sortiertEinfuegen(daten: Datenelement?): Listenelement?
    abstract fun knotenEntfernen(daten: Datenelement?): Listenelement?
    abstract fun endeGeben(daten: Datenelement?): Datenelement?
    abstract fun endeEntfernen(daten: Datenelement?): Listenelement?
    abstract fun datenelementGeben(): Datenelement?
    abstract fun nachfolgerGeben(): Listenelement?
    abstract fun suchen(schluessel: String?): Datenelement?
    abstract fun informationAusgeben()
    abstract fun restlaengeGeben(): Int
    abstract override fun toString(): String
}