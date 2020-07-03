# ProgettoSWE
L'obiettivo di questo progetto è realizzare un software in Java per la gestione della vendita di prodotti attraverso una piattaforma.

Il cliente, interagendo con la con la piattaforma di interessa, crea un'ordine e successivamente sceglie il prodotto da inserire nella lista. A questo punto viene controllato l'abbonamento del cliente: se risulta essere cliente Base allora si prosegue alla scelta di prodotti a cui non è applicabile nessuna forma di sconto mentre se il cliente è di tipo Prime allora vi è un possibile sconto tra 10% e 30%. Se il prodotto è conforme con la tipologia di cliente allora viene inserito nell'ordine e calcolato il costo e il tempo di consegna del prodotto scelto. 
Dopodichè si hanno due casi, la scelta di un altro prodotto oppure la fine dell'ordine e il successivo calcolo per il costo totale, dove il tempo di consegna è il massimo tempo di consegna tra tutti i prodotti comprati.
Se il cliente è di tipo Prime si ha la possibilità di noleggiare serie tv o film tramite opportuna funzione noleggioVideo(Video vid) il cui costo si aggiunge al costo totale dell'ordine.

Nella fase iniziale di progettazione sono stati individuati i vari casi d'uso che sono stati riportati all'interno dello Use Case Diagram.

Insieme ai casi d'uso è stata definita la Class Diagram per la struttura dl progetto.

Per la realizzazione del progetto sono stati utilizzati tre design patterns: il design pattern comportamentale Visitor applicato alla classe Order rappresentante l'ordine dei prodotti da acquistare ; il design pattern comportamentale Observer tra la classe AClient che riveste il ruolo di ConcreteSubject e la classe Order, rappresentante l'ordine, che riveste invece il ruolo di ConcreteObserver e il design pattern strutturale State per la tipologia di prodotto che il cliente desidera acquistare a seconda dell'abbonamento di quest'ultimo, cioè se sia di tipo Base oppure Prime.

Si è venuta quindi a creare una rappresentazione dell'interazione tra cliente e una piattaforma di interesse dove i vari attributi relativi al cliente, all'ordine e ai prodotti sono inseriti manualmente nel codice Main del progetto.
