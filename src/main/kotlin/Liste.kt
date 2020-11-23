package me.sschaeffner.abi.liste

/**
 * Implementation einer Liste im perfekten Kompositum.
 *
 * Methodennamen nach Brichzin, Freiberger, Reinold und Wiedemann, "Informatik - Oberstufe 1" (Oldenbourg, 2009)
 *
 * @author sschaeffner
 */
class Liste {
    private var anfang: Listenelement?

    /**
     * Fügt einen neuen Knoten mit gegebenem Datenelement an die erste Stelle der Liste ein.
     *
     * @param daten einzufügendes Datenelement
     */
    fun vorneEinfuegen(daten: Datenelement?) {
        val alterAnfang = anfang
        anfang = Knoten(daten!!, alterAnfang!!)
    }

    /**
     * Fügt einen neuen Knoten mit gegebenem Datenelement an die letzte Stelle der Liste ein.
     *
     * @param daten einzufügendes Datenelement
     */
    fun hintenEinfuegen(daten: Datenelement?) {
        anfang = anfang!!.hintenEinfuegen(daten)
    }

    /**
     * Fügt einen neuen Knoten mit gegebenem Datenelement vor einen Knoten mit gegebenem Datenelement ein.
     *
     * @param daten einzufügendes Datenelement
     * @param vor   Datenelement, vor dessen Knoten der neue Knoten einzufügen ist
     */
    fun einfuegenVor(daten: Datenelement?, vor: Datenelement?) {
        anfang = anfang!!.einfuegenVor(daten, vor)
    }

    /**
     * Fügt einen neuen Knoten mit gegebenem Datenelement so ein, dass eine sortierte Liste entsteht,
     * wenn alle Datenelemente auf diese Weise eingefügt werden.
     *
     * @param daten einzufügendes Datenelement
     */
    fun sortiertEinfuegen(daten: Datenelement?) {
        anfang = anfang!!.sortiertEinfuegen(daten)
    }

    /**
     * Entfernt einen Knoten mit einem gegebenem Datenelement.
     *
     * Diese Methode entfernt nur das erste Vorkommnis eines Knoten mit dem gegebenen Datenelement.
     *
     * @param daten Datenelement, dessen Knoten zu entfernen ist
     */
    fun knotenEntfernen(daten: Datenelement?) {
        anfang = anfang!!.knotenEntfernen(daten)
    }

    /**
     * Entfernt den ersten Knoten der Liste und gibt dessen Datenelement zurück.
     *
     * @return Datenelement des ersten Knoten der Liste oder null wenn die Liste leer war
     */
    fun anfangEntfernen(): Datenelement? {
        val alterAnfang = anfang
        anfang = alterAnfang!!.nachfolgerGeben()
        return alterAnfang.datenelementGeben()
    }

    /**
     * Entfernt den letzten Knoten der Liste und gibt dessen Datenelement zurück.
     *
     * @return Datenelement des letzten Knoten der Liste oder null wenn die Liste leer war
     */
    fun endeEntfernen(): Datenelement? {
        val datenEnde = anfang!!.endeGeben(null)
        anfang = anfang!!.endeEntfernen(datenEnde)
        return datenEnde
    }

    /**
     * Sucht ein Datenelement mit einem gegebenen Schlüssel in der Liste und gibt das Datenelement gegebenenfalls zurück.
     *
     * @param schluessel    Schlüssel, nach dem gesucht werden soll
     * @return              Datenelement, das zum gegebenen Schlüssel passt, oder null
     * wenn kein passendes Datenelement gefunden werden konnte
     */
    fun suchen(schluessel: String?): Datenelement? {
        return anfang!!.suchen(schluessel)
    }

    /**
     * Gibt Informationen über sich selbst auf der Standardausgabe aus.
     */
    fun informationAusgeben() {
        anfang!!.informationAusgeben()
    }

    /**
     * Gibt die Länge der Liste bzw. die Anzahl aller Knoten in der Liste zurück.
     *
     * @return die Länge der Liste
     */
    fun laengeGeben(): Int {
        return anfang!!.restlaengeGeben()
    }

    override fun toString(): String {
        return "Liste($anfang)"
    }

    /**
     * Konstruiert eine leere Liste.
     */
    init {
        anfang = Abschluss()
    }
}